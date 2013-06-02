package com.timemanager.client.view;

import com.google.gwt.user.client.ui.Button;
import com.google.gwt.user.client.ui.CheckBox;
import com.google.gwt.user.client.ui.TextBox;

public interface CreateAccountView extends BaseView {
	public Button getCreate();
	public TextBox getEmail();
	public TextBox getUserName();
	public TextBox getPassWorld();
	public TextBox getRepeatPassWorld();
	public CheckBox getEnableDetail();
}
