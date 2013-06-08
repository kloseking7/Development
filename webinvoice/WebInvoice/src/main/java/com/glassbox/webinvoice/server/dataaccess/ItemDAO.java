package com.glassbox.webinvoice.server.dataaccess;

import org.springframework.stereotype.Repository;

import com.glassbox.webinvoice.shared.entity.Item;
@Repository
public class ItemDAO extends BaseDAO<Item,Long>{

	public ItemDAO() {
		super(Item.class);
		// TODO Auto-generated constructor stub
	}

}
