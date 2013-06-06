package com.glassbox.webinvoice.server.dataaccess;

import java.io.Serializable;
import java.util.List;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;

public abstract class BaseDAO<E> {
    protected Class<E> entityClass;
    
    @Autowired
    protected SessionFactory sf;
    
    public BaseDAO(Class<E> entityClass) {
        this.entityClass = entityClass;
    }
    
    public SessionFactory getSessionFactory() {
        return sf;
    }
    
    public Serializable save(E entity) {
        return sf.getCurrentSession().save(entity);
    }
    
    public void update(E entity) {
        // System.out.println("updating " + entity.getClass().getSimpleName());
        sf.getCurrentSession().update(entity);
    }
    
    public void delete(E entity) {
        // System.out.println("deleting " + entity.getClass().getSimpleName());
        sf.getCurrentSession().delete(entity);
    }
    
    @SuppressWarnings("unchecked")
    public E find(Serializable id) {
        // System.out.println("finding " + object + " with ID " + id);
        return (E) sf.getCurrentSession().get(entityClass, id);
    }
    
    @SuppressWarnings("unchecked")
    public List<E> findAll() {
        return sf.getCurrentSession()
                .createQuery("from " + entityClass.getSimpleName() + " x")
                .list();
    }
}
