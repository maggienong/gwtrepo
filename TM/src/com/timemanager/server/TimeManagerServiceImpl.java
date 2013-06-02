package com.timemanager.server;

import java.util.Date;
import java.util.HashMap;
import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

import com.google.gwt.user.server.rpc.RemoteServiceServlet;
import com.timemanager.client.TimeManagerService;
import com.timemanager.shared.CategoryDTO;
import com.timemanager.shared.DiaryEntryDTO;
import com.timemanager.shared.DiaryEntryVw;
import com.timemanager.shared.SessionTimeoutException;
import com.timemanager.shared.TaskDTO;
import com.timemanager.shared.UserDTO;
import com.timemanager.shared.UserReference;
import com.timemanager.shared.util.CategoryDao;
import com.timemanager.shared.util.DiaryEntryDao;
import com.timemanager.shared.util.TaskDao;
import com.timemanager.shared.util.UserDao;

public class TimeManagerServiceImpl extends AbstractServicesImpl implements TimeManagerService {

	private static final long serialVersionUID = -6785254237120515117L; 
 

	@Override
	public UserReference getUserReference() {
		UserReference obj = new UserReference();
		UserDao dao = (UserDao) SpringContext.getInstance().getBean("UserDao");
		UserDTO user = dao.findById(getUserId());
		if (user!= null) obj.setUser(user);
		HashMap<CategoryDTO,List<TaskDTO>> categoryMap = new HashMap();

		CategoryDao cat_dao = (CategoryDao) SpringContext.getInstance().getBean("CategoryDao");
		TaskDao task_dao = (TaskDao) SpringContext.getInstance().getBean("TaskDao");
		List<CategoryDTO> list = cat_dao.findAll(getUserId());
		for (CategoryDTO cat:list) {
			List<TaskDTO> taskList = task_dao.findAll(getUserId(),cat.getId());
			if (taskList!=null && taskList.size()>0) categoryMap.put(cat, taskList);
		}
		obj.setCategoryMap(categoryMap);
		return obj;
	}


	@Override
	public void addNewDiaryEntry(DiaryEntryDTO dto) {
		DiaryEntryDao dao = (DiaryEntryDao) SpringContext.getInstance().getBean("DiaryEntryDao");
		if (dto!=null) {
			dto.setUser_id(getUserId());
			dao.insert(dto);
		}
		return;
	}


	@Override
	public CategoryDTO addCategory(CategoryDTO dto) { 
		CategoryDao dao = (CategoryDao) SpringContext.getInstance().getBean("CategoryDao");
		if (dto!=null) {
			dto.setUser_id(getUserId());
			CategoryDTO newdto = dao.insert(dto);
			return newdto;
		}
		return null;
	}


	@Override
	public List<CategoryDTO> getCategoryByUser() {
		CategoryDao dao = (CategoryDao) SpringContext.getInstance().getBean("CategoryDao");

		List<CategoryDTO> list = dao.findAll(getUserId());
		return list;
	}


	@Override
	public TaskDTO addTask(TaskDTO dto){
		TaskDao dao = (TaskDao) SpringContext.getInstance().getBean("TaskDao");
		if (dto!=null) {
			dto.setUser_id(getUserId());
			TaskDTO newdto = dao.insert(dto);
			return newdto;
		}
		return null;
	}


	@Override
	public List<TaskDTO> getTaskByUserCategory(long category_id) {
		TaskDao dao = (TaskDao) SpringContext.getInstance().getBean("TaskDao");
		List<TaskDTO> list = dao.findAll(getUserId(), category_id);
		return list;
	}

	@Override
	public void delteCategory(CategoryDTO dto) {
		CategoryDao dao = (CategoryDao) SpringContext.getInstance().getBean("CategoryDao");
		dao.delete(dto.getId());
		TaskDao dao1 = (TaskDao) SpringContext.getInstance().getBean("TaskDao");
		dao1.deleteByCategory(dto.getId());
	}


	@Override
	public void delteTask(TaskDTO dto) {
		TaskDao dao = (TaskDao) SpringContext.getInstance().getBean("TaskDao");
		dao.delete(dto.getId());
	}


	@Override
	public List<DiaryEntryVw> getAllDiaryEntry(Date fromDate, Date toDate) {
		DiaryEntryDao dao = (DiaryEntryDao) SpringContext.getInstance().getBean("DiaryEntryDao");
		return dao.findAll(getUserId(), fromDate, toDate); 
	}
}
