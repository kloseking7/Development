package com.glassbox.webinvoice.shared.DTOentity;

import java.io.Serializable;
import com.glassbox.webinvoice.shared.entity.RoleType;

public class RoleDTO implements Serializable {
	private static final long serialVersionUID = 1L;

	
	private RoleType id;

	private String name;

	public RoleType getId() {
		return id;
	}

	public void setId(RoleType id) {
		this.id = id;
	}

	public String getName() {
		return this.name;
	}

	public void setName(String name) {
		this.name = name;
	}

	
}