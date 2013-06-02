package com.timemanager.client.view;

import com.google.gwt.user.cellview.client.CellTable;
import com.google.gwt.user.client.ui.Button;
import com.google.gwt.user.client.ui.TextBox;
 
public interface AddTaskView extends BaseView {
	public Button getAddButton(); 
    public TextBox getTextBox();
    public CellTable getCellTable();
}
