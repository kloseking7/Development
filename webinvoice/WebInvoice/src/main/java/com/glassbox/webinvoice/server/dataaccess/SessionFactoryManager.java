/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.glassbox.webinvoice.server.dataaccess;

import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;
import org.hibernate.service.ServiceRegistryBuilder;

/**
 *
 * @author mon2
 */
public class SessionFactoryManager {
    private static final SessionFactory sessionFactory;

    static {
        try {
            //
            // Build a SessionFactory object from session-factory configuration
            // defined in the hibernate.cfg.xml file. In this file we register
            // the JDBC connection information, connection pool, the hibernate
            // dialect that we used and the mapping to our hbm.xml file for each
            // Pojo (Plain Old Java Object).
            //
            Configuration configuration = new Configuration();
            configuration.configure("hibernate.cfg.xml");
            ServiceRegistryBuilder serviceRegistryBuilder = new ServiceRegistryBuilder().applySettings(configuration
                            .getProperties());
            sessionFactory = configuration.buildSessionFactory(serviceRegistryBuilder.buildServiceRegistry());
        } catch (Throwable e) {
            System.err.println("Error in creating SessionFactory object."
                    + e.getMessage());
            throw new ExceptionInInitializerError(e);
        }
    }

    /**
     * A static method for other application to get SessionFactory object
     * initialized in this helper class.
     */
    public static SessionFactory getSessionFactory() {
        return sessionFactory;
    }

}
