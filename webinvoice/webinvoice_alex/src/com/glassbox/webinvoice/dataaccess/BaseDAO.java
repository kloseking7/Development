package com.glassbox.webinvoice.dataaccess;

import java.io.Serializable;
import java.util.List;

import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;

public abstract class BaseDAO implements DAO {
	@Autowired
	protected SessionFactory sf;

	@Override
	public Serializable saveEntity(Object entity) {
		return sf.getCurrentSession().save(entity);
	}

	@Override
	public void updateEntity(Object entity) {
		// System.out.println("updating " + entity.getClass().getSimpleName());
		sf.getCurrentSession().update(entity);
	}

	@Override
	public void deleteEntity(Object entity) {
		// System.out.println("deleting " + entity.getClass().getSimpleName());
		sf.getCurrentSession().delete(entity);
	}

	@Override
	public Object find(Class<?> object, Serializable id) {
		// System.out.println("finding " + object + " with ID " + id);
		return sf.getCurrentSession().get(object, id);
	}

	@Override
	public List<?> findAll(Class<?> object) {
		// System.out.println("finding " + object + " with ID " + id);
		return sf.getCurrentSession()
				.createQuery("from " + object.getSimpleName() + " x").list();
	}

}
