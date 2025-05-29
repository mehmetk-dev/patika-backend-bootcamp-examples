package hafta8.jdbc.library.dao;

import hafta8.jdbc.library.model.Book;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.List;

public class BookDao {

    private Connection connection;

    public BookDao(Connection connection) {
        this.connection = connection;
    }

    public void save(Book book) {

        String sql = """
                INSERT INTO books(author_id,name) VALUES(?,?)
                """;

        try (PreparedStatement preparedStatement = connection.prepareStatement(sql)) {

            preparedStatement.setInt(1, book.getAuthor().getId());
            preparedStatement.setString(2, book.getTitle());
            preparedStatement.executeUpdate();
            System.out.println("Kayıt eklendi");
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    public void saveAll(List<Book> books) {
        books.forEach(this::save);
    }
}
