package com.glassbox.webinvoice.server.dataaccess;

import org.springframework.stereotype.Repository;

import com.glassbox.webinvoice.shared.entity.Client;
@Repository
public class ClientDAO extends BaseDAO<Client,Long>{

	public ClientDAO() {
		super(Client.class);
		// TODO Auto-generated constructor stub
	}

}
