package com.glassbox.webinvoice.client;

import com.glassbox.webinvoice.client.ui.Main;
import com.google.gwt.core.client.EntryPoint;
import com.google.gwt.user.client.Window;
import com.google.gwt.user.client.ui.RootPanel;

/**
 * Entry point classes define <code>onModuleLoad()</code>.
 */
public class Webinvoice implements EntryPoint {
	private Main main = new Main();

	public void onModuleLoad() {
	    Window.enableScrolling(true);
	    Window.setMargin("0px");
	    RootPanel.get().add(main);
	}


}
