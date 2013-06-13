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
 * @author mon2
 */
public class Dashboard extends Composite {
    
    private static DashboardUiBinder uiBinder = GWT.create(DashboardUiBinder.class);
    
    interface DashboardUiBinder extends UiBinder<Widget, Dashboard> {
    }
    
    public Dashboard() {
        initWidget(uiBinder.createAndBindUi(this));
    }
}