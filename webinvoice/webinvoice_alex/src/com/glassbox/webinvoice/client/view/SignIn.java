package com.glassbox.webinvoice.client.view;

import com.glassbox.webinvoice.client.UserService;
import com.glassbox.webinvoice.client.UserServiceAsync;
import com.glassbox.webinvoice.shared.DTOentity.PersonDTO;
import com.google.gwt.core.client.GWT;
import com.google.gwt.event.dom.client.ClickEvent;
import com.google.gwt.event.dom.client.KeyCodes;
import com.google.gwt.event.dom.client.KeyUpEvent;
import com.google.gwt.uibinder.client.UiBinder;
import com.google.gwt.uibinder.client.UiField;
import com.google.gwt.uibinder.client.UiHandler;
import com.google.gwt.user.client.rpc.AsyncCallback;
import com.google.gwt.user.client.ui.Button;
import com.google.gwt.user.client.ui.Composite;
import com.google.gwt.user.client.ui.TextBox;
import com.google.gwt.user.client.ui.Widget;

public class SignIn extends Composite {
	private final UserServiceAsync userService = GWT.create(UserService.class);
	private static SignInUiBinder uiBinder = GWT.create(SignInUiBinder.class);

	interface SignInUiBinder extends UiBinder<Widget, SignIn> {
	}

	public SignIn() {
		initWidget(uiBinder.createAndBindUi(this));
	}

	@UiField
	TextBox email;
	@UiField
	TextBox password;
	@UiField
	Button signInBtn;

	@UiHandler("signInBtn")
	void onClick(ClickEvent e) {
		findUser();
	}

	@UiHandler(value = { "email", "password" })
	void onKey(KeyUpEvent e) {
		if (e.getNativeKeyCode() == KeyCodes.KEY_ENTER)
			findUser();
	}

	private void findUser() {
		userService.findUser(email.getText(), password.getText(),
				new AsyncCallback<PersonDTO>() {
					public void onFailure(Throwable caught) {
						Alert.alert(caught.getMessage(), AlertLevel.ERROR);
					}

					@Override
					public void onSuccess(PersonDTO person) {
						Alert.alert("Hello " + person.getFirstname(),
								AlertLevel.MSG);

					}
				});

	}

}
