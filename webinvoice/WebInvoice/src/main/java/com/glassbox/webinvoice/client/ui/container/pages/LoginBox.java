package com.glassbox.webinvoice.client.ui.container.pages;

import com.glassbox.webinvoice.client.service.LoginService;
import com.glassbox.webinvoice.client.model.AuthenticationResult;
import com.google.gwt.core.client.GWT;
import com.google.gwt.event.dom.client.ClickEvent;
import com.google.gwt.event.dom.client.ClickHandler;
import com.google.gwt.uibinder.client.UiBinder;
import com.google.gwt.uibinder.client.UiField;
import com.google.gwt.user.client.Window;
import com.google.gwt.user.client.ui.Button;
import com.google.gwt.user.client.ui.DialogBox;
import com.google.gwt.user.client.ui.TextBox;
import com.google.gwt.user.client.ui.Widget;

public class LoginBox extends DialogBox {
	private static LoginBoxUiBinder uiBinder = GWT
			.create(LoginBoxUiBinder.class);
        
        interface LoginBoxUiBinder extends UiBinder<Widget, LoginBox> {
	}
        
        @UiField Button LoginButton;
        @UiField Button CancelButton;
        @UiField TextBox login;
        @UiField TextBox password;
        LoginService loginservice;
        AuthenticationUpdate update;
        
	public LoginBox(){
            this.setSize("500px", "300px");
            this.add(uiBinder.createAndBindUi(this));
            this.setModal(true);
            this.setGlassEnabled(true);
            this.center();
            login.getElement().setId("login");
            password.getElement().setId("password");
            LoginButton.getElement().setId("loginbutton");
            LoginButton.addClickHandler(new LoginClickHandler(update));
            CancelButton.getElement().setId("cancelbutton");
            CancelButton.addClickHandler(new CancelClickHandler(this));
        }
        
    private class LoginClickHandler implements ClickHandler {     
        private AuthenticationUpdate update;
        
        public LoginClickHandler(AuthenticationUpdate update) {
            this.update = update;            
        }
        
        public void onClick(ClickEvent event) {
            AuthenticationResult result;
            Window.alert("Test");
            Window.alert(login.getText());
            Window.alert(password.getText());
            result = loginservice.authenticateUser(login.getText(), password.getText());
            Window.alert("test2");
            update.setAuthenticationResult(result); 
        }
    }

    private class CancelClickHandler implements ClickHandler {
        private LoginBox LoginBoxReference;
        
        public CancelClickHandler(LoginBox LoginReference) {
            this.LoginBoxReference = LoginReference;            
        }
        
        public void onClick(ClickEvent event) {
            this.LoginBoxReference.hide();
        }
    }
    
    private class AuthenticationUpdate {
        private void setAuthenticationResult(AuthenticationResult result) {
            if (result.isAuthenticated()) {
                Window.alert("logged in ok");
            }
            else {
                Window.alert("failed");
            }        
        }        
    }
}
