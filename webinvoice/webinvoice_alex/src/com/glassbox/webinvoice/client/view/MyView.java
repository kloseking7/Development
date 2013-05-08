package com.glassbox.webinvoice.client.view;

import com.glassbox.webinvoice.client.UserService;
import com.glassbox.webinvoice.client.UserServiceAsync;
import com.google.gwt.core.client.GWT;

public abstract class MyView implements View {
	protected final UserServiceAsync userService = GWT
			.create(UserService.class);

}
