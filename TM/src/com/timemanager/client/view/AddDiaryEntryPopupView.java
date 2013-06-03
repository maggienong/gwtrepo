package com.timemanager.client.view;

import com.google.gwt.user.client.ui.Button;
import com.google.gwt.user.client.ui.Label;
import com.google.gwt.user.client.ui.ValueListBox;
import com.timemanager.shared.CategoryDTO;
import com.timemanager.shared.TaskDTO;

public interface AddDiaryEntryPopupView extends BaseView { 
	public void show();
	public Button getCancelButton(); 
	public Button getAddButton();
	public ValueListBox<CategoryDTO> getCategoryList(); 
	public ValueListBox<TaskDTO> getTaskList();
	public void hideWindow(); 
	public void center();
	public Label getStatus();

	public double getDuration();
}
