package com.timemanager.client;

import com.google.gwt.user.client.Window;
import com.google.gwt.user.client.rpc.AsyncCallback;
import com.timemanager.client.event.LoginEvent;
import com.timemanager.shared.SessionTimeoutException;

public class MyAsyncCallback<T> implements AsyncCallback<T> {

	private final AsyncCallback<T> asyncCallback;

	public MyAsyncCallback(AsyncCallback<T> asyncCallback ) {
		this.asyncCallback = asyncCallback;
		//this.eventBus = eventBus;
	}

	@Override
	public void onFailure(Throwable caught) {
		if (caught.getMessage().equals("500 " + SessionTimeoutException.ERROR_MESSAGE_NOT_LOGGED_IN)) {
			Window.alert("session time out, plese login again.");
			GlobalEventBus.getInstance().getEvent_bus().fireEvent(new LoginEvent());
			return;
		}

		asyncCallback.onFailure(caught);
	}

	@Override
	public void onSuccess(T result) {
		asyncCallback.onSuccess(result);
	}

}