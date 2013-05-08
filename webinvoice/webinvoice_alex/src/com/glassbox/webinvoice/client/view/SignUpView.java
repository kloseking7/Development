package com.glassbox.webinvoice.client.view;

import com.glassbox.webinvoice.client.component.MyButton;
import com.glassbox.webinvoice.shared.entity.AuState;

import com.google.gwt.event.dom.client.ClickEvent;
import com.google.gwt.event.dom.client.ClickHandler;
import com.google.gwt.user.client.rpc.AsyncCallback;
import com.google.gwt.user.client.ui.Button;
import com.google.gwt.user.client.ui.FlexTable;
import com.google.gwt.user.client.ui.FlowPanel;
import com.google.gwt.user.client.ui.HasHorizontalAlignment;
import com.google.gwt.user.client.ui.ListBox;
import com.google.gwt.user.client.ui.PasswordTextBox;
import com.google.gwt.user.client.ui.TextBox;
import com.google.gwt.user.client.ui.Widget;
import com.google.gwt.user.client.ui.FlexTable.FlexCellFormatter;

public class SignUpView extends MyView {
	private final FlowPanel mainPanel = new FlowPanel();
	private final FlexTable flexTable = new FlexTable();
	private final PasswordTextBox passwordText = new PasswordTextBox();
	private final PasswordTextBox dummypasswordText = new PasswordTextBox();
	private final Button signupBtn = new MyButton("Sign Up", "btn btn-primary");
	private final TextBox emailText = new TextBox();
	private final TextBox firstNameText = new TextBox();
	private final TextBox lastNameText = new TextBox();
	private final TextBox suburbText = new TextBox();
	private final TextBox postCodeText = new TextBox();
	final ListBox stateList = new ListBox(false);

	@Override
	public Widget load() {

		popStateList();
		flexTable.addStyleName("centered");

		signupBtn.addClickHandler(new ClickHandler() {
			@Override
			public void onClick(ClickEvent event) {
				if (checkField())
					userService.rigesterUser(firstNameText.getText(),
							lastNameText.getText(),
							new String[] { emailText.getText() },
							passwordText.getText(),
							AuState.values()[stateList.getSelectedIndex()],
							Integer.parseInt(postCodeText.getText()),
							suburbText.getText(), new AsyncCallback<String>() {

								@Override
								public void onSuccess(String result) {
									Alert.msg("Registration Succeeded!");
									ViewController.showView(Views.SignIn);
								}

								@Override
								public void onFailure(Throwable caught) {
									Alert.alert(caught.getMessage());

								}
							});
			}
		});
		
		popTable();
		mainPanel.add(flexTable);
		return mainPanel;
	}

	private boolean checkField() {
		try {
			Integer.parseInt(postCodeText.getText());
		} catch (Exception e) {
			Alert.alert("Postcode can only be a number");
			return false;
		}
		return true;
	}

	private void popTable() {
		flexTable.setCellPadding(5);
		flexTable.setCellSpacing(15);
		FlexCellFormatter cellFormatter = flexTable.getFlexCellFormatter();
		flexTable.setHTML(0, 0, "<h3>Sign Up</h3>");
		cellFormatter.setColSpan(0, 0, 3);
		cellFormatter.setHorizontalAlignment(0, 0,
				HasHorizontalAlignment.ALIGN_LEFT);

		flexTable.setHTML(1, 0, "First Name *");
		flexTable.setWidget(1, 2, firstNameText);

		flexTable.setHTML(2, 0, "Last Name *");
		flexTable.setWidget(2, 2, lastNameText);

		flexTable.setHTML(3, 0, "Email Address *");
		flexTable.setWidget(3, 2, emailText);

		flexTable.setHTML(4, 0, "Password *");
		flexTable.setWidget(4, 2, passwordText);

		flexTable.setHTML(5, 0, "Re-Password *");
		flexTable.setWidget(5, 2, dummypasswordText);

		flexTable.setHTML(6, 0, "Suburb *");
		flexTable.setWidget(6, 2, suburbText);

		flexTable.setHTML(7, 0, "Postcode *");
		flexTable.setWidget(7, 2, postCodeText);

		flexTable.setHTML(8, 0, "State *");
		flexTable.setWidget(8, 2, stateList);

		cellFormatter.setColSpan(9, 0, 3);
		cellFormatter.setHorizontalAlignment(9, 0,
				HasHorizontalAlignment.ALIGN_RIGHT);

		flexTable.setWidget(9, 0, signupBtn);

	}

	private void popStateList() {

		for (AuState a : AuState.values()) {
			stateList.addItem(a.name());
		}

	}
}
