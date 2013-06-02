package com.timemanager.client.view;

import com.google.gwt.user.cellview.client.CellTable;
import com.google.gwt.user.client.ui.Button;
import com.google.gwt.user.client.ui.TextBox;
import com.google.gwt.view.client.ListDataProvider;
import com.timemanager.shared.CategoryDTO;
import com.timemanager.shared.TaskDTO;

public interface AddCategoryView extends BaseView { 
	public Button getAddButton(); 
    public TextBox getTextBox();
    public CellTable getCellTable();
    public ListDataProvider<CategoryDTO> getDataProvider(); 
    public TextBox getTaskField(); 
	public Button getAddTaskButton(); 
	public CellTable getTaskCellTable(); 
	public ListDataProvider<TaskDTO> getTaskDataProvider();
	public CategoryDTO getCategory();
	public void setCategory(CategoryDTO category);
}
