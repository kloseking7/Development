package com.glassbox.webinvoice.shared.entity;

import java.io.Serializable;

import org.hibernate.annotations.Cascade;
import org.hibernate.annotations.CascadeType;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

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
	@OneToMany(mappedBy = "company")
	@Cascade({ CascadeType.SAVE_UPDATE})
	private List<Staff> staffs = new ArrayList<Staff>();

	@OneToMany(mappedBy = "company")
	private List<Client> customers = new ArrayList<Client>();

	@OneToMany(mappedBy = "company", fetch = FetchType.LAZY)
	private List<Tax> taxs = new ArrayList<Tax>();

	@OneToMany(mappedBy = "company")
	private List<CompanyEmail> companyEmails = new ArrayList<CompanyEmail>();

	public List<Tax> getTaxs() {
		return taxs;
	}

	public void setTaxs(List<Tax> taxs) {
		this.taxs = taxs;
	}

	public List<CompanyEmail> getCompanyEmails() {
		return companyEmails;
	}

	public void setCompanyEmails(List<CompanyEmail> companyEmails) {
		this.companyEmails = companyEmails;
	}

	public List<Client> getCustomers() {
		return customers;
	}

	public void setCustomers(List<Client> customers) {
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