/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.glassbox.webinvoice.client.ui.container.pages;

import com.google.gwt.core.client.GWT;
import com.google.gwt.uibinder.client.UiBinder;
import com.google.gwt.user.client.ui.Composite;
import com.google.gwt.user.client.ui.Widget;

/**
 *
 * @author msushil
 */
public class Clients extends Composite {
    
    private static ClientsUiBinder uiBinder = GWT.create(ClientsUiBinder.class);
    
    interface ClientsUiBinder extends UiBinder<Widget, Clients> {
    }
    
    public Clients() {
        initWidget(uiBinder.createAndBindUi(this));
    }
}