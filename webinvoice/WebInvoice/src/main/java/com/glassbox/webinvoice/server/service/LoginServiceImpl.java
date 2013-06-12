package com.glassbox.webinvoice.server.service;

import com.glassbox.webinvoice.client.service.LoginService;
import com.glassbox.webinvoice.shared.model.AuthenticationResult;
import com.glassbox.webinvoice.server.dataaccess.UserDAO;
import com.glassbox.webinvoice.shared.entity.User;
import com.google.gwt.user.server.rpc.RemoteServiceServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;
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
    private UserDAO userDAO;
    
    public AuthenticationResult authenticateUser(String login, String password) {
        AuthenticationResult result = new AuthenticationResult();
        User user;
        
        user = userDAO.authenticateUser(login, password);
        
        if (user != null) {
            result.setUsername(user.getUsername());
            result.setAuthenticated(true);
        }
        else {
            result.setAuthenticated(false);
            result.setMessage("Invalid login/password combination.");
        }
        
        return result;
    }
    
    private User getAuthenticatedUserFromSession() {
        User user = null;
        HttpServletRequest httpServletRequest = this.getThreadLocalRequest();
        HttpSession session = httpServletRequest.getSession();
        Object userObj = session.getAttribute("user");
        if (userObj != null && userObj instanceof User)
        {
            user = (User) userObj;
        }
        
        return user;
    }   
}
