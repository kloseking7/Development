package com.glassbox.webinvoice.server.service;

import com.glassbox.webinvoice.client.service.LoginService;
import com.glassbox.webinvoice.client.model.AuthenticationResult;
import com.glassbox.webinvoice.server.dataaccess.UserDAO;
import com.google.gwt.user.server.rpc.RemoteServiceServlet;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * The server side implementation of the RPC service.
 */
@Service("services/login")
public class LoginServiceImpl extends RemoteServiceServlet implements
        LoginService {
    
    	@Autowired(required=false)
	private UserDAO userDAO;
    
    public AuthenticationResult authenticateUser(String name, String password) {
        AuthenticationResult result;
        
        result = userDAO.authenticateUser(name, password);
        
        return result;
    }
}
