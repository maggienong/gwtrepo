package com.timemanager.client;

import java.util.Date;
import java.util.List;

import com.google.gwt.user.client.rpc.RemoteService;
import com.google.gwt.user.client.rpc.RemoteServiceRelativePath;
import com.timemanager.shared.CategoryDTO;
import com.timemanager.shared.DiaryEntryDTO;
import com.timemanager.shared.DiaryEntryVw;
import com.timemanager.shared.TaskDTO;
import com.timemanager.shared.UserReference;

@RemoteServiceRelativePath("TMService")
public interface TimeManagerService extends RemoteService { 
	 
	List<DiaryEntryVw> getAllDiaryEntry(Date fromDate, Date toDate);
	
	UserReference getUserReference();

	void addNewDiaryEntry(DiaryEntryDTO dto);

	CategoryDTO addCategory(CategoryDTO dto);

	List<CategoryDTO> getCategoryByUser();

	TaskDTO addTask(TaskDTO dto);

	List<TaskDTO> getTaskByUserCategory(long category_id);

	void delteCategory(CategoryDTO dto);

	void delteTask(TaskDTO dto);
 
	
}
