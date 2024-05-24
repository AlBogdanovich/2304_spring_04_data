package by.itclass._01_spring_jdbc;

import by.itclass._01_spring_jdbc.entities.User;
import org.springframework.jdbc.core.RowMapper;

import java.sql.ResultSet;
import java.sql.SQLException;

public class UserRowMapping implements RowMapper<User> {
    @Override
    public User mapRow(ResultSet rs, int rowNum) throws SQLException {
        var user = new User();
        user.setId(rs.getInt("id"));
        user.setFio(rs.getString("fio"));
        user.setAge(rs.getInt("age"));
        return user;
    }
}
