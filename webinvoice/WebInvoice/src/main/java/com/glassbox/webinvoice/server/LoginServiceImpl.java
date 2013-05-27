package com.glassbox.webinvoice.server;

import com.glassbox.webinvoice.client.service.LoginService;
import com.glassbox.webinvoice.client.model.AuthenticationResult;
import com.google.gwt.user.server.rpc.RemoteServiceServlet;
import org.springframework.stereotype.Service;

/**
 * The server side implementation of the RPC service.
 */
@SuppressWarnings("serial")
@Service("services/login")
public class LoginServiceImpl extends RemoteServiceServlet implements
		LoginService {

    public AuthenticationResult authenticateUser(String name, String password) {
        //dummy authentication.
        AuthenticationResult result = new AuthenticationResult();
        result.setAuthenticated(true);
        result.setMessage("");
        result.setUsername("manssster");
        result.setEmail("manssster@gmail.com");
        return result;
    }
}
