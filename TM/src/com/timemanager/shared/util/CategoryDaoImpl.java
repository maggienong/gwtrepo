package com.timemanager.shared.util;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;

import com.timemanager.shared.CategoryDTO;

public class CategoryDaoImpl  implements CategoryDao{
	@Autowired
	private JdbcTemplate jdbcTemplate;
	
	@Override
	public CategoryDTO insert(CategoryDTO dto) {
		jdbcTemplate.update("insert into Category(user_id,description) values(?,?)",
				new Object[] { dto.getUser_id(), dto.getDescription() });
		List<CategoryDTO> list = findAllByDesc(dto.getUser_id(), dto.getDescription());
		if (list!=null && list.size()>0) return list.get(0);
		return null;
	}
	
	@Override
	public int delete(long id) {
		int i = jdbcTemplate.update("delete from Category where id = ? ",  new Object[] { id });
		return i;
	}
	
	@Override
	public CategoryDTO findById(long id) {
		String sql = "select * from Category where id = ?"; 
		CategoryDTO dto = (CategoryDTO)jdbcTemplate.queryForObject( sql, new Object[] { id }, new CategorykMapper()); 
		return dto;
	}
	
	@Override
	public List<CategoryDTO> findAll(long user_id) {
		return jdbcTemplate.query( "select * from Category where user_id = ? ", new Object[] { user_id }, new CategorykMapper()); 
	}
	
	private static final class CategorykMapper implements RowMapper { 
		public Object mapRow(ResultSet rs, int rowNum) throws SQLException {
			CategoryDTO category = new CategoryDTO(); 
			category.setId(rs.getLong("id"));
			category.setUser_id(rs.getLong("user_id"));
			category.setDescription(rs.getString("description"));
			return category;
		}
	}

	@Override
	public List<CategoryDTO> findAllByDesc(long user_id, String desc) {
		return jdbcTemplate.query( "select * from Category where user_id = ? and description=? order by id desc "
				, new Object[] { user_id, desc }, new CategorykMapper()); 
	}
}
