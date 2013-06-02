package com.timemanager.client.view;

import com.google.gwt.core.client.GWT; 
import com.google.gwt.uibinder.client.UiBinder;
import com.google.gwt.uibinder.client.UiField;
import com.google.gwt.uibinder.client.UiTemplate;
import com.google.gwt.user.cellview.client.CellTable;
import com.google.gwt.user.client.ui.Button;
import com.google.gwt.user.client.ui.Composite;
import com.google.gwt.user.client.ui.TextBox;
import com.google.gwt.user.client.ui.Widget;

public class AddTaskViewImpl extends Composite implements AddTaskView {

	@UiTemplate("AddTaskView.ui.xml")
	interface myViewUiBinder extends UiBinder<Widget, AddTaskViewImpl> {}
	private static myViewUiBinder uiBinder =  GWT.create(myViewUiBinder.class);

	@UiField TextBox catField;
	@UiField Button addButton;
	@UiField CellTable cellTable;
	
    public AddTaskViewImpl() {
    	initWidget(uiBinder.createAndBindUi(this));
    }
     
    public Button getAddButton() {
    	return addButton;
    }
    
    public TextBox getTextBox() {
    	return catField;
    }

	public CellTable getCellTable() {
		return cellTable;
	}
    
    
}
