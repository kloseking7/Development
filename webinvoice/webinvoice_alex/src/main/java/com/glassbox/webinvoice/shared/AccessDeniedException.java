package com.glassbox.webinvoice.shared;

import java.io.Serializable;


@SuppressWarnings("serial")
public class AccessDeniedException extends RuntimeException implements
		Serializable {
	public AccessDeniedException() {
		super();

	}
}
