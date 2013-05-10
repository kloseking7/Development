package com.glassbox.webinvoice.shared.entity;

import javax.persistence.*;

import com.google.gwt.user.client.rpc.IsSerializable;

/**
 * The persistent class for the autonum database table.
 * 
 */
@Entity
@Table(name = "autonum")
public class Autonum implements IsSerializable {
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private String id;

	private String number;

	private String prefix;

	private String suffix;

	// bi-directional many-to-one association to Person
	@ManyToOne(fetch = FetchType.EAGER)
	@JoinColumn(name = "clientID")
	private Person client;

	// bi-directional many-to-one association to Person
	@ManyToOne(fetch = FetchType.EAGER)
	@JoinColumn(name = "userID")
	private Person user;

	public Autonum() {
	}

	public String getId() {
		return this.id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public Person getClient() {
		return client;
	}

	public void setClient(Person client) {
		this.client = client;
	}

	public Person getUser() {
		return user;
	}

	public void setUser(Person user) {
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