package com.glassbox.webinvoice.server.dataaccess;

import java.util.List;

import org.springframework.stereotype.Repository;

import com.glassbox.webinvoice.shared.entity.Address;
import com.glassbox.webinvoice.shared.entity.State;
@Repository
public class AddressDAO extends BaseDAO<Address, Long> {

	public AddressDAO() {
		super(Address.class);
		// TODO Auto-generated constructor stub
	}

	@SuppressWarnings("unchecked")
	public List<State> findStates() {
		return sf.getCurrentSession().createQuery("from State s").list();
	}

	public State findState(long ID) {
		return (State) sf.getCurrentSession().load(State.class, ID);
	}

}
