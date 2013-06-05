package com.glassbox.webinvoice.server.dao;

import java.util.List;

import org.springframework.stereotype.Repository;

import com.glassbox.webinvoice.shared.entity.Email;
import com.glassbox.webinvoice.shared.entity.Staff;

@Repository
public class StaffDAO extends BaseDAO<Staff> {

	public StaffDAO() {
		super(Staff.class);
	}

	@SuppressWarnings("unchecked")
	public Staff findStaff(String emailOrUserName) {
		Staff staff = null;

		try {
			staff = (Staff) sf.getCurrentSession()
					.createQuery("from Staff s where s.userName=:userName")
					.setString("userName", emailOrUserName).uniqueResult();
		} catch (Exception e) {

		}
		if (staff == null) {
			List<Email> list = sf.getCurrentSession()
					.createQuery("from Email e where e.emailAddress=:ea")
					.setString("ea", emailOrUserName).list();
			staff = list.isEmpty() ? null : list.get(0).getStaff();
		}
		return staff;
	}

}
