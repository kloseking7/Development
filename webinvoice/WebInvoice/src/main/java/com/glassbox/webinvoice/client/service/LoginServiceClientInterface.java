/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.glassbox.webinvoice.client.service;

import com.glassbox.webinvoice.client.model.AuthenticationResult;

/**
 *
 * @author mon2
 */
public interface LoginServiceClientInterface {
    void authenticateUser(String name, String password);    
}
