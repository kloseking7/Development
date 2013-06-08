package com.glassbox.webinvoice.server.service;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Random;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.glassbox.webinvoice.client.service.CompanyService;

import com.glassbox.webinvoice.server.dataaccess.*;
import com.glassbox.webinvoice.shared.DTOentity.RealEmail;
import com.glassbox.webinvoice.shared.entity.Address;
import com.glassbox.webinvoice.shared.entity.Company;
import com.glassbox.webinvoice.shared.entity.CompanyEmail;
import com.glassbox.webinvoice.shared.entity.Email;
import com.glassbox.webinvoice.shared.entity.RoleType;
import com.glassbox.webinvoice.shared.entity.Staff;
import com.glassbox.webinvoice.shared.entity.State;
import com.glassbox.webinvoice.shared.entity.Suburb;

@Transactional(rollbackFor = Exception.class)
@Service("companyService")
public class CompanyServiceImpl implements CompanyService {
	
	private static final String CHARACTERS = "0123456789ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz";
	@Autowired
	private StaffDAO staffDAO;
	@Autowired
	private AddressDAO addressDAO;
	@Autowired
	private CompanyDAO companyDAO;
	@Autowired
	private ClientDAO clientDAO;
	@Autowired
	private MailService mailService;

//	@Override
//	public long newCompany(String companyName, String managerPassword,
//			String firstName, String lastName, String emailAddress,
//			String suburb, int postcode, State state) {
//		Company company = new Company();
//		company.setName(companyName);
//		companyDAO.save(company);
//		Staff staff = new Staff();
//		staff.setCompany(company);
//		staff.setEnabled(true);
//		staff.setFirstname(firstName);
//		staff.setLastname(lastName);
//		staff.setLogintime(new Date());
//		staff.setPassword(managerPassword);
//		staff.setRole(RoleType.MANAGER);
//		Email email = new Email();
//		email.setStaff(staff);
//		email.setEmailAddress(emailAddress);
//		staff.getEmails().add(email);
//		Address address = new Address();
//		address.setState(state);
//		Suburb sb = new Suburb();
//		sb.setSuburb(suburb);
//		address.setSuburb(sb);
//		staff.setAddress(address);
//		return staffDAO.save(staff);
//	}

	@Override
	public void setCompanyEmail(String[] emails, String[] smtps,
			String[] passwords, long companyID) {
		Company company = companyDAO.find(companyID);
		for (int i = 0; i < emails.length; i++) {
			CompanyEmail ce = new CompanyEmail();
			ce.setCompany(company);
			ce.setEmailAddress(emails[i]);
			ce.setPassword(passwords[i]);
			ce.setSmtp(smtps[i]);
			company.getCompanyEmails().add(ce);
		}

	}

	@Override
	public void updateCompany(long companyID, String companyName) {
		Company company = companyDAO.find(companyID);
		company.setName(companyName);
	}

	@Override
	public void addStaff(String firstName, String lastName,
			String emailAddress, State state, int postCode, String suburb,
			long companyID, long companyEmailID) {
		Staff staff = new Staff();
		Company company = companyDAO.find(companyID);
		// assemblying the new staff attribute
		staff.setCompany(company);
		staff.setEnabled(true);
		staff.setFirstname(firstName);
		staff.setLastname(lastName);
		staff.setRole(RoleType.STAFF);
		String generatePassword = generatePassword();
		staff.setPassword(generatePassword);
		Email email = new Email();
		email.setStaff(staff);
		email.setEmailAddress(emailAddress);
		staff.getEmails().add(email);
		Address address = new Address();
		address.setState(state);
		Suburb sb = new Suburb();
		sb.setSuburb(suburb);
		address.setSuburb(sb);
		staff.setAddress(address);

//		RealEmail realEmail = new RealEmail();
//		realEmail.setContent("Hello ur password is " + generatePassword);
//		realEmail.setSubject("Password");
//		realEmail.addReipien(emailAddress);
//		try {
//			for (CompanyEmail e : company.getCompanyEmails()) {
//				if (e.getId() == companyEmailID) {
//					mailService.sendEmail(realEmail, e.getSmtp(),
//							e.getEmailAddress(), e.getEmailAddress(),
//							e.getPassword());
//					break;
//				}
//			}
//		} catch (Exception e) {
//			e.printStackTrace();
//			throw new RuntimeException("Unable to send email");
//		}

		company.getStaffs().add(staff);

	}

	@Override
	public void updateStaff(long staffID, String firstName, String lastName,
			String password, String emailAddress, State state, int postCode,
			String suburb) {
		Staff staff = staffDAO.find(staffID);
		staff.setFirstname(firstName);
		staff.setLastname(lastName);
		staff.getEmails().get(0).setEmailAddress(emailAddress);
		staff.setPassword(password);
		staff.getAddress().getSuburb().setPostcode(postCode);
		staff.getAddress().getSuburb().setSuburb(suburb);
		staff.getAddress().setState(state);
	}

	@Override
	public void disableStaff(long staffID) {
		Staff staff = staffDAO.find(staffID);
		staff.setEnabled(false);
	}

	@Override
	public void enableStaff(long staffID) {
		Staff staff = staffDAO.find(staffID);
		staff.setEnabled(true);
	}

	/*
	 * @Override public List<StaffDTO> listStaffs(long companyID, int page) {
	 * return null; }
	 */

	@Override
	public long newCompany(String companyName, String managerPassword,
			String userName) {
		Company company = new Company();
		company.setName(companyName);
		Staff staff = new Staff();
		staff.setCompany(company);
		staff.setRole(RoleType.MANAGER);
		staff.setUserName(userName);
		staff.setPassword(managerPassword);
		company.getStaffs().add(staff);
		return companyDAO.save(company);
	}

	@Override
	public void deleteCompany() {
		companyDAO.deleteCompanys();

	}

	@Override
	public void deleteCompany(long id) {

	}

	@Override
	public void updateCompany(Company company) {

		companyDAO.update(company);

	}

	/*
	 * @Override public List<StaffDTO> listStaffs(long companyID, int page) {
	 * return null; }
	 */
	
	private String generatePassword() {
		Random random = new Random();
		String result = "";
		for (int i = 0; i < 8; i++)
			result += CHARACTERS.charAt(random.nextInt(CHARACTERS.length()))
					+ "";
		return result;
	}

}
