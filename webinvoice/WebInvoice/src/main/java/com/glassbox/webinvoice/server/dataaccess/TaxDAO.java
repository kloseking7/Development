package com.glassbox.webinvoice.server.dataaccess;

import java.util.List;

import org.springframework.stereotype.Repository;

import com.glassbox.webinvoice.shared.entity.Tax;
@Repository
public class TaxDAO extends BaseDAO<Tax, Long> {

	public TaxDAO() {
		super(Tax.class);
		// TODO Auto-generated constructor stub
	}

	
}
