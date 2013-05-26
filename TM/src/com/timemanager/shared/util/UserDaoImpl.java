package com.timemanager.shared.util;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;

import javax.sql.DataSource;
 
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;

import com.timemanager.shared.UserDTO;

public class UserDaoImpl implements UserDao{
	@Autowired
	private JdbcTemplate jdbcTemplate;
	
	 
	@Override
	public void insert(UserDTO dto) {
		jdbcTemplate.update("insert into User(name,email,password) values(?,?,?)",
		        new Object[] { dto.getName(), dto.getEmail(), dto.getPassword() });
	}
	
	@Override
	public int delete(long id) { 
		int i = jdbcTemplate.update("delete from User where id = ? ?",  new Object[] { id });
		return i;
	}
	
	@Override
	public UserDTO findById(long id) {
		String sql = "select * from user where id = ?";
		 
		UserDTO user = (UserDTO)jdbcTemplate.queryForObject( sql, new Object[] { id }, new UserMapper());

		return user;
	}
	
	@Override
	public List<UserDTO> findAll() {
		return jdbcTemplate.query( "select * from User", new UserMapper()); 
	}

	private static final class UserMapper implements RowMapper { 
		public Object mapRow(ResultSet rs, int rowNum) throws SQLException {
			UserDTO user = new UserDTO(); 
			user.setId(rs.getLong("id"));
			user.setEmail(rs.getString("email"));
			user.setName(rs.getString("name"));
			user.setPassword(rs.getString("password"));
			return user;
		}
	}
}
