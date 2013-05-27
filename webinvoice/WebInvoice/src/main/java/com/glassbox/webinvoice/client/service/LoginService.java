package com.glassbox.webinvoice.client.service;

import com.glassbox.webinvoice.client.model.AuthenticationResult;
import com.google.gwt.user.client.rpc.RemoteService;
import com.google.gwt.user.client.rpc.RemoteServiceRelativePath;

/**
 * The client side stub for the RPC service.
 */
@RemoteServiceRelativePath("services/login")
public interface LoginService extends RemoteService {
	AuthenticationResult authenticateUser(String name, String password) throws IllegalArgumentException;
}
