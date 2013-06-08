package com.glassbox.webinvoice.shared.entity;

import java.io.Serializable;
import javax.persistence.*;

/**
 * The persistent class for the companyemail database table.
 * 
 */
@Entity
@Table(name = "companyemail")
public class CompanyEmail implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private long id;

	private String emailAddress;

	private String password;

	private String smtp;

	// bi-directional many-to-one association to Company
	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "companyID")
	private Company company;

	public CompanyEmail() {
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

	public String getPassword() {
		return this.password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public String getSmtp() {
		return this.smtp;
	}

	public void setSmtp(String smtp) {
		this.smtp = smtp;
	}

	public Company getCompany() {
		return this.company;
	}

	public void setCompany(Company company) {
		this.company = company;
	}

}