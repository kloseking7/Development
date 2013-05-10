package com.glassbox.webinvoice.shared.DTOentity;

import java.io.Serializable;
import javax.persistence.*;

import com.glassbox.webinvoice.shared.entity.RoleType;
import com.google.gwt.user.client.rpc.IsSerializable;

import java.util.List;

public class RoleDTO implements IsSerializable {
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