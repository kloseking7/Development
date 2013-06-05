/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.glassbox.webinvoice.client.service;

import com.glassbox.webinvoice.client.ui.Alert;
import com.glassbox.webinvoice.client.ui.AlertLevel;
import com.glassbox.webinvoice.client.ui.container.pages.LoginBox;
import com.glassbox.webinvoice.shared.FieldVerifier;
import com.glassbox.webinvoice.shared.model.AuthenticationResult;
import com.google.gwt.core.shared.GWT;
import com.google.gwt.user.client.Window;
import com.google.gwt.user.client.rpc.AsyncCallback;
import com.google.gwt.user.client.rpc.ServiceDefTarget;

/**
 *
 * @author mon2
 */
public class LoginServiceClientImpl implements LoginServiceClientInt {
    private LoginServiceAsync service;
    private LoginBox loginui;
    
    public LoginServiceClientImpl(String url, LoginBox loginui) {
        this.service = GWT.create(LoginService.class);
        ServiceDefTarget endpoint = (ServiceDefTarget) this.service;
        endpoint.setServiceEntryPoint(url);
        this.loginui = loginui;
    }
    
    public void authenticateUser(String name, String password) {
        //validation
        AuthenticationResult result = new AuthenticationResult();
        
        if (FieldVerifier.isBlankUserName(name)) {
            result.setAuthenticated(false);
            result.setEmail(null);
            result.setUsername(null);
            result.setMessage("Username cannot be blank.");
            result.setTagname("login");
            loginui.UpdateLoginDialog((AuthenticationResult)result);
            return;
        }
                
       if (FieldVerifier.isBlankPassword(password)) {
            result.setAuthenticated(false);
            result.setEmail(null);
            result.setUsername(null);
            result.setMessage("Password cannot be blank.");
            result.setTagname("password");
            loginui.UpdateLoginDialog((AuthenticationResult)result);
            return;
        }
       
        if (!FieldVerifier.isValidUserName(name)) {
            result.setAuthenticated(false);
            result.setEmail(null);
            result.setUsername(null);
            result.setMessage("Username should be at least 3 characters.");
            result.setTagname("login");
            loginui.UpdateLoginDialog((AuthenticationResult)result);
            return;
        }
       
       this.service.authenticateUser(name, password, new LoginCallback());
    }
    
    private class LoginCallback implements AsyncCallback {
        public void onFailure(Throwable caught) {
            	Window.alert(caught.getMessage());
        }
        public void onSuccess(Object result) {
            loginui.UpdateLoginDialog((AuthenticationResult)result);
        }
    }
}
