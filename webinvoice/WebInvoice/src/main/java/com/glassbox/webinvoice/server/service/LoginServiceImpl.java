package com.glassbox.webinvoice.server.service;

import com.glassbox.webinvoice.client.service.LoginService;
import com.glassbox.webinvoice.client.model.AuthenticationResult;
import com.glassbox.webinvoice.server.dataaccess.UserDAO;
import com.glassbox.webinvoice.shared.entity.User;
import com.google.gwt.user.server.rpc.RemoteServiceServlet;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * The server side implementation of the RPC service.
 */
@Service("services/login")
public class LoginServiceImpl extends RemoteServiceServlet implements
        LoginService {
    	@Autowired
	private UserDAO userDAO;
      
    public AuthenticationResult authenticateUser(String login, String password) {
        AuthenticationResult result;
        User user;
        
        user = userDAO.authenticateUser(login, password);
        
        result = new AuthenticationResult();
        result.setUsername(user.getUsername());
        result.setAuthenticated(true);
        
        return result;
    }
}
