package com.glassbox.webinvoice.shared.entity;

import javax.persistence.*;

import com.google.gwt.user.client.rpc.IsSerializable;

import java.util.List;

/**
 * The persistent class for the state database table.
 * 
 */
@Entity
@Table(name = "state")
public class State implements IsSerializable {

	private static final long serialVersionUID = 1L;

	@Id
	@Enumerated(value = EnumType.ORDINAL)
	private AuState id;

	private String name;

	// bi-directional many-to-one association to Address
	@OneToMany(mappedBy = "state", fetch = FetchType.EAGER)
	private List<Address> addresses;

	public State() {
	}

	public AuState getId() {
		return id;
	}

	public void setId(AuState id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public List<Address> getAddresses() {
		return this.addresses;
	}

	public void setAddresses(List<Address> addresses) {
		this.addresses = addresses;
	}

}