/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.glassbox.webinvoice.shared.entity;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import javax.persistence.Basic;
import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import javax.xml.bind.annotation.XmlRootElement;

/**
 * 
 * @author mon2
 */
@Entity
@Table(name = "user")
@XmlRootElement
@NamedQueries({
		@NamedQuery(name = "User.findAll", query = "SELECT u FROM User u"),
		@NamedQuery(name = "User.findById", query = "SELECT u FROM User u WHERE u.id = :id"),
		@NamedQuery(name = "User.findByUsername", query = "SELECT u FROM User u WHERE u.username = :username"),
		@NamedQuery(name = "User.findByFirstname", query = "SELECT u FROM User u WHERE u.firstname = :firstname"),
		@NamedQuery(name = "User.findByLastname", query = "SELECT u FROM User u WHERE u.lastname = :lastname"),
		@NamedQuery(name = "User.findByPassword", query = "SELECT u FROM User u WHERE u.password = :password"),
		@NamedQuery(name = "User.findByLogintimestamp", query = "SELECT u FROM User u WHERE u.logintimestamp = :logintimestamp") })
public class User implements Serializable {
	private static final long serialVersionUID = 1L;
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Basic(optional = false)
	@Column(name = "id")
	private Long id;

	@Column(name = "username")
	private String username;

	@Column(name = "firstname")
	private String firstname;

	@Column(name = "lastname")
	private String lastname;

	@Column(name = "password")
	private String password;

	@Column(name = "logintimestamp")
	@Temporal(TemporalType.TIMESTAMP)
	private Date logintimestamp;

	@OneToMany(mappedBy = "user", fetch = FetchType.LAZY)
	private List<Address> address = new ArrayList<Address>();

	// bi-directional many-to-one association to Invoice
	@OneToMany(mappedBy = "user", fetch = FetchType.LAZY)
	private List<Invoice> invoices = new ArrayList<Invoice>();

	@OneToMany(mappedBy = "user", cascade = { CascadeType.ALL }, fetch = FetchType.LAZY)
	private List<Email> emails = new ArrayList<Email>();

	@OneToMany(mappedBy = "user", cascade = { CascadeType.ALL }, fetch = FetchType.LAZY)
	private List<Phone> phones = new ArrayList<Phone>();

	public List<Phone> getPhones() {
		return phones;
	}

	public void setPhones(List<Phone> phones) {
		this.phones = phones;
	}

	@Enumerated(EnumType.STRING)
	private Role role;

	public User() {
	}

	public List<Address> getAddress() {
		return address;
	}

	public void setAddress(List<Address> address) {
		this.address = address;
	}

	public List<Invoice> getInvoices() {
		return invoices;
	}

	public void setInvoices(List<Invoice> invoices) {
		this.invoices = invoices;
	}

	public List<Email> getEmails() {
		return emails;
	}

	public void setEmails(List<Email> emails) {
		this.emails = emails;
	}

	public Role getRole() {
		return role;
	}

	public void setRole(Role role) {
		this.role = role;
	}

	public User(Long id) {
		this.id = id;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	public String getFirstname() {
		return firstname;
	}

	public void setFirstname(String firstname) {
		this.firstname = firstname;
	}

	public String getLastname() {
		return lastname;
	}

	public void setLastname(String lastname) {
		this.lastname = lastname;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public Date getLogintimestamp() {
		return logintimestamp;
	}

	public void setLogintimestamp(Date logintimestamp) {
		this.logintimestamp = logintimestamp;
	}

	@Override
	public int hashCode() {
		int hash = 0;
		hash += (id != null ? id.hashCode() : 0);
		return hash;
	}

	@Override
	public boolean equals(Object object) {
		// TODO: Warning - this method won't work in the case the id fields are
		// not set
		if (!(object instanceof User)) {
			return false;
		}
		User other = (User) object;
		if ((this.id == null && other.id != null)
				|| (this.id != null && !this.id.equals(other.id))) {
			return false;
		}
		return true;
	}

	@Override
	public String toString() {
		return "com.glassbox.webinvoice.shared.entity.User[ id=" + id + " ]";
	}

}
