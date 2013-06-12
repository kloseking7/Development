package com.glassbox.webinvoice.server.systemtool;

import javax.annotation.PostConstruct;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.glassbox.webinvoice.client.service.CompanyService;
import com.glassbox.webinvoice.client.service.LoginService;
import com.glassbox.webinvoice.shared.entity.State;

@Service
public class Initializer {
	@Autowired
	private LoginService loginService;
	@Autowired
	private CompanyService companyService;

	@PostConstruct
	public void initilize() {
		long cID = companyService.newCompany("webinvoice", 1234 + "", "alex");
		try {
			for (int i = 0; i < 5; i++)
				companyService.addStaff("kevin", "asds", "123@", State.NEW,
						1234, "city", cID, -1);
		} catch (Exception e) {

		}
	}
}
