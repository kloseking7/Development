package com.glassbox.webinvoice.shared.entity;

import java.io.Serializable;
import javax.persistence.*;

import java.util.ArrayList;
import java.util.List;

/**
 * The persistent class for the tax database table.
 * 
 */
@Entity
@Table(name = "tax")
public class Tax implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private long id;

	private String name;

	private double percentage;

	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "companyID")
	private Company company;

	public Company getCompany() {
		return company;
	}

	public void setCompany(Company company) {
		this.company = company;
	}

	public Tax() {
	}

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return this.name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public double getPercentage() {
		return percentage;
	}

	public void setPercentage(double percentage) {
		this.percentage = percentage;
	}

}