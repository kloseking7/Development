package com.glassbox.webinvoice.shared.DTOentity;

import java.io.Serializable;

import com.glassbox.webinvoice.shared.entity.State;

public class StateDTO implements Serializable {
	private static final long serialVersionUID = 1L;

	private State id;

	private String name;

	public State getId() {
		return id;
	}

	public void setId(State id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

}