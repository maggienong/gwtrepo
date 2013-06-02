package com.timemanager.shared.util;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;
import com.timemanager.shared.TaskDTO;

public class TaskDaoImpl implements TaskDao{
	@Autowired
	private JdbcTemplate jdbcTemplate;

	@Override
	public TaskDTO insert(TaskDTO dto) {
		int obj = jdbcTemplate.update("insert into Task(user_id,category_id,description) values(?,?,?)",
				new Object[] { dto.getUser_id(), dto.getCategory_id(), dto.getDescription() });
		List<TaskDTO> list = findAllByDesc(dto.getUser_id(),dto.getCategory_id(), dto.getDescription());
		if (list!=null && list.size()>0) return list.get(0);
		return null;
	}
	
	@Override
	public int delete(long id) {
		int i = jdbcTemplate.update("delete from Task where id = ? ",  new Object[] { id });
		return i;
	}
	
	@Override
	public TaskDTO findById(long id) {
		String sql = "select * from Task where id = ?"; 
		TaskDTO dto = (TaskDTO)jdbcTemplate.queryForObject( sql, new Object[] { id }, new TaskMapper()); 
		return dto;
	}
	
	@Override
	public List<TaskDTO> findAll(long user_id,long category_id) {
		return jdbcTemplate.query( "select * from Task where user_id = ? and category_id = ? "
				, new Object[] { user_id , category_id}, new TaskMapper()); 
	}
	
	private static final class TaskMapper implements RowMapper { 
		public Object mapRow(ResultSet rs, int rowNum) throws SQLException {
			TaskDTO task = new TaskDTO(); 
			task.setId(rs.getLong("id"));
			task.setUser_id(rs.getLong("user_id"));
			task.setCategory_id(rs.getLong("category_id"));
			task.setDescription(rs.getString("description"));
			return task;
		}
	}

	@Override
	public List<TaskDTO> findAllByDesc(long user_id, long category_id, String desc) {
		return jdbcTemplate.query( "select * from Task where user_id = ? and category_id = ? and description=? order by id desc  "
				, new Object[] { user_id , category_id, desc}, new TaskMapper()); 
	}

	@Override
	public int deleteByCategory(long id) {
		int i = jdbcTemplate.update("delete from Task where category_id = ? ",  new Object[] { id });
		return i;
	}
}
