package com.glassbox.webinvoice.shared.DTOentity;

import com.glassbox.webinvoice.shared.entity.AuState;
import com.google.gwt.user.client.rpc.IsSerializable;

public class StateDTO implements IsSerializable {
	private static final long serialVersionUID = 1L;

	private AuState id;

	private String name;

	public AuState getId() {
		return id;
	}

	public void setId(AuState id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

}