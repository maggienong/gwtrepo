package com.timemanager.shared;

import java.io.Serializable;

public class CategoryDTO implements Serializable {
	/**
	 * 
	 */
	private static final long serialVersionUID = 663609564859956962L;
	private long id;
	private String description; 
	private long user_id;
	
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
	public long getUser_id() {
		return user_id;
	}
	public void setUser_id(long user_id) {
		this.user_id = user_id;
	}
	
	
}
