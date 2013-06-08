package com.glassbox.webinvoice.server.service;

import javax.servlet.http.HttpServletRequest;

import com.glassbox.webinvoice.client.service.LoginService;
import com.glassbox.webinvoice.client.model.AuthenticationResult;
import com.glassbox.webinvoice.server.dataaccess.StaffDAO;
import com.glassbox.webinvoice.shared.entity.Staff;
import com.google.gwt.user.server.rpc.RemoteServiceServlet;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

/**
 * The server side implementation of the RPC service.
 */
@SuppressWarnings("serial")
@Transactional(rollbackFor = RuntimeException.class)
@Service("login")
public class LoginServiceImpl extends RemoteServiceServlet implements
		LoginService {
	@Autowired
	private StaffDAO staffDAO;

	@Autowired(required=false)
	private HttpServletRequest request;
	
	public AuthenticationResult authenticateUser(String login, String password) {
		AuthenticationResult result = new AuthenticationResult();
		Staff staff;

		staff = staffDAO.findStaff(login, password);

		if (staff != null) {
			result.setUsername(staff.getUserName());
			result.setAuthenticated(true);
			//request.getSession().setAttribute("currentStaff", staff);
		} else {
			result.setAuthenticated(false);
			result.setMessage("Invalid login/password combination.");
		}
		return result;
	}
}
