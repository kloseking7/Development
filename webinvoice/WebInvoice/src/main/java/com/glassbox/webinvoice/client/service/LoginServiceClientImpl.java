/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.glassbox.webinvoice.client.service;

import com.glassbox.webinvoice.client.model.AuthenticationResult;
import com.google.gwt.core.shared.GWT;
import com.google.gwt.user.client.Window;
import com.google.gwt.user.client.rpc.AsyncCallback;
import com.google.gwt.user.client.rpc.ServiceDefTarget;

/**
 *
 * @author mon2
 */
public class LoginServiceClientImpl implements LoginServiceClientInterface {
    private LoginServiceAsync service;
    
    public LoginServiceClientImpl(String url) {
        System.out.print(url);
        this.service = GWT.create(LoginService.class);
        ServiceDefTarget endpoint = (ServiceDefTarget) this.service;
        endpoint.setServiceEntryPoint(url);
    }

    public void authenticateUser(String name, String password) {
        this.service.authenticateUser(name, password, new LoginCallback());
    }
    
    private class LoginCallback implements AsyncCallback {

        public void onFailure(Throwable caught) {
            Window.alert("failure");  
        }

        public void onSuccess(Object result) {
            Window.alert("success");
        }
        
    }
    
}
