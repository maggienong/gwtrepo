package com.timemanager.client.view;

import com.google.gwt.user.client.ui.Button;
import com.google.gwt.user.client.ui.TextBox;

public interface LoginView extends BaseView {
	public Button getSignIn();

	public TextBox getUserName();

	public TextBox getPassWorld();
	
	public Button getCreate();
 
}
