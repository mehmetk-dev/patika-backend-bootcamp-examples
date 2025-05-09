package hafta8.jdbc.library;

import hafta8.jdbc.library.dao.MemberDao;
import hafta8.jdbc.library.model.Book;
import hafta8.jdbc.library.model.Member;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class LibraryMain {

    public static void main(String[] args) {

        String url = "jdbc:postgresql://localhost:5432/Library";
        String username = "postgres";
        String password = "mehmet619";

        try(Connection connection = DriverManager.getConnection(url,username,password)){

            System.out.println("Veritabanı bağlantısı gerçekleştirildi.");

            Member member1 = new Member("mehmet");
            Member member2 = new Member("ali");
            Member member3 = new Member("veli");
            List<Member> members = new ArrayList<>();
            members.add(member2);
            members.add(member3);
            members.add(member1);


            MemberDao memberDao = new MemberDao(connection);
            memberDao.save(member1);

            memberDao.saveAll(members);




        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }
}
