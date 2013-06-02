package com.timemanager.client.view;

import java.util.Date;
import java.util.List;

import com.google.gwt.user.client.ui.Button;
import com.timemanager.shared.DiaryEntryVw;

public interface DiaryEntryView extends BaseView {
	public void addDataToProvider(List<DiaryEntryVw> listToWrap);
	public Button getAddButton(); 
	public Date getFromDate();
	
	public Date getToDate();
	
}
