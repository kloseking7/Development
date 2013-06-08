package com.glassbox.webinvoice.server.dataaccess;

import org.springframework.stereotype.Repository;

import com.glassbox.webinvoice.shared.entity.Invoice;
@Repository
public class InvoiceDAO extends BaseDAO<Invoice, Long> {

	public InvoiceDAO() {
		super(Invoice.class);
		// TODO Auto-generated constructor stub
	}

}
