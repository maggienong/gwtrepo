package com.timemanager.shared;

public class SessionTimeoutException extends RuntimeException {
	/**
	 * 
	 */
	private static final long serialVersionUID = 3887903200911716655L;
	public static String ERROR_MESSAGE_NOT_LOGGED_IN="SessionTimeOutException";
	public SessionTimeoutException(String s) {
		super(s);
	}

}
