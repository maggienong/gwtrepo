package com.timemanager.client.view;

import com.google.gwt.core.client.GWT;
import com.google.gwt.event.dom.client.ChangeEvent;
import com.google.gwt.event.dom.client.ChangeHandler;
import com.google.gwt.event.dom.client.ClickEvent;
import com.google.gwt.event.dom.client.ClickHandler;
import com.google.gwt.uibinder.client.UiBinder;
import com.google.gwt.uibinder.client.UiField;
import com.google.gwt.uibinder.client.UiHandler;
import com.google.gwt.uibinder.client.UiTemplate;
import com.google.gwt.user.client.Window;
import com.google.gwt.user.client.ui.Button;
import com.google.gwt.user.client.ui.CheckBox;
import com.google.gwt.user.client.ui.Composite;
import com.google.gwt.user.client.ui.DockLayoutPanel;
import com.google.gwt.user.client.ui.HasText;
import com.google.gwt.user.client.ui.TextBox;
import com.google.gwt.user.client.ui.Widget;

public class CreateAccountImpl extends Composite implements CreateAccountView {

	private static CreateAccountUiBinder uiBinder = GWT.create(CreateAccountUiBinder.class);
	
	@UiTemplate("CreateAccount.ui.xml")
	interface CreateAccountUiBinder extends UiBinder<Widget, CreateAccountImpl> {
	}

	public CreateAccountImpl() {
		initWidget(uiBinder.createAndBindUi(this));
		getEmail().addChangeHandler(new ChangeHandler() {
			
			@Override
			public void onChange(ChangeEvent event) {
				TextBox box = (TextBox) event.getSource();
				getUserName().setText(box.getText());
			}
		});
		
		getEnableDetail().addClickHandler(new ClickHandler() {
			
			@Override
			public void onClick(ClickEvent event) {
				CheckBox box = (CheckBox) event.getSource();
				if (box.getValue()) {
					detailpanel.setSize("300px", "200px");
				} else {
					detailpanel.setSize("0px", "0px");
				}
			}
		});
	}
 
	@UiField Button create;
	@UiField TextBox email;
	@UiField TextBox userName;
	@UiField TextBox passWorld;
	@UiField TextBox repeatPassWorld;
	@UiField CheckBox enableDetail;
	@UiField DockLayoutPanel detailpanel;
	
	public Button getCreate() {
		return create;
	}
	public TextBox getEmail() {
		return email;
	}
	public TextBox getUserName() {
		return userName;
	}
	public TextBox getPassWorld() {
		return passWorld;
	}
	public TextBox getRepeatPassWorld() {
		return repeatPassWorld;
	}
	public CheckBox getEnableDetail() {
		return enableDetail;
	}


}
