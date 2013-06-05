package com.glassbox.webinvoice.shared.DTOentity;

import java.io.Serializable;


/**
 * The persistent class for the suburb database table.
 * 
 */

public class SuburbDTO implements Serializable {
	private static final long serialVersionUID = 1L;

	private String id;

	private int postcode;

	private String suburb;




	public String getId() {
		return this.id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public int getPostcode() {
		return this.postcode;
	}

	public void setPostcode(int postcode) {
		this.postcode = postcode;
	}

	public String getSuburb() {
		return this.suburb;
	}

	public void setSuburb(String suburb) {
		this.suburb = suburb;
	}

	
}