package com.timemanager.shared;
 
import java.io.Serializable;
import java.util.List;
import java.util.Map;


public class UserReference implements Serializable {
	/**
	 * 
	 */
	private static final long serialVersionUID = 8765839879379057970L;
	private UserDTO user;
	private Map<CategoryDTO,List<TaskDTO>> categoryMap; 
	public UserDTO getUser() {
		return user;
	}
	public void setUser(UserDTO user) {
		this.user = user;
	}
	public Map<CategoryDTO, List<TaskDTO>> getCategoryMap() {
		return categoryMap;
	}
	public void setCategoryMap(Map<CategoryDTO, List<TaskDTO>> categoryMap) {
		this.categoryMap = categoryMap;
	}
}
