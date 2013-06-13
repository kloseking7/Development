package com.glassbox.webinvoice.shared.entity;

import java.io.Serializable;
import javax.persistence.*;

/**
 * The persistent class for the email database table.
 * 
 */
@Entity
@Table(name = "email")
public class Email implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private long id;

	private String emailAddress;

	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "customerID")
	private Client customer;

	public Client getCustomer() {
		return customer;
	}

	public void setCustomer(Client customer) {
		this.customer = customer;
	}

	public Email() {
	}

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public String getEmailAddress() {
		return this.emailAddress;
	}

	public void setEmailAddress(String emailAddress) {
		this.emailAddress = emailAddress;
	}

}