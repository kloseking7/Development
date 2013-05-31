package com.glassbox.webinvoice.server.dataaccess;

import com.glassbox.webinvoice.client.model.AuthenticationResult;
import java.util.List;

import javax.annotation.PostConstruct;

import org.springframework.stereotype.Repository;
import com.glassbox.webinvoice.shared.entity.Email;
import com.glassbox.webinvoice.shared.entity.Person;
import com.glassbox.webinvoice.shared.entity.User;
import java.util.HashSet;
import org.hibernate.SQLQuery;

@Repository
public class UserDAOImpl extends BaseDAO implements UserDAO  {
    
    @PostConstruct
            void test (){
        System.out.println("setted");
    }
    
    @SuppressWarnings("rawtypes")
    public Person findUser(String email) {
        System.out.println(sf);
        List result = sf.getCurrentSession().createQuery("from Email e where e.emailAddress=:ea").setString("ea", email).list();
        return  result.isEmpty() ? null : ((Email) result.get(0)).getPerson();
    }
    
    /**
     * Authenticate user login against the database
     * @param username
     * @param password
     * @return
     */
    public AuthenticationResult authenticateUser(String username, String password) {
        AuthenticationResult auth = null;
        User user = null;
        
        SQLQuery query = sf.getCurrentSession().createSQLQuery("CALL " +
                "get_authenticateUser(:username,:password)");
        
        query.addEntity(AuthenticationResult.class);
        query.setParameter("username", username);
        query.setParameter("password", password);
        
        List result = query.list();
        for(int i=0; i<result.size(); i++){
            user = (User)result.get(i);
        }
        
        if (auth != null) {
            auth.setAuthenticated(true);
        }
        return auth;
    }
}
