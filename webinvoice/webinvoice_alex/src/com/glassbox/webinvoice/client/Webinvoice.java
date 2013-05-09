package com.glassbox.webinvoice.client;

import com.glassbox.webinvoice.client.view.ViewController;
import com.glassbox.webinvoice.client.view.Views;
import com.google.gwt.core.client.EntryPoint;

/**
 * Entry point classes define <code>onModuleLoad()</code>.
 */
public class Webinvoice implements EntryPoint {

	public void onModuleLoad() {

		ViewController.showView(Views.Home);
	}

}
