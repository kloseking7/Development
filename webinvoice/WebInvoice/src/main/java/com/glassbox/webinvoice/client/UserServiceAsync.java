package com.glassbox.webinvoice.client;

import com.glassbox.webinvoice.shared.DTOentity.PersonDTO;
import com.glassbox.webinvoice.shared.entity.AuState;
import com.google.gwt.user.client.rpc.AsyncCallback;

public interface UserServiceAsync {

	void rigesterUser(String firstName, String lastName, String[] emails,
			String password, AuState state, int postCode, String suburb,
			AsyncCallback<String> callback) throws RuntimeException;

	void findUser(String email, String password,
			AsyncCallback<PersonDTO> callback) throws RuntimeException;
}
