package com.glassbox.webinvoice.shared.entity;

import javax.persistence.*;

import com.google.gwt.user.client.rpc.IsSerializable;

/**
 * The persistent class for the email database table.
 * 
 */
@Entity
@Table(name = "email")
public class Email implements IsSerializable {
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private String id;

	private String emailAddress;

	// bi-directional many-to-one association to Person
	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "personID")
	private Person person;

	public Email() {
	}


	public String getId() {
		return this.id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getEmailAddress() {
		return this.emailAddress;
	}

	public void setEmailAddress(String emailAddress) {
		this.emailAddress = emailAddress;
	}

	public Person getPerson() {
		return this.person;
	}

	public void setPerson(Person person) {
		this.person = person;
	}

}