package com.glassbox.webinvoice.shared.DTOentity;

import java.io.Serializable;

public class AddressDTO implements Serializable {
	private static final long serialVersionUID = 1L;

	private String id;

	private StateDTO state;

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

	public StateDTO getState() {
		return state;
	}

	public void setState(StateDTO state) {
		this.state = state;
	}

	public SuburbDTO getSuburb() {
		return suburb;
	}

	public void setSuburb(SuburbDTO suburb) {
		this.suburb = suburb;
	}

}