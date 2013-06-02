package com.timemanager.client;

import com.google.gwt.core.client.EntryPoint;
import com.google.gwt.core.client.GWT;
import com.google.gwt.event.shared.HandlerManager;
import com.google.gwt.user.client.rpc.AsyncCallback;
import com.google.gwt.user.client.ui.RootLayoutPanel;
import com.timemanager.client.event.LoginEvent;
import com.timemanager.client.presenter.AppViewPresenter;
import com.timemanager.client.view.AddTaskView;
import com.timemanager.client.view.AddTaskViewImpl;
import com.timemanager.client.view.AppView;
import com.timemanager.client.view.AppViewImpl;
import com.timemanager.shared.UserDTO;

/**
 * Entry point classes define <code>onModuleLoad()</code>.
 */
public class TM implements EntryPoint { 
	HandlerManager event_bus = GlobalEventBus.getInstance().getEvent_bus();
	
	public void onModuleLoad() {
		ResourceBundle.INSTANCE.stylesheet1().ensureInjected(); 
		
		AddTaskView view = new AddTaskViewImpl(); 
		AppView app = new AppViewImpl(); 
		final AppViewPresenter appViewer = new AppViewPresenter(event_bus, app); 
		final RootLayoutPanel root = RootLayoutPanel.get();
		root.setStyleName("mainBodyDiv");
		appViewer.setContainer(root);

		LoginServiceAsync loginService = GWT.create(LoginService.class);

		AsyncCallback<UserDTO> callback = new AsyncCallback<UserDTO>() { 
			@Override
			public void onFailure(Throwable e) {
				event_bus.fireEvent(new LoginEvent());
			}

			@Override
			public void onSuccess(UserDTO result) { 
				if (result!=null)
					appViewer.go(root);
				else
					event_bus.fireEvent(new LoginEvent());
			} 

		};
		loginService.isLogined(callback); 
		
	}
	 
}
