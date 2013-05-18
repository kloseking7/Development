package com.glassbox.webinvoice.client.ui.container;

import com.glassbox.webinvoice.client.ui.container.pages.HomePage;
import com.google.gwt.core.client.GWT;
import com.google.gwt.uibinder.client.UiBinder;
import com.google.gwt.uibinder.client.UiField;
import com.google.gwt.user.client.ui.Composite;
import com.google.gwt.user.client.ui.HTMLPanel;
import com.google.gwt.user.client.ui.Widget;

public class Container extends Composite {

	private static ContainerUiBinder uiBinder = GWT
			.create(ContainerUiBinder.class);
	private HomePage home = new HomePage();

	interface ContainerUiBinder extends UiBinder<Widget, Container> {
	}
	
	@UiField
	HTMLPanel ContainerPanel;

	public Container(Object panel) {
		initWidget(uiBinder.createAndBindUi(this));
		ContainerPanel.add(home);
		
	}

}
