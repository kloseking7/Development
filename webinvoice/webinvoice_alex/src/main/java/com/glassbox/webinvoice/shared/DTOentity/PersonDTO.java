package com.glassbox.webinvoice.shared.DTOentity;

import com.google.gwt.user.client.rpc.IsSerializable;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

/**
 * The persistent class for the person database table.
 * 
 */

public class PersonDTO implements IsSerializable {
	private static final long serialVersionUID = 1L;

	private String id;

	private String firstname;

	private String lastname;

	private Date logintime;

	private String password;

	private RoleDTO role;

	private List<EmailDTO> emails = new ArrayList<EmailDTO>();

	private List<AddressDTO> addresses = new ArrayList<AddressDTO>();

	private List<AutonumDTO> userAutonums = new ArrayList<AutonumDTO>();

	public PersonDTO() {
	}

	public List<EmailDTO> getEmails() {
		return emails;
	}

	public void setEmails(List<EmailDTO> emails) {
		this.emails = emails;
	}

	public List<AddressDTO> getAddresses() {
		return addresses;
	}

	public void setAddresses(List<AddressDTO> addresses) {
		this.addresses = addresses;
	}

	public List<AutonumDTO> getUserAutonums() {
		return userAutonums;
	}

	public void setUserAutonums(List<AutonumDTO> userAutonums) {
		this.userAutonums = userAutonums;
	}

	public String getId() {
		return this.id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getFirstname() {
		return this.firstname;
	}

	public void setFirstname(String firstname) {
		this.firstname = firstname;
	}

	public String getLastname() {
		return this.lastname;
	}

	public void setLastname(String lastname) {
		this.lastname = lastname;
	}



	public Date getLogintime() {
		return logintime;
	}

	public void setLogintime(Date logintime) {
		this.logintime = logintime;
	}

	public String getPassword() {
		return this.password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public RoleDTO getRole() {
		return role;
	}

	public void setRole(RoleDTO role) {
		this.role = role;
	}

}