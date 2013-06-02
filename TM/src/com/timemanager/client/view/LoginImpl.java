package com.timemanager.client.view;

import com.google.gwt.core.client.GWT;
import com.google.gwt.uibinder.client.UiBinder;
import com.google.gwt.uibinder.client.UiField;
import com.google.gwt.uibinder.client.UiTemplate;
import com.google.gwt.user.client.ui.Button;
import com.google.gwt.user.client.ui.Composite;
import com.google.gwt.user.client.ui.TextBox;
import com.google.gwt.user.client.ui.Widget;

public class LoginImpl extends Composite implements LoginView {
	
	private static LoginUiBinder uiBinder = GWT.create(LoginUiBinder.class);
	
	@UiTemplate("Login.ui.xml")
	interface LoginUiBinder extends UiBinder<Widget, LoginImpl> {
	}

	public LoginImpl() {
		initWidget(uiBinder.createAndBindUi(this));
	}

	@UiField Button signIn;
	@UiField Button create;
	@UiField TextBox userName;
	@UiField TextBox passWorld;

	public LoginImpl(String firstName) {
		initWidget(uiBinder.createAndBindUi(this)); 
	}

	public Button getSignIn() {
		return signIn;
	}

	public TextBox getUserName() {
		return userName;
	}

	public TextBox getPassWorld() {
		return passWorld;
	}

	public Button getCreate() {
		return create;
	}
 
	
	
}
