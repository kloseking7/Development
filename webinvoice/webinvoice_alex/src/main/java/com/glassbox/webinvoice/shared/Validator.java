package com.glassbox.webinvoice.shared;

import java.util.HashMap;
import java.util.Map;

import com.google.gwt.dom.client.Style.Position;
import com.google.gwt.event.dom.client.KeyPressEvent;
import com.google.gwt.event.dom.client.KeyPressHandler;

import com.google.gwt.regexp.shared.RegExp;
import com.google.gwt.user.client.ui.Label;
import com.google.gwt.user.client.ui.RootPanel;
import com.google.gwt.user.client.ui.TextBox;
import com.google.gwt.user.client.ui.Widget;

public class Validator{

	private static final int INPUTWIDTH = 222;
	private static Map<Widget, Label> errorPanels = new HashMap<Widget, Label>();
	private static final String EMAILPATTERN = "^\\s*\\w+(?:\\.{0,1}[\\w-]+)*@[a-zA-Z0-9]+(?:[-.][a-zA-Z0-9]+)*\\.[a-zA-Z]+\\s*$";
	private static final RegExp emailMatcher = RegExp.compile(EMAILPATTERN);
	private static final String CHARACTORPATTERN = "^[0-9a-zA-Z\\s]+$";
	private static final RegExp characterMatcher = RegExp
			.compile(CHARACTORPATTERN);

	public static boolean isValidEmail(TextBox t, Integer from, Integer to) {
		if (errorPanels.containsKey(t)) {
			removeMessage(t);
		}
		if (validateLength(t, from, to)) {
			if (emailMatcher.exec(t.getText()) != null) {
				return true;
			} else {
				showMessage(t, t.getName() + " is an invalid email");
				return false;
			}
		} else
			return false;
	}

	public static boolean isValidName(TextBox t, Integer from, Integer to) {
		if (errorPanels.containsKey(t)) {
			removeMessage(t);
		}
		if (validateLength(t, from, to)) {
			if (characterMatcher.exec(t.getText()) != null)
				return true;
			showMessage(t, t.getName() + " contains invalid characters");
			return false;
		} else {
			return false;
		}
	}

	public static boolean isValidNumber(TextBox t, Integer from, Integer to) {
		if (errorPanels.containsKey(t)) {
			removeMessage(t);
		}
		if (validateLength(t, from, to)) {
			try {
				Integer.parseInt(t.getText());
				return true;
			} catch (NumberFormatException e) {
				showMessage(t, t.getName() + " must consist of only digits");
				return false;
			}
		} else
			return false;

	}

	private static boolean validateLength(TextBox t, Integer from, Integer to) {
		if (from == null && to == null)
			return true;
		else if (from != null && to != null) {
			if (t.getText().length() < from || t.getText().length() > to) {
				showMessage(t, "Length of " + t.getName() + " must be between "
						+ (from - 1) + " and " + (to + 1));
				return false;
			} else
				return true;
		} else if (from != null) {
			if (t.getText().length() < from) {
				showMessage(t, "Length of " + t.getName()
						+ " must be greater than " + (from - 1));
				return false;
			} else
				return true;
		} else {
			if (t.getText().length() > to) {
				showMessage(t, "Length of " + t.getName()
						+ " must be less than " + (to + 1));
				return false;
			} else
				return true;
		}
	}

	public static void showMessage(final TextBox t, String msg) {

		Label label = errorPanels.containsKey(t)?errorPanels.get(t):new Label();
		label.setText(msg);
		RootPanel rootPanel = RootPanel.get("start");
		// rootPanel.getElement().getStyle().setPosition(Position.RELATIVE);
		label.addStyleName("text-error");
		errorPanels.put(t, label);
		label.setText(msg);
		rootPanel.add(label, t.getAbsoluteLeft() + INPUTWIDTH,
				t.getAbsoluteTop() + 3);

		t.addKeyPressHandler(new KeyPressHandler() {
			@Override
			public void onKeyPress(KeyPressEvent arg0) {

				removeMessage(t);
			}
		});

	}

	public static void relocateMessage() {
		for (Widget w : errorPanels.keySet()) {
			RootPanel.get("start").remove(errorPanels.get(w));
			RootPanel.get("start").add(errorPanels.get(w),
					w.getAbsoluteLeft() + INPUTWIDTH, w.getAbsoluteTop() + 3);
		}
	}

	private static void removeMessage(TextBox t) {
		RootPanel.get("start").remove(errorPanels.get(t));
		errorPanels.remove(t);
	}

	public static void removeAllMessage() {
		for (Widget w : errorPanels.keySet())
		RootPanel.get("start").remove(errorPanels.get(w));
		errorPanels.clear();
	}
}
