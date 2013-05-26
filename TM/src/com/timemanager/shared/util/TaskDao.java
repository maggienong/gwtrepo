package com.timemanager.shared.util;

import java.util.List;

import com.timemanager.shared.TaskDTO;

public interface TaskDao {
	public void insert(TaskDTO dto);
	public int delete(long id);
	public TaskDTO findById(long id);
	public List<TaskDTO> findAll(long user_id);
}
