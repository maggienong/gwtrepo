package com.timemanager.server;

import java.util.List;

import com.timemanager.shared.CategoryDTO;
import com.timemanager.shared.DiaryEntryDTO;
import com.timemanager.shared.TaskDTO;

public interface DBService {

	public abstract TaskDTO getTaskById(String id);

	public abstract CategoryDTO getTaskCategoryById(String id);

	public abstract DiaryEntryDTO getDiaryEntryById(String id);

	public abstract List<TaskDTO> getTaskByDesc(String user_id, String desc);

	public abstract List<TaskDTO> getAllTask(String user_id);

	public abstract List<CategoryDTO> getCategoryByDesc(String user_id,
			String desc);

	public abstract List<CategoryDTO> getAllCategory(String user_id);

	public abstract boolean saveTask(TaskDTO dto);

	public abstract boolean saveCategory(CategoryDTO dto);

	public abstract boolean saveDiaryEntry(DiaryEntryDTO dto);

}