package com.glassbox.webinvoice.server.dataaccess;

import java.util.List;

import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.glassbox.webinvoice.shared.entity.Email;
import com.glassbox.webinvoice.shared.entity.Staff;

@Repository
public class StaffDAO extends BaseDAO<Staff, Long> {

	public StaffDAO() {
		super(Staff.class);
		// TODO Auto-generated constructor stub
	}

	public Staff findStaff(String login, String password) {
		Staff staff = null;
		
		try {
			
			staff = (Staff) sf
					.getCurrentSession()
					.createQuery(
							"from Staff s where s.userName=:userName and password=:password")
					.setString("userName", login)
					.setString("password", password).uniqueResult();

			if (staff == null) {
				Email email = (Email) sf
						.getCurrentSession()
						.createQuery(
								"from Email e where e.emailAddress=:ea and e.staff.password=:password")
						.setString("ea", login).setString("password", password)
						.uniqueResult();
				staff = email == null ? null : email.getStaff();
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
		return staff;
	}
}
