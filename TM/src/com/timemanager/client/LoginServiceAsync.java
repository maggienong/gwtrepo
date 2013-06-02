package com.timemanager.client;

import com.google.gwt.user.client.rpc.AsyncCallback;
import com.timemanager.shared.UserDTO;

public interface LoginServiceAsync {

	void isLogined(AsyncCallback<UserDTO> callback);

	void signIn(String userName, String password,
			AsyncCallback<UserDTO> callback);

	void createAccount(String userName, String email, String password,
			AsyncCallback<UserDTO> callback);

	void logOut(AsyncCallback<Void> callback);

}
