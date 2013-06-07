package com.glassbox.webinvoice.client.ui.container;

import com.glassbox.webinvoice.client.model.AuthenticationResult;
import com.glassbox.webinvoice.client.ui.container.pages.AboutUs;
import com.glassbox.webinvoice.client.ui.container.pages.Clients;
import com.glassbox.webinvoice.client.ui.container.pages.ContactUs;
import com.glassbox.webinvoice.client.ui.container.pages.HomePage;
import com.glassbox.webinvoice.client.ui.container.pages.LoginBox;
import com.glassbox.webinvoice.client.ui.container.pages.Services;
import com.google.gwt.core.client.GWT;
import com.google.gwt.uibinder.client.UiBinder;
import com.google.gwt.uibinder.client.UiField;
import com.google.gwt.user.client.ui.Composite;
import com.google.gwt.user.client.ui.HTMLPanel;
import com.google.gwt.user.client.ui.Widget;

public class Container extends Composite {
    
    private static ContainerUiBinder uiBinder = GWT
            .create(ContainerUiBinder.class);
    private HomePage home;
    private AboutUs aboutus;
    private ContactUs contactus;
    private Services services;
    private LoginBox login;
    private Clients clients;
    
    public enum ContainerType {
        StandardContainer, AuthenticatedContainer
    }
    
    
    interface ContainerUiBinder extends UiBinder<Widget, Container> {
    }
    
    @UiField
            HTMLPanel ContainerPanel;
    
    
    public Container(Object mainPanel) {
        home = new HomePage();
        aboutus = new AboutUs();
        login = new LoginBox(mainPanel);
        contactus = new ContactUs();
        services = new Services();
        
        initWidget(uiBinder.createAndBindUi(this));
        ContainerPanel.add(home);
    }
    
    public Container(Object mainPanel, ContainerType type) {
        if (type == ContainerType.StandardContainer) {
            home = new HomePage();
            aboutus = new AboutUs();
            login = new LoginBox(mainPanel);
            contactus = new ContactUs();
            services = new Services();
            initWidget(uiBinder.createAndBindUi(this));
            ContainerPanel.add(home);
        }
        else if (type == ContainerType.AuthenticatedContainer) {
            clients = new Clients();            
            initWidget(uiBinder.createAndBindUi(this));
            ContainerPanel.add(clients);
        }
        else {
            home = new HomePage();
            aboutus = new AboutUs();
            login = new LoginBox(mainPanel);
            contactus = new ContactUs();
            services = new Services();
            initWidget(uiBinder.createAndBindUi(this));
            ContainerPanel.add(home);
        }
    }
    
    public void ShowHome() {
        this.ContainerPanel.clear();
        this.ContainerPanel.add(home);
    }
    
    public void ShowServices() {
        this.ContainerPanel.clear();
        this.ContainerPanel.add(services);
    }
    
    public void ShowContactUs() {
        this.ContainerPanel.clear();
        this.ContainerPanel.add(contactus);
    }
    
    public void ShowAboutUs() {
        this.ContainerPanel.clear();
        this.ContainerPanel.add(aboutus);
    }
    
    public void ShowLoginDialog() {
        this.login.show();
    }
    
    public void HideLoginDialog() {
        this.login.hide();
    }
    
    public void UpdateLoginDialog(AuthenticationResult result) {
        this.login.UpdateLoginDialog(result);
    }
}
