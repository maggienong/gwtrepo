package com.timemanager.server;

import java.io.IOException;

import javax.servlet.ServletContext;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.google.gwt.user.server.rpc.RemoteServiceServlet;
import com.timemanager.shared.SessionTimeoutException;
import com.timemanager.shared.UserDTO;

public abstract class AbstractServicesImpl extends RemoteServiceServlet {
	 
	/**
	 * 
	 */
	private static final long serialVersionUID = -551858611837253046L;

	@Override
	protected void onBeforeRequestDeserialized(String serializedRequest) { 
		try {
			getUserId();
		} catch (SessionTimeoutException exx) { 
			// Write error to the client, just copy paste
			this.getThreadLocalResponse().reset();
			ServletContext servletContext = this.getServletContext();
			HttpServletResponse response = this.getThreadLocalResponse();
			try {
				response.setContentType("text/plain");
				response.setStatus(HttpServletResponse.SC_INTERNAL_SERVER_ERROR);
				try {
					response.getOutputStream().write(
							SessionTimeoutException.ERROR_MESSAGE_NOT_LOGGED_IN.getBytes("UTF-8"));
					response.flushBuffer();
				} catch (IllegalStateException e) {
					// Handle the (unexpected) case where getWriter() was previously used
					response.getWriter().write(SessionTimeoutException.ERROR_MESSAGE_NOT_LOGGED_IN);
					response.flushBuffer();
				}
			} catch (IOException ex) {
				servletContext.log(
						"respondWithUnexpectedFailure failed while sending the previous failure to the client",
						ex);
			} 
			throw exx;
		}
	}
	
	@Override
	protected void doUnexpectedFailure(Throwable t) {
		if (!(t instanceof SessionTimeoutException)) {
			super.doUnexpectedFailure(t);
		}
	}
	
	public long getUserId() {
		UserDTO user = null;
        HttpServletRequest httpServletRequest = this.getThreadLocalRequest();
        HttpSession session = httpServletRequest.getSession();
        Object userObj = session.getAttribute(LoginServiceImpl.USER);
        if (userObj != null && userObj instanceof UserDTO)
        {
            user = (UserDTO) userObj;
            return user.getId();
        }
        throw new SessionTimeoutException("Time Out");
	}
}