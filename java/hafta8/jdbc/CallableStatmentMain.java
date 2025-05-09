package hafta8.jdbc;

import java.io.FileInputStream;
import java.io.IOException;
import java.sql.CallableStatement;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.Properties;

public class CallableStatmentMain {

    public static void main(String[] args) throws IOException, SQLException {

        Properties properties = new Properties();
        FileInputStream fis = new FileInputStream("config.properties");
        properties.load(fis);

        String url = properties.getProperty("db.url");
        String username = properties.getProperty("db.username");
        String password = properties.getProperty("db.password");

        Connection connection = DriverManager.getConnection(url,username,password);

        CallableStatement callableStatmentMain = connection.prepareCall("CALL add_employee(?,?,?)");

        callableStatmentMain.setInt(1,10);
        callableStatmentMain.setInt(2,1);
        callableStatmentMain.setString(3,"mehmet");
        callableStatmentMain.execute();
        System.out.println("Çalışann kaydedildi");
    }
}
