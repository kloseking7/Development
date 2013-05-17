package com.glassbox.webinvoice.dataaccess;

import java.io.Serializable;
import java.util.List;

public interface DAO {
	Serializable saveEntity(Object entity);

	void updateEntity(Object entity);

	void deleteEntity(Object entity);

	Object find(Class<?> object, Serializable id);

	List<?> findAll(Class<?> object);
}
