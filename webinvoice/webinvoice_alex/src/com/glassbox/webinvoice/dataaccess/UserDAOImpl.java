package com.glassbox.webinvoice.dataaccess;

import java.util.List;

import org.springframework.stereotype.Repository;
import com.glassbox.webinvoice.shared.entity.Email;
import com.glassbox.webinvoice.shared.entity.Person;

@Repository
public class UserDAOImpl extends BaseDAO implements UserDAO  {

	@SuppressWarnings("rawtypes")
	public Person findUser(String email) {
		List result = sf.getCurrentSession().createQuery("from Email e where e.emailAddress=:ea").setString("ea", email).list();
		return  result.isEmpty() ? null : ((Email) result.get(0)).getPerson();
	}
}
