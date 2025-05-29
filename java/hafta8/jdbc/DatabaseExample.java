package hafta8.jdbc;

import java.io.FileInputStream;
import java.io.IOException;
import java.sql.*;
import java.util.Properties;

public class DatabaseExample {


    public static void main(String[] args) throws SQLException, ClassNotFoundException, IOException {

        Class.forName("org.postgresql.Driver");

        Properties properties = new Properties();
        FileInputStream fis = new FileInputStream("config.properties");
        properties.load(fis);

        String url = properties.getProperty("db.url");
        String user = properties.getProperty("db.username");
        String password = properties.getProperty("db.password");

        Connection connection = DriverManager.getConnection(url, user, password);

        Statement statement = connection.createStatement();

        ResultSet resultSet = statement.executeQuery("select * from employees");

        while (resultSet.next()) {
            int id = resultSet.getInt("employee_id");
            int department_id = resultSet.getInt("department_id");
            double salary = resultSet.getDouble("salary");
            String name = resultSet.getString("first_name");
            String lastName = resultSet.getString("last_name");
            String date = resultSet.getString("hire_date");
            System.out.println(id + " " + name + " " + lastName + " " + department_id + " " + salary + " " + date);
        }

        System.out.println("Current working directory: " + System.getProperty("user.dir"));
    }
}
