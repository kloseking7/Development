/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.glassbox.webinvoice.server.service;

import com.glassbox.webinvoice.client.service.ClientService;
import com.glassbox.webinvoice.shared.entity.Client;
import com.google.gwt.user.server.rpc.RemoteServiceServlet;
import java.util.List;

/**
 *
 * @author mon2
 */
public class ClientServiceImpl extends RemoteServiceServlet implements
        ClientService {

    public List<Client> getClients() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
}
