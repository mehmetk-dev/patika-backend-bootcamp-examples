package hafta8.jdbc.practices;

import java.io.FileInputStream;
import java.io.IOException;
import java.sql.*;
import java.util.Properties;

public class Crud {

    public static void main(String[] args) {

        Connection connection = null;

        try{
            Class.forName("org.postgresql.Driver");

            Properties properties = new Properties();
            FileInputStream fis = new FileInputStream("config.properties");
            properties.load(fis);

            String url = properties.getProperty("db.url");
            String user = properties.getProperty("db.username");
            String password = properties.getProperty("db.password");

            connection = DriverManager.getConnection(url,user,password);


            updateEmployee(connection,"mehmeeeet",1);
            deleteEmployee(connection,1);

            readEmployees(connection);
        } catch (RuntimeException | IOException | ClassNotFoundException | SQLException e) {
            e.printStackTrace();
        }

    }

    private static void deleteEmployee(Connection connection, int id) {

        String sql = """
                delete from employees where employee_id = ?;
                """;

        try(PreparedStatement preparedStatement = connection.prepareStatement(sql)) {

            preparedStatement.setInt(1,id);

            preparedStatement.executeUpdate();
            System.out.println("Kullanıcı silindi.");

        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }

    private static void updateEmployee(Connection connection,String newName,int id) {

        String sql = """
                        update employees set first_name = ? where employee_id = ?;
                """;

        try(PreparedStatement preparedStatement = connection.prepareStatement(sql)){

            preparedStatement.setString(1,newName);
            preparedStatement.setInt(2,id);
            preparedStatement.executeUpdate();

            System.out.println("Çalışan ismi " + newName + " olarak güncellendi.");
        } catch (SQLException e) {
            e.printStackTrace();
        }

    }

    private static void readEmployees(Connection connection) {

        String sql = """
                select employee_id,first_name,d.department_name from employees e left join departments d on  e.department_id = d.department_id;
                """;

        try(Statement statement = connection.createStatement()){

            ResultSet resultSet = statement.executeQuery(sql);

            System.out.println("Çalışan listesi");

            while (resultSet.next()){
                System.out.printf("ID: %d İsim: %s Departman: %s %n",
                        resultSet.getInt("employee_id"),
                        resultSet.getString("first_name"),
                        resultSet.getString("department_name"));
            }

        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }
}
