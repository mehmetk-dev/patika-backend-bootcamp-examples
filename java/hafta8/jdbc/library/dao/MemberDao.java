package hafta8.jdbc.library.dao;

import hafta8.jdbc.library.model.Member;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.List;

public class MemberDao {

    private Connection connection;

    public MemberDao(Connection connection) {
        this.connection = connection;
    }

    public void save(Member member){

        String sql = """
                    INSERT INTO members(name)  VALUES(?)
                """;

        try(PreparedStatement ps = connection.prepareStatement(sql)){

            ps.setString(1, member.getName());
            ps.executeUpdate();
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }

    }
    public void saveAll(List<Member> members){

        members.forEach(this::save);
    }
}
