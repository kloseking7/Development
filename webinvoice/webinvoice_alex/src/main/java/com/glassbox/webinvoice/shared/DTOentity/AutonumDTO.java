package com.glassbox.webinvoice.shared.DTOentity;

import java.io.Serializable;

public class AutonumDTO implements Serializable {
	private static final long serialVersionUID = 1L;

	private String id;

	private String number;

	private String prefix;

	private String suffix;

	private PersonDTO client;

	private PersonDTO user;



	public String getId() {
		return this.id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public PersonDTO getClient() {
		return client;
	}

	public void setClient(PersonDTO client) {
		this.client = client;
	}

	public PersonDTO getUser() {
		return user;
	}

	public void setUser(PersonDTO user) {
		this.user = user;
	}

	public String getNumber() {
		return number;
	}

	public void setNumber(String number) {
		this.number = number;
	}

	public String getPrefix() {
		return prefix;
	}

	public void setPrefix(String prefix) {
		this.prefix = prefix;
	}

	public String getSuffix() {
		return suffix;
	}

	public void setSuffix(String suffix) {
		this.suffix = suffix;
	}

}