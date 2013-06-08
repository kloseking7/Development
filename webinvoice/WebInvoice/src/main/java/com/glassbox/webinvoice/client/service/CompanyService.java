package com.glassbox.webinvoice.client.service;

import java.util.List;

import com.glassbox.webinvoice.shared.entity.Company;
import com.glassbox.webinvoice.shared.entity.State;


//currently just for testing purpose
public interface CompanyService {

//	long newCompany(String companyName, String managerPassword,
//			String firstName, String lastName, String email, String suburb,
//			int postcode, State state);

	long newCompany(String companyName, String managerPassword, String userName);

	void setCompanyEmail(String emails[], String[] smtps, String passwords[],
			long companyID);

	void updateCompany(long companyID, String companyName);
	void updateCompany(Company company);
	
	void addStaff(String firstName, String lastName, String email, State state,
			int postCode, String suburb, long companyID, long companyEmailID)
			throws Exception;

	void updateStaff(long staffID, String firstName, String lastName,
			String password, String email, State state, int postCode,
			String suburb);

	void disableStaff(long staffID);

	void enableStaff(long staffID);

	//List<StaffDTO> listStaffs(long companyID, int page);
	
	void deleteCompany();
	void deleteCompany(long id);
}
