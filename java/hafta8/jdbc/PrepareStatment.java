package hafta8.jdbc;

import java.io.FileInputStream;
import java.io.IOException;
import java.sql.*;
import java.util.Properties;

public class PrepareStatment {

    public static void main(String[] args) throws ClassNotFoundException, IOException, SQLException {

        Class.forName("org.postgresql.Driver");

        Properties properties = new Properties();
        FileInputStream fis = new FileInputStream("config.properties");

        properties.load(fis);

        String url = properties.getProperty("db.url");
        String user = properties.getProperty("db.username");
        String password = properties.getProperty("db.password");

        Connection connection = DriverManager.getConnection(url, user, password);

        String findEmployee = "SELECT * FROM employees WHERE employee_id = ?";

        PreparedStatement prepareStatment = connection.prepareStatement(findEmployee);
        prepareStatment.setInt(1, 1);

        ResultSet rs = prepareStatment.executeQuery();
//        boolean execute = prepareStatment.execute();
//        int i = prepareStatment.executeUpdate();

        while (rs.next()) {
            String name = rs.getString("first_name");
            System.out.println(name);
        }
    }


}
