package com.timemanager.shared;

import java.io.Serializable;
import java.util.Date;
 

public class DiaryEntryVw implements Serializable {
	private DiaryEntryDTO diaryEntry;
	private String user_name;
	private String task;
	private String category;
	public DiaryEntryDTO getDiaryEntry() {
		return diaryEntry;
	}
	public void setDiaryEntry(DiaryEntryDTO diaryEntry) {
		this.diaryEntry = diaryEntry;
	}
	public String getUser_name() {
		return user_name;
	}
	public void setUser_name(String user_name) {
		this.user_name = user_name;
	}
	public String getTask() {
		return task;
	}
	public void setTask(String task) {
		this.task = task;
	}
	public String getCategory() {
		return category;
	}
	public void setCategory(String category) {
		this.category = category;
	}
	public double getDuration() { 
		return diaryEntry.getDuration();
	}
	public Date getStart_time() { 
		return diaryEntry.getStart_time();
	} 
	public Date getEnd_time() { 
		return diaryEntry.getEnd_time();
	}
	public long getId() {
		return diaryEntry.getId();
	} 
	
}
