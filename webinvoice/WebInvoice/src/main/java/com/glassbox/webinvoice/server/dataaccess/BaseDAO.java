package com.glassbox.webinvoice.server.dataaccess;

import java.io.Serializable;
import java.util.List;

public abstract class BaseDAO implements DAO {

    public Serializable saveEntity(Object entity) {
		return SessionFactoryManager.getSessionFactory().getCurrentSession().save(entity);
	}


	public void updateEntity(Object entity) {
		// System.out.println("updating " + entity.getClass().getSimpleName());
		SessionFactoryManager.getSessionFactory().getCurrentSession().update(entity);
	}


	public void deleteEntity(Object entity) {
		// System.out.println("deleting " + entity.getClass().getSimpleName());
		SessionFactoryManager.getSessionFactory().getCurrentSession().delete(entity);
	}


	public Object find(Class<?> object, Serializable id) {
		// System.out.println("finding " + object + " with ID " + id);
		return SessionFactoryManager.getSessionFactory().getCurrentSession().get(object, id);
	}


	public List<?> findAll(Class<?> object) {
		// System.out.println("finding " + object + " with ID " + id);
		return SessionFactoryManager.getSessionFactory().getCurrentSession()
				.createQuery("from " + object.getSimpleName() + " x").list();
	}

}
