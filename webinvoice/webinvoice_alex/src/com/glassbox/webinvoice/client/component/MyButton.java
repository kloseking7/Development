package com.glassbox.webinvoice.client.component;

import com.google.gwt.user.client.ui.Button;

public class MyButton extends Button {

	public MyButton(String text, String css) {
		super(text);
		for (String s : css.split(" "))
			super.addStyleName(s);
	}
}
