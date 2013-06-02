package com.timemanager.client;

import java.util.Date;
import java.util.List;

import com.google.gwt.user.client.rpc.AsyncCallback;
import com.timemanager.shared.CategoryDTO;
import com.timemanager.shared.DiaryEntryDTO;
import com.timemanager.shared.DiaryEntryVw;
import com.timemanager.shared.TaskDTO;
import com.timemanager.shared.UserReference;

public interface TimeManagerServiceAsync { 

	void getAllDiaryEntry(Date fromDate, Date toDate, AsyncCallback<List<DiaryEntryVw>> callback);

	void getUserReference(AsyncCallback<UserReference> callback); 

	void addNewDiaryEntry(DiaryEntryDTO dto, AsyncCallback<Void> callback);

	void addCategory(CategoryDTO dto, AsyncCallback<CategoryDTO> callback);

	void getCategoryByUser(AsyncCallback<List<CategoryDTO>> callback);

	void addTask(TaskDTO dto, AsyncCallback<TaskDTO> callback);
	
	void getTaskByUserCategory(long category_id, AsyncCallback<List<TaskDTO>> callback);

	void delteCategory(CategoryDTO dto, AsyncCallback<Void> callback);

	void delteTask(TaskDTO dto, AsyncCallback<Void> callback);
}
