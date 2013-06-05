package com.glassbox.webinvoice.shared.entity;

import java.io.Serializable;
import javax.persistence.*;

import java.util.ArrayList;
import java.util.List;

/**
 * The persistent class for the item database table.
 * 
 */
@Entity
@Table(name = "item")
public class Item implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private long id;

	private String description;

	private String name;

	private String unitprice;

	// bi-directional many-to-many association to Invoice
	@ManyToMany(mappedBy = "items")
	private List<Invoice> invoices = new ArrayList<Invoice>();

	// bi-directional many-to-many association to Tax
	@ManyToMany
	@JoinTable(name = "item_tax", joinColumns = { @JoinColumn(name = "itemID") }, inverseJoinColumns = { @JoinColumn(name = "taxID") })
	private List<Tax> taxs = new ArrayList<Tax>();

	public Item() {
	}

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public String getDescription() {
		return this.description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public String getName() {
		return this.name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getUnitprice() {
		return this.unitprice;
	}

	public void setUnitprice(String unitprice) {
		this.unitprice = unitprice;
	}

	public List<Invoice> getInvoices() {
		return this.invoices;
	}

	public void setInvoices(List<Invoice> invoices) {
		this.invoices = invoices;
	}

	public List<Tax> getTaxs() {
		return this.taxs;
	}

	public void setTaxs(List<Tax> taxs) {
		this.taxs = taxs;
	}

}