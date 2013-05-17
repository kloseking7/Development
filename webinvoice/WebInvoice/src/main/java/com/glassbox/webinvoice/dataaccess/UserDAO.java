package com.glassbox.webinvoice.dataaccess;

import com.glassbox.webinvoice.shared.entity.Person;

public interface UserDAO extends DAO{
	Person findUser(String email);
}
