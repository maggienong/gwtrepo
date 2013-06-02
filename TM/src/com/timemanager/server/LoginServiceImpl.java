package com.timemanager.server;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

import com.google.gwt.user.server.rpc.RemoteServiceServlet;
import com.timemanager.client.LoginService;
import com.timemanager.shared.UserDTO;
import com.timemanager.shared.util.UserDao;

public class LoginServiceImpl extends RemoteServiceServlet implements LoginService {

	public static String USER = "user";
	@Override
	public UserDTO isLogined() {
		UserDTO user = null;
        HttpServletRequest httpServletRequest = this.getThreadLocalRequest();
        HttpSession session = httpServletRequest.getSession();
        Object userObj = session.getAttribute(USER);
        if (userObj != null && userObj instanceof UserDTO)
        {
            user = (UserDTO) userObj;
        }
        return user;
	}

	@Override
	public UserDTO signIn(String userName, String password) {
		UserDao dao = (UserDao) SpringContext.getInstance().getBean("UserDao");
		UserDTO user = dao.findByLogin(userName, password);
		HttpServletRequest httpServletRequest = this.getThreadLocalRequest();
        HttpSession session = httpServletRequest.getSession();
        session.setAttribute(USER,user);
		return user;
	}

	@Override
	public UserDTO createAccount(String userName, String email, String password) {
		if (userName==null || userName.length()==0) return null;
		if (email==null || email.length()==0) return null;
		
		UserDTO dto = new UserDTO();
		dto.setName(userName);
		dto.setEmail(email);
		dto.setPassword(password);
		UserDao dao = (UserDao) SpringContext.getInstance().getBean("UserDao");
		dao.insert(dto);
		UserDTO user = dao.findByLogin(userName, password);
		HttpServletRequest httpServletRequest = this.getThreadLocalRequest();
        HttpSession session = httpServletRequest.getSession();
        session.setAttribute(USER,user);
		return user;
	}

	@Override
	public void logOut() {
		HttpServletRequest httpServletRequest = this.getThreadLocalRequest();
        HttpSession session = httpServletRequest.getSession();
        session.removeAttribute(USER);
        session.invalidate();
	}


}
