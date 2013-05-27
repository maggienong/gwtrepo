package com.timemanager.server;
 
import java.util.HashMap;
import java.util.List;

import com.google.gwt.user.server.rpc.RemoteServiceServlet;
import com.timemanager.client.TimeManagerService;
import com.timemanager.shared.CategoryDTO;
import com.timemanager.shared.DiaryEntryVw;
import com.timemanager.shared.TaskDTO;
import com.timemanager.shared.UserDTO;
import com.timemanager.shared.UserReference;
import com.timemanager.shared.util.CategoryDao;
import com.timemanager.shared.util.DiaryEntryDao;
import com.timemanager.shared.util.TaskDao;
import com.timemanager.shared.util.UserDao;

public class TimeManagerServiceImpl extends RemoteServiceServlet implements TimeManagerService {

	private static final long serialVersionUID = -6785254237120515117L; 

	@Override
	public List<DiaryEntryVw> getAllDiaryEntry(long user_id) {
		DiaryEntryDao dao = (DiaryEntryDao) SpringContext.getInstance().getBean("DiaryEntryDao");
		return dao.findAll(user_id); 
	}
 

	@Override
	public UserReference getUserReference(long user_id) {
		UserReference obj = new UserReference();
		UserDao dao = (UserDao) SpringContext.getInstance().getBean("UserDao");
		UserDTO user = dao.findById(user_id);
		if (user!= null) obj.setUser(user);
		HashMap<CategoryDTO,List<TaskDTO>> categoryMap = new HashMap();
		
		CategoryDao cat_dao = (CategoryDao) SpringContext.getInstance().getBean("CategoryDao");
		TaskDao task_dao = (TaskDao) SpringContext.getInstance().getBean("TaskDao");
		List<CategoryDTO> list = cat_dao.findAll(user_id);
		for (CategoryDTO cat:list) {
			List<TaskDTO> taskList = task_dao.findAll(user_id,cat.getId());
			if (taskList!=null && taskList.size()>0) categoryMap.put(cat, taskList);
		}
		obj.setCategoryMap(categoryMap);
		return obj;
	}

}
