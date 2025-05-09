package hafta8.jdbc.library;

import hafta8.jdbc.library.dao.AuthorDao;
import hafta8.jdbc.library.dao.BookDao;
import hafta8.jdbc.library.dao.BorrowDao;
import hafta8.jdbc.library.dao.MemberDao;
import hafta8.jdbc.library.model.Author;
import hafta8.jdbc.library.model.Book;
import hafta8.jdbc.library.model.Borrow;
import hafta8.jdbc.library.model.Member;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class LibraryMain {

    public static void main(String[] args) {

        String url = "jdbc:postgresql://localhost:5432/Library";
        String username = "postgres";
        String password = "mehmet619";

        try(Connection connection = DriverManager.getConnection(url,username,password)){

            System.out.println("Veritabanı bağlantısı gerçekleştirildi.");

            Member member1 = new Member(1,"mehmet");
            Member member2 = new Member(2,"ali");
            Member member3 = new Member(3,"veli");
            List<Member> members = new ArrayList<>();
            members.add(member2);
            members.add(member3);
            members.add(member1);
            MemberDao memberDao = new MemberDao(connection);
//            memberDao.save(member1);
//            memberDao.saveAll(members);

            Author author1 = new Author(1,"Mehmet");
            Author author2 = new Author(2,"Ali");
            Author author3 = new Author(3,"Veli");
            List<Author> authors = List.of(author1,author2,author3);
            AuthorDao authorDao = new AuthorDao(connection);
            //authorDao.saveAll(authors);


            Book book = new Book(1,"Yaralı kuşlar",author1);
            BookDao bookDao = new BookDao(connection);
//            bookDao.save(book);


            Borrow borrow = new Borrow(3,member1,book, LocalDate.now());
            BorrowDao borrowDao = new BorrowDao(connection);
//            borrowDao.save(borrow);

            List <Borrow> borrowList = borrowDao.getBorrowByMemberId(member1.getId());

            for(Borrow borrow1 : borrowList){
                System.out.printf("- %s (%s), Ödünç alınma tarihi: %s %n",
                        borrow1.getBook().getTitle(),
                        borrow1.getBook().getAuthor().getName(),
                        borrow.getBorrowDate());
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
}
