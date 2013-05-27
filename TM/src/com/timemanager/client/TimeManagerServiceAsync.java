package com.timemanager.client;

import java.util.List;

import com.google.gwt.user.client.rpc.AsyncCallback;
import com.timemanager.shared.DiaryEntryDTO;
import com.timemanager.shared.DiaryEntryVw;
import com.timemanager.shared.TaskDTO;
import com.timemanager.shared.UserReference;

public interface TimeManagerServiceAsync { 

	void getAllDiaryEntry(long user_id,
			AsyncCallback<List<DiaryEntryVw>> callback);

	void getUserReference(long user_id, AsyncCallback<UserReference> callback);
}
