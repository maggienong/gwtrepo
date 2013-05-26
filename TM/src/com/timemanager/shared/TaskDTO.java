package com.timemanager.shared;

import java.io.Serializable;

public class TaskDTO implements Serializable {
	/**
	 * 
	 */
	private static final long serialVersionUID = -5881751233136919696L;
	private long id;
	private long user_id;
	private String description;
	private long category_id;
	
	public long getId() {
		return id;
	}
	public void setId(long id) {
		this.id = id;
	}
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}
	public long getCategory_id() {
		return category_id;
	}
	public void setCategory_id(long category_id) {
		this.category_id = category_id;
	}
	public long getUser_id() {
		return user_id;
	}
	public void setUser_id(long user_id) {
		this.user_id = user_id;
	}
	
	
}
