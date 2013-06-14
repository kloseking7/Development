package com.glassbox.webinvoice.shared.entity;

import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name = "Phone")
public class Phone implements Serializable{
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;

	private Long number;
	@Enumerated(EnumType.STRING)
	private PhoneType phoneType;

	public Long getNumber() {
		return number;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public void setNumber(Long number) {
		this.number = number;
	}

	public PhoneType getPhoneType() {
		return phoneType;
	}

	public void setPhoneType(PhoneType phoneType) {
		this.phoneType = phoneType;
	}

	public User getUser() {
		return user;
	}

	public void setUser(User user) {
		this.user = user;
	}

	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "userID")
	private User user;

	public enum PhoneType {
		MOB, HOM, WRK, FAX
	}
}
