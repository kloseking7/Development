package com.glassbox.webinvoice.server.serviceImpl;

import javax.servlet.http.HttpServletRequest;
import org.apache.log4j.Logger;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.glassbox.webinvoice.client.service.LoginService;
import com.glassbox.webinvoice.server.dao.StaffDAO;
import com.glassbox.webinvoice.shared.entity.Staff;
import com.glassbox.webinvoice.shared.model.AuthenticationResult;
import com.google.gwt.user.server.rpc.RemoteServiceServlet;

@SuppressWarnings("serial")
@Transactional(rollbackFor = RuntimeException.class)
@Service("login")
public class LoginServiceImpl extends RemoteServiceServlet implements
		LoginService {
	private static Logger logger = Logger.getLogger(LoginServiceImpl.class);

	@Autowired
	private StaffDAO staffDAO;

	@Autowired
	private HttpServletRequest request;

	// @Autowired
	// private DTOFactory dtf;

	@Override
	public AuthenticationResult authenticateUser(String nameOrEmail,
			String password) {
		System.out.println("here");
		Staff staff = staffDAO.findStaff(nameOrEmail);
		if (staff != null) {
			AuthenticationResult result = new AuthenticationResult();
			result.setMessage("blahblah");
			return result;
		} else
			throw new RuntimeException("testing");
	}

}
