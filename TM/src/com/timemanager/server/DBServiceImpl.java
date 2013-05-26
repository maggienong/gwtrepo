package com.timemanager.server;

import java.util.List;

import com.timemanager.shared.CategoryDTO;
import com.timemanager.shared.DiaryEntryDTO;
import com.timemanager.shared.TaskDTO;

public class DBServiceImpl implements  DBService{

	/* (non-Javadoc)
	 * @see com.timemanager.server.DBServices#getTaskById(java.lang.String)
	 */
	@Override
	public TaskDTO getTaskById(String id) {
		// TODO Auto-generated method stub
		return null;
	}

	/* (non-Javadoc)
	 * @see com.timemanager.server.DBServices#getTaskCategoryById(java.lang.String)
	 */
	@Override
	public CategoryDTO getTaskCategoryById(String id) {
		// TODO Auto-generated method stub
		return null;
	}

	/* (non-Javadoc)
	 * @see com.timemanager.server.DBServices#getDiaryEntryById(java.lang.String)
	 */
	@Override
	public DiaryEntryDTO getDiaryEntryById(String id) {
		// TODO Auto-generated method stub
		return null;
	}

	/* (non-Javadoc)
	 * @see com.timemanager.server.DBServices#getTaskByDesc(java.lang.String, java.lang.String)
	 */
	@Override
	public List<TaskDTO> getTaskByDesc(String user_id, String desc) {
		// TODO Auto-generated method stub
		return null;
	}

	/* (non-Javadoc)
	 * @see com.timemanager.server.DBServices#getAllTask(java.lang.String)
	 */
	@Override
	public List<TaskDTO> getAllTask(String user_id) {
		// TODO Auto-generated method stub
		return null;
	}

	/* (non-Javadoc)
	 * @see com.timemanager.server.DBServices#getCategoryByDesc(java.lang.String, java.lang.String)
	 */
	@Override
	public List<CategoryDTO> getCategoryByDesc(String user_id, String desc) {
		// TODO Auto-generated method stub
		return null;
	}

	/* (non-Javadoc)
	 * @see com.timemanager.server.DBServices#getAllCategory(java.lang.String)
	 */
	@Override
	public List<CategoryDTO> getAllCategory(String user_id) {
		// TODO Auto-generated method stub
		return null;
	}

	/* (non-Javadoc)
	 * @see com.timemanager.server.DBServices#saveTask(com.timemanager.shared.TaskDTO)
	 */
	@Override
	public boolean saveTask(TaskDTO dto) {
		// TODO Auto-generated method stub
		return false;
	}

	/* (non-Javadoc)
	 * @see com.timemanager.server.DBServices#saveCategory(com.timemanager.shared.CategoryDTO)
	 */
	@Override
	public boolean saveCategory(CategoryDTO dto) {
		// TODO Auto-generated method stub
		return false;
	}

	/* (non-Javadoc)
	 * @see com.timemanager.server.DBServices#saveDiaryEntry(com.timemanager.shared.DiaryEntryDTO)
	 */
	@Override
	public boolean saveDiaryEntry(DiaryEntryDTO dto) {
		// TODO Auto-generated method stub
		return false;
	}

}
