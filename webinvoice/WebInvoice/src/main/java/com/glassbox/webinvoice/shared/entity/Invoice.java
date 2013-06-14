package com.glassbox.webinvoice.shared.entity;

import java.io.Serializable;
import javax.persistence.*;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

/**
 * The persistent class for the invoice database table.
 * 
 */
@Entity
@Table(name = "invoice")
public class Invoice implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private long id;

	@Temporal(TemporalType.DATE)
	private Date date;

	private String description;

	private String type;

	// bi-directional many-to-one association to Customer
	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "userID")
	private User user;

	// bi-directional many-to-many association to Item
	@ManyToMany
	@JoinTable(name = "invoice_item", joinColumns = { @JoinColumn(name = "invoice_id") }, inverseJoinColumns = { @JoinColumn(name = "item_id") })
	private List<Item> items = new ArrayList<Item>();

	@Enumerated(EnumType.STRING)
	private DocumentType documentType;

	public DocumentType getDocumentType() {
		return documentType;
	}

	public void setDocumentType(DocumentType documentType) {
		this.documentType = documentType;
	}

	public Invoice() {
	}

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public Date getDate() {
		return this.date;
	}

	public void setDate(Date date) {
		this.date = date;
	}

	public String getDescription() {
		return this.description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public String getType() {
		return this.type;
	}

	public void setType(String type) {
		this.type = type;
	}

	public User getUser() {
		return user;
	}

	public void setUser(User user) {
		this.user = user;
	}

	public List<Item> getItems() {
		return this.items;
	}

	public void setItems(List<Item> items) {
		this.items = items;
	}

}