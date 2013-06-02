package com.timemanager.shared.util;

import java.util.List;

import com.timemanager.shared.TaskDTO;

public interface TaskDao {
	public TaskDTO insert(TaskDTO dto);
	public int delete(long id);
	public TaskDTO findById(long id);
	public List<TaskDTO> findAll(long user_id, long categor_id);
	public List<TaskDTO> findAllByDesc(long user_id, long categor_id, String desc);
	public int deleteByCategory(long id);
}
