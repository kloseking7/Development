package com.glassbox.webinvoice.client.service;

import com.google.gwt.user.client.rpc.AsyncCallback;

/**
 * The async counterpart of <code>GreetingService</code>.
 */
public interface LoginServiceAsync {
	public void authenticateUser(String name, String password,
			AsyncCallback callback) throws RuntimeException;
}
