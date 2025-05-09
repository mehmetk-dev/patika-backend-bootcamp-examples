package hafta8.jdbc;

import java.io.FileInputStream;
import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.Properties;

public class TranscationMain {

    public static void main(String[] args) {

        Connection connection = null;

        try {
            Class.forName("org.postgresql.Driver");

            Properties properties = new Properties();
            FileInputStream fis = new FileInputStream("config.properties");
            properties.load(fis);

            String url = properties.getProperty("db.url");
            String user = properties.getProperty("db.username");
            String password = properties.getProperty("db.password");

            connection = DriverManager.getConnection(url,user,password);

            connection.setAutoCommit(false);

            PreparedStatement preparedStatement = connection.prepareStatement("update employees set salary = salary + 100 where employee_id = ?");
            preparedStatement.setInt(1,1);
            int row = preparedStatement.executeUpdate();

            PreparedStatement preparedStatement2 = connection.prepareStatement("update employees set salary = salary - 100 where employee_id = ?");
            preparedStatement.setInt(1,2);
            int row2 = preparedStatement.executeUpdate();

            connection.commit();

        } catch (ClassNotFoundException | IOException | SQLException e) {
            e.printStackTrace();
            try {
                connection.rollback();
            } catch (SQLException ex) {
                throw new RuntimeException(ex);
            }
        }finally {
            try {
                if (connection != null) {
                    connection.close();
                }
            } catch (SQLException e) {
                throw new RuntimeException(e);
            }
        }

    }
}
