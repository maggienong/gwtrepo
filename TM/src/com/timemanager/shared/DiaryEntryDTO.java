package com.timemanager.shared;

import java.io.Serializable;
import java.sql.Timestamp;

public class DiaryEntryDTO implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 7129491589301170876L;
	private long id;
	private Timestamp entry_date;
	private long task_id;
	private long category_id;
	private long user_id;
	private double duration;
	private Timestamp start_time;
	private Timestamp end_time;


	public long getCategory_id() {
		return category_id;
	}
	public void setCategory_id(long category_id) {
		this.category_id = category_id;
	}
	public void setTask_id(long task_id) {
		this.task_id = task_id;
	}
	public void setUser_id(long user_id) {
		this.user_id = user_id;
	}
	public Timestamp getEntry_date() {
		return entry_date;
	}
	public void setEntry_date(Timestamp entry_date) {
		this.entry_date = entry_date;
	}
	public long getId() {
		return id;
	}
	public void setId(long id) {
		this.id = id;
	} 
	public double getDuration() {
		return duration;
	}
	public void setDuration(double duration) {
		this.duration = duration;
	}
	public Timestamp getStart_time() {
		return start_time;
	}
	public void setStart_time(Timestamp start_time) {
		this.start_time = start_time;
	}
	public Timestamp getEnd_time() {
		return end_time;
	}
	public void setEnd_time(Timestamp end_time) {
		this.end_time = end_time;
	}
	public long getTask_id() {
		return task_id;
	}
	public long getUser_id() {
		return user_id;
	} 

}
