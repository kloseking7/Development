package com.glassbox.webinvoice.client.service;

import com.glassbox.webinvoice.shared.model.AuthenticationResult;
import com.google.gwt.user.client.rpc.RemoteService;
import com.google.gwt.user.client.rpc.RemoteServiceRelativePath;

/**
 * The client side stub for the RPC service.
 */
@RemoteServiceRelativePath("/webinvoice/services/login")
public interface LoginService extends RemoteService {
	public AuthenticationResult authenticateUser(String name, String password);
}
