package com.timemanager.shared.util;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Date;
import java.util.List;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;

import com.timemanager.shared.DiaryEntryDTO;
import com.timemanager.shared.DiaryEntryVw;

public class DiaryEntryDaoImpl implements DiaryEntryDao{
	@Autowired
	private JdbcTemplate jdbcTemplate;
	
	@Override
	public void insert(DiaryEntryDTO dto) {
		jdbcTemplate.update("insert into DiaryEntry(user_id,category_id,task_id,duration,start_date,end_date,update_date) values(?,?,?,?,?,?,now())",
				new Object[] { dto.getUser_id(), dto.getCategory_id(), dto.getTask_id(),dto.getDuration(),dto.getStart_time(),dto.getEnd_time() });
	}
	@Override
	public int delete(long id) {
		int i = jdbcTemplate.update("delete from DiaryEntry where id = ? ?",  new Object[] { id });
		return i;
	}
	@Override
	public DiaryEntryVw findById(long id) {
		String sql = "select a.*,t.description as task,c.description as category, u.name as name " 
				+ "from DiaryEntry a, Task t,Category c, User u where a.id = ? and a.user_id = u.id and a.task_id = t.id and a.category_id = c.id";
		DiaryEntryVw dto = (DiaryEntryVw)jdbcTemplate.queryForObject( sql, new Object[] { id }, new DiaryEntryMapper()); 
		return dto;
	}
	@Override
	public List<DiaryEntryVw> findAll(long user_id, Date fromDate, Date toDate) {
		return jdbcTemplate.query( "select a.*,t.description as task,c.description as category, u.name as name " 
				+ " from DiaryEntry a, Task t,Category c, User u where a.user_id = ? and a.user_id = u.id and a.task_id = t.id and a.category_id = c.id"
				+ " and update_date>= ? and update_date<= ADDDATE(?,1)"
				, new Object[] { user_id, fromDate, toDate }, new DiaryEntryMapper()); 
	}
	
	private static final class DiaryEntryMapper implements RowMapper { 
		public Object mapRow(ResultSet rs, int rowNum) throws SQLException {
			DiaryEntryVw vw = new DiaryEntryVw();
			DiaryEntryDTO diaryEntry = new DiaryEntryDTO(); 
			diaryEntry.setId(rs.getLong("id"));
			diaryEntry.setUser_id(rs.getLong("user_id"));
			diaryEntry.setCategory_id(rs.getLong("category_id"));
			diaryEntry.setTask_id(rs.getLong("task_id"));
			diaryEntry.setDuration(rs.getDouble("duration"));
			diaryEntry.setStart_time(rs.getTimestamp("start_date"));
			diaryEntry.setEnd_time(rs.getTimestamp("end_date"));
			diaryEntry.setEntry_date(rs.getTimestamp("update_date"));
			
			vw.setDiaryEntry(diaryEntry);
			vw.setUser_name(rs.getString("name"));
			vw.setTask(rs.getString("task"));
			vw.setCategory(rs.getString("category"));
			
			return vw;
		}
	}
} 
