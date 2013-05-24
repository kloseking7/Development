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
public class ContactUs extends Composite {
    
    private static ContactUsUiBinder uiBinder = GWT.create(ContactUsUiBinder.class);
    
    interface ContactUsUiBinder extends UiBinder<Widget, ContactUs> {
    }
    
    public ContactUs() {
        initWidget(uiBinder.createAndBindUi(this));
    }
}