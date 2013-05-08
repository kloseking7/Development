package com.glassbox.webinvoice.shared.DTOentity;

import com.glassbox.webinvoice.shared.entity.AuState;
import com.google.gwt.user.client.rpc.IsSerializable;

public class StateDTO implements IsSerializable {
	private static final long serialVersionUID = 1L;

	private AuState id;

	private AuState name;

	public AuState getId() {
		return id;
	}

	public void setId(AuState id) {
		this.id = id;
	}

	public AuState getName() {
		return name;
	}

	public void setName(AuState name) {
		this.name = name;
	}

}