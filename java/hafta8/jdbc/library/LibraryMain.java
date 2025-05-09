package hafta8.jdbc.library;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class LibraryMain {

    public static void main(String[] args) {

        String url = "jdbc:postgresql://localhost:5432/Library";
        String username = "postgres";
        String password = "mehmet619";

        try(Connection connection = DriverManager.getConnection(url,username,password)){

        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }
}
