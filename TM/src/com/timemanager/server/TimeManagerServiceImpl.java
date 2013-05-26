package com.timemanager.server;

import java.util.ArrayList;
import java.util.List;

import com.google.gwt.user.server.rpc.RemoteServiceServlet;
import com.timemanager.client.TimeManagerService;
import com.timemanager.shared.DiaryEntryVw;
import com.timemanager.shared.util.DiaryEntryDao;

public class TimeManagerServiceImpl extends RemoteServiceServlet implements TimeManagerService {

	private static final long serialVersionUID = -6785254237120515117L;

	 

	@Override
	public List<DiaryEntryVw> getAllDiaryEntry(long user_id) {
		DiaryEntryDao dao = (DiaryEntryDao) SpringContext.getInstance().getBean("DiaryEntryDao");
		return dao.findAll(user_id); 
	}

}
