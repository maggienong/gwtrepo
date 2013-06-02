package com.timemanager.client;

import com.google.gwt.user.client.rpc.RemoteService;
import com.google.gwt.user.client.rpc.RemoteServiceRelativePath;
import com.timemanager.shared.UserDTO;

@RemoteServiceRelativePath("login")
public interface LoginService extends RemoteService { 

	public UserDTO isLogined();
	
	public UserDTO signIn(String userName, String password);
	
	public UserDTO createAccount(String userName, String email, String password);
	
	public void logOut();
}
