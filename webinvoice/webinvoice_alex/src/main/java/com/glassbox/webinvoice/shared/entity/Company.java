package com.glassbox.webinvoice.shared.entity;

import java.io.Serializable;
import javax.persistence.*;

import java.util.ArrayList;
import java.util.List;

/**
 * The persistent class for the company database table.
 * 
 */
@Entity
@Table(name = "company")
public class Company implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private long id;

	private String name;

	// bi-directional many-to-one association to Staff
	@OneToMany(mappedBy = "company", cascade = { CascadeType.REMOVE })
	private List<Staff> staffs = new ArrayList<Staff>();

	@OneToMany(mappedBy = "company", cascade = { CascadeType.REMOVE })
	private List<Customer> customers = new ArrayList<Customer>();

	@OneToMany(mappedBy = "company", cascade = { CascadeType.ALL }, fetch = FetchType.LAZY)
	private List<Tax> taxs = new ArrayList<Tax>();

	public List<Tax> getTaxs() {
		return taxs;
	}

	public void setTaxs(List<Tax> taxs) {
		this.taxs = taxs;
	}

	public List<Customer> getCustomers() {
		return customers;
	}

	public void setCustomers(List<Customer> customers) {
		this.customers = customers;
	}

	public Company() {
	}

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public String getName() {
		return this.name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public List<Staff> getStaffs() {
		return this.staffs;
	}

	public void setStaffs(List<Staff> staffs) {
		this.staffs = staffs;
	}

}