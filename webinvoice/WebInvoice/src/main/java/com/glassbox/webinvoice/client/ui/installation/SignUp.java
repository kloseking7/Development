//package com.glassbox.webinvoice.client.ui.installation;
//
//import com.glassbox.webinvoice.client.ui.alert.AlertLevel;
//import com.glassbox.webinvoice.client.ui.alert.Alert;
//import com.glassbox.webinvoice.client.service.UserService;
//import com.glassbox.webinvoice.client.service.UserServiceAsync;
//import com.glassbox.webinvoice.shared.entity.AuState;
//import com.google.gwt.core.client.GWT;
//import com.google.gwt.event.dom.client.ClickEvent;
//import com.google.gwt.uibinder.client.UiBinder;
//import com.google.gwt.uibinder.client.UiField;
//import com.google.gwt.uibinder.client.UiHandler;
//import com.google.gwt.user.client.rpc.AsyncCallback;
//import com.google.gwt.user.client.ui.Button;
//import com.google.gwt.user.client.ui.PasswordTextBox;
//import com.google.gwt.user.client.ui.TextBox;
//import com.google.gwt.user.client.ui.Composite;
//import com.google.gwt.user.client.ui.ListBox;
//import com.google.gwt.user.client.ui.Widget;
//
//public class SignUp extends Composite {
//
//	private final UserServiceAsync userService = GWT.create(UserService.class);
//	private static SignUpUiBinder uiBinder = GWT.create(SignUpUiBinder.class);
//
//	interface SignUpUiBinder extends UiBinder<Widget, SignUp> {
//	}
//
//	public SignUp() {
//		initWidget(uiBinder.createAndBindUi(this));
//		for (AuState a : AuState.values()) {
//			state.addItem(a.name());
//		}
//	}
//
//	@UiField
//	TextBox firstName;
//	@UiField
//	TextBox lastName;
//	@UiField
//	TextBox email;
//	@UiField
//	PasswordTextBox password;
//	@UiField
//	PasswordTextBox password2;
//	@UiField
//	TextBox suburb;
//	@UiField
//	TextBox postcode;
//	@UiField
//	ListBox state;
//	@UiField
//	Button signUpBtn;
//
//	@UiHandler("signUpBtn")
//	void onClick(ClickEvent e) {
//		if (checkField())
//			signUpUser();
//	}
//
//	private boolean checkField() {
//		try {
//			Integer.parseInt(postcode.getText());
//		} catch (Exception e) {
//			Alert.show("Postcode can only be a number", AlertLevel.ERROR);
//			return false;
//		}
//		return true;
//	}
//
//	private void signUpUser() {
//		if (checkField())
//			userService.registerUser(firstName.getText(), lastName.getText(),
//					new String[] { email.getText() }, password.getText(),
//					AuState.values()[state.getSelectedIndex()],
//					Integer.parseInt(postcode.getText()), suburb.getText(),
//					new AsyncCallback<String>() {
//
//						public void onSuccess(String result) {
//							Alert.show("Registration Succeeded!",
//									AlertLevel.MSG);
//							//ViewController.showView(Views.SignIn);
//						}
//
//						public void onFailure(Throwable caught) {
//							Alert.show(caught.getMessage(), AlertLevel.ERROR);
//
//						}
//					});
//
//	}
//
//}
