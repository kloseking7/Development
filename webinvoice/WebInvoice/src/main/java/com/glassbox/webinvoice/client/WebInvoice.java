package com.glassbox.webinvoice.client;

import com.glassbox.webinvoice.client.ui.Main;
import com.glassbox.webinvoice.client.ui.container.pages.LoginBox;
import com.google.gwt.core.client.EntryPoint;
import com.google.gwt.user.client.ui.RootPanel;
import com.google.gwt.user.client.Window;

/**
 * Entry point classes define <code>onModuleLoad()</code>.
 */
public class WebInvoice implements EntryPoint {
    	private Main main = new Main();

	public void onModuleLoad() {
	    Window.enableScrolling(true);
	    Window.setMargin("0px");
	    RootPanel.get().add(main);
	}

}
