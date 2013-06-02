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
import com.timemanager.client.event.NewAccountEvent;
import com.timemanager.client.view.LoginView;
import com.timemanager.shared.UserDTO;

public class LoginPresenter implements Presenter {
	private final HandlerManager eventBus;
	private final LoginView view; 

	LoginServiceAsync loginService = GWT.create(LoginService.class);

	public LoginPresenter(LoginView view, HandlerManager eventBus) {
		this.view = view;
		this.eventBus = eventBus;
		bind();

		AsyncCallback<Void> callback = new AsyncCallback<Void>() {

			@Override
			public void onFailure(Throwable e) {
				Window.alert("failed to login out");
				e.printStackTrace();
			}

			@Override
			public void onSuccess(Void result) { 
			} 

		};
		loginService.logOut(callback);
	}

	@Override
	public void go(HasWidgets container) {
		container.clear();
		container.add(view.asWidget()); 
	}

	private void bind() {
		view.getSignIn().addClickHandler(new ClickHandler() {

			@Override
			public void onClick(ClickEvent event) {
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
				loginService.signIn(userName, password, callback);
			}
		});

		view.getCreate().addClickHandler(new ClickHandler() {

			@Override
			public void onClick(ClickEvent event) {
				eventBus.fireEvent(new NewAccountEvent());
			}
		});
	}
}
