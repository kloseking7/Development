package com.glassbox.webinvoice.shared.entity;

import javax.persistence.*;

import com.google.gwt.user.client.rpc.IsSerializable;

/**
 * The persistent class for the address database table.
 * 
 */
@Entity
@Table(name = "address")
public class Address implements IsSerializable {
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private String id;

	// bi-directional many-to-one association to Person
	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "personID")
	private Person person;

	// bi-directional many-to-one association to State
	@ManyToOne(fetch = FetchType.EAGER)
	@JoinColumn(name = "state")
	private State state;

	// bi-directional many-to-one association to Suburb
	@ManyToOne(fetch = FetchType.EAGER, cascade = { CascadeType.ALL })
	@JoinColumn(name = "suburb")
	private Suburb suburb;

	public Address() {
	}

	public String getId() {
		return this.id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public Person getPerson() {
		return this.person;
	}

	public void setPerson(Person person) {
		this.person = person;
	}

	public State getState() {
		return state;
	}

	public void setState(State state) {
		this.state = state;
	}

	public Suburb getSuburb() {
		return suburb;
	}

	public void setSuburb(Suburb suburb) {
		this.suburb = suburb;
	}

}