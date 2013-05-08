package com.glassbox.webinvoice.shared.entity;

import javax.persistence.*;

import com.google.gwt.user.client.rpc.IsSerializable;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

/**
 * The persistent class for the person database table.
 * 
 */
@Entity
@Table(name = "person")
public class Person implements IsSerializable {
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private String id;

	private String firstname;

	private String lastname;

	@Temporal(TemporalType.TIMESTAMP)
	@Column(name = "LOGINTIMESTAMP")
	private Date logintime;

	private String password;

	// bi-directional many-to-one association to Role
	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "roleID")
	private Role role;

	// bi-directional many-to-one association to Address
	@OneToMany(mappedBy = "person", cascade = { CascadeType.ALL })
	private List<Address> addresses = new ArrayList<Address>();

	// bi-directional many-to-one association to Autonum
	@OneToMany(mappedBy = "user")
	private List<Autonum> userAutonums = new ArrayList<Autonum>();

	/*
	 * @OneToMany(mappedBy = "client") private List<Autonum> clientAutonums =
	 * new ArrayList<Autonum>();
	 */

	// bi-directional many-to-one association to Email
	@OneToMany(mappedBy = "person", cascade = { CascadeType.ALL })
	private List<Email> emails = new ArrayList<Email>();

	public void addAddress(Address a) {
		a.setPerson(this);
		addresses.add(a);
	}

	public void addEmail(Email e) {
		e.setPerson(this);
		emails.add(e);
	}

	public Person() {
	}

	public Date getLogintime() {
		return logintime;
	}

	public void setLogintime(Date logintime) {
		this.logintime = logintime;
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

	public String getPassword() {
		return this.password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public Role getRole() {
		return this.role;
	}

	public void setRole(Role role) {
		this.role = role;
	}

	public List<Address> getAddresses() {
		return this.addresses;
	}

	public void setAddresses(List<Address> addresses) {
		this.addresses = addresses;
	}

	public List<Autonum> getUserAutonums() {
		return userAutonums;
	}

	public void setUserAutonums(List<Autonum> userAutonums) {
		this.userAutonums = userAutonums;
	}

	/*
	 * public List<Autonum> getClientAutonums() { return clientAutonums; }
	 * 
	 * public void setClientAutonums(List<Autonum> clientAutonums) {
	 * this.clientAutonums = clientAutonums; }
	 */

	public List<Email> getEmails() {
		return this.emails;
	}

	public void setEmails(List<Email> emails) {
		this.emails = emails;
	}

	public void setRole(RoleType roleType) {
		Role role = new Role();
		role.setId(roleType);
		this.role = role;
	}

}