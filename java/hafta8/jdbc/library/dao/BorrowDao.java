package hafta8.jdbc.library.dao;

import hafta8.jdbc.library.model.Author;
import hafta8.jdbc.library.model.Book;
import hafta8.jdbc.library.model.Borrow;
import hafta8.jdbc.library.model.Member;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class BorrowDao {

    private Connection connection;

    public BorrowDao(Connection connection) {
        this.connection = connection;
    }

    public void save(Borrow borrow) {
        String sql = """
                INSERT INTO borrows(member_id, book_id) VALUES(?,?)
                """;

        try (PreparedStatement preparedStatement = connection.prepareStatement(sql)) {
            preparedStatement.setInt(1, borrow.getMember().getId());
            preparedStatement.setInt(2, borrow.getBook().getId());
            preparedStatement.executeUpdate();
            System.out.println("Borrow Tablosuna kayıt edildi");
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    public List<Borrow> getBorrowByMemberId(int memberId) {

        String sql = """
                SELECT br.id as borrow_id,
                bo.id as book_id, 
                bo.name as book_title, 
                au.id as author_id, 
                au.name as author_name,
                mb.name as member_name, 
                br.borrow_date as borrow_date
                FROM borrows br
                JOIN books bo ON br.book_id = bo.id
                JOIN authors au ON bo.author_id = au.id
                JOIN members mb ON br.member_id = mb.id
                WHERE mb.id = ?
                """;

        List<Borrow> borrows = new ArrayList<>();

        try (PreparedStatement preparedStatement = connection.prepareStatement(sql)) {
            preparedStatement.setInt(1, memberId);
            ResultSet resultset = preparedStatement.executeQuery();

            while (resultset.next()) {
                int borrowID = resultset.getInt("borrow_id");
                int bookId = resultset.getInt("book_id");
                String bookTitle = resultset.getString("book_title");
                int authorId = resultset.getInt("author_id");
                String authorName = resultset.getString("author_name");
                String memberName = resultset.getString("member_name");

                Author author = new Author(authorId, authorName);
                Book book = new Book(bookId, bookTitle, author);
                Member member = new Member(memberId, memberName);
                Borrow borrow = new Borrow(member, book);
                borrow.setId(borrowID);

                borrows.add(borrow);

            }
        } catch (SQLException e) {
            e.printStackTrace();
        }

        return borrows;
    }

    public void saveALL(List<Borrow> borrows) {

        borrows.forEach(this::save);
    }
}
