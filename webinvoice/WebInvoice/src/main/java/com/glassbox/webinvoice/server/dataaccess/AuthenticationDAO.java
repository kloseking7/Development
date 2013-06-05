/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.glassbox.webinvoice.server.dataaccess;

import com.glassbox.webinvoice.client.model.AuthenticationResult;
import com.glassbox.webinvoice.server.dataaccess.DAO;

/**
 *
 * @author msushil
 */
public interface AuthenticationDAO extends DAO {
    AuthenticationResult authenticateUser(String username, String password);
}
