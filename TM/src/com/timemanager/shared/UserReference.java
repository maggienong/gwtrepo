package com.timemanager.shared;
 
import java.util.HashMap;


public class UserReference {
	private UserDTO user;
	private HashMap<Integer,CategoryDTO> categoryMap;
	private HashMap<Integer,TaskDTO> taskMap;
	public UserDTO getUser() {
		return user;
	}
	public void setUser(UserDTO user) {
		this.user = user;
	}
	public HashMap<Integer, CategoryDTO> getCategoryMap() {
		return categoryMap;
	}
	public void setCategoryMap(HashMap<Integer, CategoryDTO> categoryMap) {
		this.categoryMap = categoryMap;
	}
	public HashMap<Integer, TaskDTO> getTaskMap() {
		return taskMap;
	}
	public void setTaskMap(HashMap<Integer, TaskDTO> taskMap) {
		this.taskMap = taskMap;
	}
 
	 
}
