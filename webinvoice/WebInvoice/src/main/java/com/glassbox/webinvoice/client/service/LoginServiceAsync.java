package com.glassbox.webinvoice.client.service;

import com.glassbox.webinvoice.client.model.AuthenticationResult;
import com.google.gwt.user.client.rpc.AsyncCallback;

/**
 * The async counterpart of <code>GreetingService</code>.
 */
public interface LoginServiceAsync {
    AuthenticationResult authenticateUser(String name, String password, AsyncCallback<String> callback) throws IllegalArgumentException;
}
