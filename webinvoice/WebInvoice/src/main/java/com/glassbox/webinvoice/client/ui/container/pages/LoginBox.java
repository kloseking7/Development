package com.glassbox.webinvoice.client.ui.container.pages;

import com.google.gwt.core.client.GWT;
import com.google.gwt.uibinder.client.UiBinder;
import com.google.gwt.user.client.ui.DialogBox;
import com.google.gwt.user.client.ui.FlowPanel;
import com.google.gwt.user.client.ui.Widget;

public class LoginBox extends DialogBox {
	private static LoginBoxUiBinder uiBinder = GWT
			.create(LoginBoxUiBinder.class);
	FlowPanel loginPanel = new FlowPanel();
        
        interface LoginBoxUiBinder extends UiBinder<Widget, LoginBox> {
	}
	
	public LoginBox(){
            loginPanel.add(uiBinder.createAndBindUi(this));
            loginPanel.setSize("600px", "400px");
            this.add(loginPanel);
            this.setModal(true);
            this.setTitle("Login");
            this.center();
	}
}
