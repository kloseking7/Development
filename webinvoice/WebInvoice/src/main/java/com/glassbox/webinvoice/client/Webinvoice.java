package com.glassbox.webinvoice.client;

import com.glassbox.webinvoice.client.view.Alert;
import com.glassbox.webinvoice.client.view.AlertLevel;
import com.glassbox.webinvoice.client.view.SignIn;
import com.glassbox.webinvoice.client.view.ViewController;
import com.glassbox.webinvoice.client.view.Views;
import com.google.gwt.core.client.EntryPoint;
import com.google.gwt.user.client.ui.Button;
import com.google.gwt.user.client.ui.RootPanel;

/**
 * Entry point classes define <code>onModuleLoad()</code>.
 */
public class Webinvoice implements EntryPoint {

	public void onModuleLoad() {

		ViewController.showView(Views.Home);
	}

}
