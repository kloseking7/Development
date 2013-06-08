package com.glassbox.webinvoice.server.dataaccess;

import com.glassbox.webinvoice.shared.entity.User;
import org.springframework.stereotype.Repository;

@Repository
public class UserDAO extends BaseDAO<User,Long> {
    
    	public UserDAO() {
		super(User.class);
	}
        
	@SuppressWarnings("unchecked")
	public User findUser(String username) {
		User user = null;

		try {
			user = (User) sf.getCurrentSession()
					.createQuery("from User u where u.username=:username")
					.setString("username", username).uniqueResult();
		} catch (Exception e) {

		}

		return user;
	}

        @SuppressWarnings("unchecked")
	public User authenticateUser(String login, String password) {
		User user = null;

		try {
			user = (User) super.getSessionFactory().getCurrentSession()
					.createQuery("from User u where u.username=:username")
					.setString("username", login).uniqueResult();
		} catch (Exception e) {

		}

		return user;
	}
        
}
