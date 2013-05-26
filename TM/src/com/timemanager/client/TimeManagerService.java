package com.timemanager.client;

import java.util.List;

import com.google.gwt.user.client.rpc.RemoteService;
import com.google.gwt.user.client.rpc.RemoteServiceRelativePath;
import com.timemanager.shared.DiaryEntryVw;

@RemoteServiceRelativePath("TMService")
public interface TimeManagerService extends RemoteService { 
	 
	List<DiaryEntryVw> getAllDiaryEntry(long user_id);
	 
	
}
