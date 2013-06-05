/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.glassbox.webinvoice.server.dataaccess;

import com.glassbox.webinvoice.client.model.AuthenticationResult;
import com.glassbox.webinvoice.shared.entity.User;
import java.util.List;
import org.hibernate.SQLQuery;
import org.hibernate.Session;
import org.hibernate.SessionFactory;

/**
 *
 * @author msushil
 */
public class AuthenticationDAOImpl extends BaseDAO implements AuthenticationDAO  {
        /**
     * Authenticate user login against the database
     * @param username
     * @param password
     * @return
     */
    public AuthenticationResult authenticateUser(String username, String password) {
        AuthenticationResult auth = new AuthenticationResult();
        User user = null;
        String sql;
        
        try
        {
            sql = "CALL get_authenticateUser(:username,:password)";
            SessionFactory sf = SessionFactoryManager.getSessionFactory();
            Session session = sf.getCurrentSession();
            session.beginTransaction();
            SQLQuery query = session.createSQLQuery(sql);
            
            query.addEntity(AuthenticationResult.class);
            query.setParameter("username", username);
            query.setParameter("password", password);
            
            List result = query.list();

            for(int i=0; i<result.size(); i++){
                user = (User)result.get(i);
            }
            
            session.getTransaction().commit();
                        
            if (auth != null) {
                auth.setAuthenticated(true);
            }
            return auth;
        }
        catch (Throwable ex)
        {
            throw new ExceptionInInitializerError(ex);
        }
    }
    
}
