package com.glassbox.webinvoice.client.ui.container.pages;

import com.google.gwt.user.client.ui.DialogBox;
import com.google.gwt.user.client.ui.FlowPanel;

public class LoginBox extends DialogBox {
	FlowPanel loginPanel = new FlowPanel();
	
	public LoginBox(){
		loginPanel.setSize("600px", "400px");
		this.add(loginPanel);
		this.setModal(true);
		this.setTitle("Login to WebInvoice");
		this.setText("Login");
	}
}
