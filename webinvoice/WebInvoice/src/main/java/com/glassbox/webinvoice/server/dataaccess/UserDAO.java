package com.glassbox.webinvoice.server.dataaccess;

import com.glassbox.webinvoice.client.model.AuthenticationResult;
import com.glassbox.webinvoice.shared.entity.Person;

public interface UserDAO extends DAO{
	Person findUser(String email);

        
}
