package com.glassbox.webinvoice.client.ui;

import com.glassbox.webinvoice.client.ui.container.Container;
import com.glassbox.webinvoice.client.ui.footer.Footer;
import com.glassbox.webinvoice.client.ui.header.Header;
import com.glassbox.webinvoice.client.ui.menu.Menu;
import com.google.gwt.core.client.GWT;
import com.google.gwt.uibinder.client.UiBinder;
import com.google.gwt.uibinder.client.UiField;
import com.google.gwt.user.client.ui.Composite;
import com.google.gwt.user.client.ui.HTMLPanel;
import com.google.gwt.user.client.ui.Widget;

public class Main extends Composite {

	private static MainUiBinder uiBinder = GWT.create(MainUiBinder.class);
	private Header hdr = new Header(); 
	private Menu mnu = new Menu(this);
	private Container container = new Container(this);
	private Footer footer = new Footer();
	
	interface MainUiBinder extends UiBinder<Widget, Main> {
	}
	
	@UiField
	HTMLPanel MainPanel;

	public Main() {
		initWidget(uiBinder.createAndBindUi(this));
		this.MainPanel.add(hdr);
		this.MainPanel.add(mnu);
		this.MainPanel.add(container);
		this.MainPanel.add(footer);
	}
}
