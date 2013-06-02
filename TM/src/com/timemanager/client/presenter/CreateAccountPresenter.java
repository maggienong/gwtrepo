package com.timemanager.client.presenter;

import com.google.gwt.core.client.GWT;
import com.google.gwt.event.dom.client.ClickEvent;
import com.google.gwt.event.dom.client.ClickHandler;
import com.google.gwt.event.shared.HandlerManager;
import com.google.gwt.user.client.Window;
import com.google.gwt.user.client.rpc.AsyncCallback;
import com.google.gwt.user.client.ui.HasWidgets;
import com.timemanager.client.LoginService;
import com.timemanager.client.LoginServiceAsync;
import com.timemanager.client.event.MainPageEvent;
import com.timemanager.client.view.CreateAccountView;
import com.timemanager.shared.UserDTO;

public class CreateAccountPresenter  implements Presenter {
	private final HandlerManager eventBus;
	private final CreateAccountView view; 

	LoginServiceAsync loginService = GWT.create(LoginService.class);

	public CreateAccountPresenter(CreateAccountView view, HandlerManager eventBus) {
		this.view = view;
		this.eventBus = eventBus;
		bind();
	}

	private void bind() {
		view.getCreate().addClickHandler(new ClickHandler() {
			
			@Override
			public void onClick(ClickEvent event) {
				String email = view.getEmail().getText();
				String userName = view.getUserName().getText();
				String password = view.getPassWorld().getText();
				AsyncCallback<UserDTO> callback = new AsyncCallback<UserDTO>() {

					@Override
					public void onFailure(Throwable e) {
						Window.alert("failed to login to server");
						e.printStackTrace();
					}

					@Override
					public void onSuccess(UserDTO result) { 
						eventBus.fireEvent(new MainPageEvent());
					} 

				};
				loginService.createAccount(userName, email, password, callback);
			}
		});
	}

	@Override
	public void go(HasWidgets container) {
		container.clear();
		container.add(view.asWidget()); 
	}
}
