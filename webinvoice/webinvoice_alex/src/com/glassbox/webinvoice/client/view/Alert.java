package com.glassbox.webinvoice.client.view;

import com.glassbox.webinvoice.client.component.MyButton;
import com.google.gwt.event.dom.client.ClickEvent;
import com.google.gwt.event.dom.client.ClickHandler;
import com.google.gwt.user.client.ui.Button;
import com.google.gwt.user.client.ui.DialogBox;
import com.google.gwt.user.client.ui.HasVerticalAlignment;
import com.google.gwt.user.client.ui.Label;
import com.google.gwt.user.client.ui.VerticalPanel;
import com.google.gwt.user.client.ui.HasVerticalAlignment.VerticalAlignmentConstant;

public class Alert {
	private final static DialogBox dialogBox = new DialogBox();
	private final static Button closeButton = new MyButton("Ok",
			"btn btn-danger");
	private static final String DIALOGBOXWIDTH = "200px";
	private static final String DIALOGBOXHEIGHT = "150px";
	private static final Label infoText = new Label();
	private final static VerticalPanel dialogVPanel = new VerticalPanel();

	static {
		closeButton.setWidth("80px");
		dialogBox.addStyleName("alert");
		dialogBox.setAnimationEnabled(true);
		dialogBox.setHeight(DIALOGBOXHEIGHT);
		dialogBox.setWidth(DIALOGBOXWIDTH);
		dialogVPanel.setVerticalAlignment(HasVerticalAlignment.ALIGN_MIDDLE);
		dialogVPanel.addStyleName("font-black");
		dialogVPanel.setHeight(DIALOGBOXHEIGHT);
		dialogVPanel.setWidth(DIALOGBOXWIDTH);
		infoText.setWidth(DIALOGBOXWIDTH);
		infoText.addStyleName("word-breaker");
		dialogBox.setWidget(dialogVPanel);
		dialogBox.center();
		closeButton.addClickHandler(new ClickHandler() {
			public void onClick(ClickEvent event) {
				dialogBox.hide();
				cleanDialogBox();
			}
		});
	}

	public static void alert(String msg) {
		showDialog(msg, "alert-error");
	}

	public static void msg(String msg) {
		showDialog(msg, "alert-success");

	}

	public static void info(String msg) {
		showDialog(msg, "alert-info");
	}

	private static void showDialog(String msg, String css) {
		cleanDialogBox();
		dialogBox.addStyleName(css);
		dialogVPanel.setHorizontalAlignment(VerticalPanel.ALIGN_CENTER);
		infoText.setText(msg);
		dialogVPanel.add(infoText);
		dialogVPanel.add(closeButton);
		dialogBox.show();
	}

	private static void cleanDialogBox() {
		infoText.setText("");
		dialogVPanel.clear();
		dialogBox.removeStyleName("alert-error");
		dialogBox.removeStyleName("alert-success");
		dialogBox.removeStyleName("alert-info");
	}
}
