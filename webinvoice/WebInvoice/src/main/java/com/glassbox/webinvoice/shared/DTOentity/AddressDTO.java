package com.glassbox.webinvoice.shared.DTOentity;

import com.google.gwt.user.client.rpc.IsSerializable;

public class AddressDTO implements IsSerializable {
	private static final long serialVersionUID = 1L;

	private String id;


	private SuburbDTO suburb;

	private PersonDTO person;

	public PersonDTO getPerson() {
		return person;
	}

	public void setPerson(PersonDTO person) {
		this.person = person;
	}

	public String getId() {
		return this.id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public SuburbDTO getSuburb() {
		return suburb;
	}

	public void setSuburb(SuburbDTO suburb) {
		this.suburb = suburb;
	}

}