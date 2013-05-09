package com.glassbox.webinvoice.client;

import com.glassbox.webinvoice.shared.DTOentity.PersonDTO;
import com.glassbox.webinvoice.shared.entity.AuState;
import com.google.gwt.user.client.rpc.RemoteService;
import com.google.gwt.user.client.rpc.RemoteServiceRelativePath;

@RemoteServiceRelativePath("services/userService")
public interface UserService extends RemoteService {

	String rigesterUser(String firstName, String lastName, String[] emails,
			String password, AuState state, int postCode, String suburb)
			throws RuntimeException;

	PersonDTO findUser(String email, String password)
			throws RuntimeException;
}
