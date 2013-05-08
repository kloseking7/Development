package com.glassbox.webinvoice.client.view;

import com.glassbox.webinvoice.client.AccessDeniedException;
import com.glassbox.webinvoice.client.component.MyButton;
import com.glassbox.webinvoice.shared.DTOentity.PersonDTO;
import com.google.gwt.event.dom.client.ClickEvent;
import com.google.gwt.event.dom.client.ClickHandler;
import com.google.gwt.event.dom.client.KeyCodes;
import com.google.gwt.event.dom.client.KeyUpEvent;
import com.google.gwt.event.dom.client.KeyUpHandler;
import com.google.gwt.user.client.rpc.AsyncCallback;
import com.google.gwt.user.client.ui.Button;
import com.google.gwt.user.client.ui.FlexTable;
import com.google.gwt.user.client.ui.FlexTable.FlexCellFormatter;
import com.google.gwt.user.client.ui.FlowPanel;
import com.google.gwt.user.client.ui.HasHorizontalAlignment;
import com.google.gwt.user.client.ui.HorizontalPanel;
import com.google.gwt.user.client.ui.PasswordTextBox;
import com.google.gwt.user.client.ui.TextBox;
import com.google.gwt.user.client.ui.Widget;

public class SignInView extends MyView {
	private final FlowPanel mainPanel = new FlowPanel();
	private final HorizontalPanel buttonPanel = new HorizontalPanel();
	private final FlowPanel tablePanel = new FlowPanel();
	private final FlexTable flexTable = new FlexTable();
	private final Button signInBtn = new MyButton("Sign In", "btn btn-primary");
	private final Button signUpBtn = new MyButton("Sign Up", "btn btn-primary");
	private final TextBox emailText = new TextBox();
	private final PasswordTextBox passwordText = new PasswordTextBox();

	@Override
	public Widget load() {

		signInBtn.addStyleName("offset5");
		signUpBtn.addStyleName("offset2");
		mainPanel.addStyleName("wrapped-box");
		flexTable.addStyleName("centered");

		flexTable.setCellSpacing(15);
		FlexCellFormatter cellFormatter = flexTable.getFlexCellFormatter();
		flexTable.setHTML(0, 0, "<h3>Sign In</h3>");
		cellFormatter.setColSpan(0, 0, 3);
		cellFormatter.setHorizontalAlignment(0, 0,
				HasHorizontalAlignment.ALIGN_LEFT);
		flexTable.setCellPadding(15);
		flexTable.setHTML(1, 0, "Email Address");
		flexTable.setWidget(1, 2, emailText);
		flexTable.setHTML(2, 0, "Password");
		flexTable.setWidget(2, 2, passwordText);

		tablePanel.add(flexTable);
		buttonPanel.add(signUpBtn);
		buttonPanel.add(signInBtn);

		mainPanel.add(tablePanel);
		mainPanel.add(buttonPanel);

		MyHandler handler = new MyHandler();
		signInBtn.addClickHandler(handler);
		emailText.addKeyUpHandler(handler);
		passwordText.addKeyUpHandler(handler);

		signUpBtn.addClickHandler(new ClickHandler() {

			@Override
			public void onClick(ClickEvent event) {
				ViewController.showView(Views.SignUp);
			}

		});
		
		return mainPanel;
	}

	class MyHandler implements ClickHandler, KeyUpHandler {

		public void onClick(ClickEvent event) {
			findUser();
		}

		public void onKeyUp(KeyUpEvent event) {
			if (event.getNativeKeyCode() == KeyCodes.KEY_ENTER) {
				findUser();
			}
		}

		private void findUser() {

			userService.findUser(emailText.getText(), passwordText.getText(),
					new AsyncCallback<PersonDTO>() {
						public void onFailure(Throwable caught) {
							
								Alert.alert(caught.getMessage());
						}

						@Override
						public void onSuccess(PersonDTO person) {
							Alert.msg("Hello " + person.getFirstname());

						}
					});

		}
	}
}
