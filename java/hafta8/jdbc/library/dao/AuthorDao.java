package hafta8.jdbc.library.dao;

import hafta8.jdbc.library.model.Author;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.List;

public class AuthorDao {

    private Connection connection;

    public AuthorDao(Connection connection) {
        this.connection = connection;
    }

    public void save(Author author) {

        String sql = """
                INSERT INTO authors(name) values(?)
                """;

        try (PreparedStatement preparedStatement = connection.prepareStatement(sql)) {

            preparedStatement.setString(1, author.getName());
            preparedStatement.executeUpdate();
            System.out.println("Yazar eklendi.");
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    public void saveAll(List<Author> authors) {

        authors.forEach(this::save);
    }
}
