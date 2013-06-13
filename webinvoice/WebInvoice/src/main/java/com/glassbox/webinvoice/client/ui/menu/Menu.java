package com.glassbox.webinvoice.client.ui.menu;

import com.glassbox.webinvoice.client.ui.controller.Main;
import com.google.gwt.core.client.GWT;
import com.google.gwt.dom.client.DivElement;
import com.google.gwt.dom.client.Style.Display;
import com.google.gwt.event.dom.client.ClickEvent;
import com.google.gwt.event.dom.client.ClickHandler;
import com.google.gwt.uibinder.client.UiBinder;
import com.google.gwt.uibinder.client.UiField;
import com.google.gwt.user.client.ui.Anchor;
import com.google.gwt.user.client.ui.Composite;
import com.google.gwt.user.client.ui.HTMLPanel;
import com.google.gwt.user.client.ui.Widget;

public class Menu extends Composite {
    
    private static MenuUiBinder uiBinder = GWT.create(MenuUiBinder.class);
    private Object mainPanel;
    public enum MenuType {
        StandardMenu, AuthenticatedMenu
    }
    
    interface MenuUiBinder extends UiBinder<Widget, Menu> {
    }
    
    @UiField DivElement Menu;
    @UiField DivElement AuthMenu;
    @UiField HTMLPanel Home;
    @UiField HTMLPanel Services;
    @UiField HTMLPanel AboutUs;
    @UiField HTMLPanel ContactUs;
    @UiField HTMLPanel Login;
    
    
    public Menu(Object panel) {
        initWidget(uiBinder.createAndBindUi(this));
        initializeFields(panel);        
        CreateMenu();
    }
    
    public Menu(Object panel, MenuType type) {
        initWidget(uiBinder.createAndBindUi(this));
        initializeFields(panel);  
        if (type == MenuType.StandardMenu) {
            CreateMenu();
        }
        else if (type == MenuType.AuthenticatedMenu) {
            CreateMenuForAuthenticatedUser();
        }
        else {
            CreateMenu();
        }
    }
    
    private void initializeFields(Object panel) {
        this.mainPanel = panel;
        this.Menu.setId("menu");
        this.AuthMenu.setId("authmenu");
    }
    
    private void CreateMenu() {
        Anchor AnchorHome = new Anchor();
        Anchor AnchorServices = new Anchor();
        Anchor AnchorAboutUs = new Anchor();
        Anchor AnchorContactUs = new Anchor();
        Anchor AnchorLogin = new Anchor();
        
        Menu.getStyle().setDisplay(Display.BLOCK);
        AuthMenu.getStyle().setDisplay(Display.NONE);
        
        AnchorHome.setHTML("<a href=\"#\">Home</a>");
        AnchorServices.setHTML("<a href=\"#\">Services</a>");
        AnchorAboutUs.setHTML("<a href=\"#\">About Us</a>");
        AnchorContactUs.setHTML("<a href=\"#\">Contact Us</a>");
        AnchorLogin.setHTML("<a href=\"#\">Login</a>");
        
        Home.add(AnchorHome);
        Services.add(AnchorServices);
        AboutUs.add(AnchorAboutUs);
        ContactUs.add(AnchorContactUs);
        Login.add(AnchorLogin);
        
        AnchorHome.addClickHandler(new HomeClickHandler());
        AnchorServices.addClickHandler(new ServicesClickHandler());
        AnchorAboutUs.addClickHandler(new AboutUsClickHandler());
        AnchorContactUs.addClickHandler(new ContactUsClickHandler());
        AnchorLogin.addClickHandler(new LoginClickHandler());
    }
    
    private void CreateMenuForAuthenticatedUser() {
        Anchor AnchorClients = new Anchor();
        Anchor AnchorInvoices = new Anchor();
        Anchor AnchorReciepts = new Anchor();
        Anchor AnchorProducts = new Anchor();
        
        Menu.getStyle().setDisplay(Display.NONE);
        AuthMenu.getStyle().setDisplay(Display.BLOCK);
        
        AnchorClients.setHTML("<a href=\"#\">Clients</a>");
        AnchorInvoices.setHTML("<a href=\"#\">Invoices</a>");
        AnchorReciepts.setHTML("<a href=\"#\">Reciepts</a>");
        AnchorProducts.setHTML("<a href=\"#\">Products</a>");
        
        Home.add(AnchorClients);
        Services.add(AnchorInvoices);
        AboutUs.add(AnchorReciepts);
        ContactUs.add(AnchorProducts);
    }
    
    
    
    
    private class HomeClickHandler implements ClickHandler {
        public void onClick(ClickEvent event) {
            ((Main)mainPanel).ShowHome();
        }
    }
    
    private class ServicesClickHandler implements ClickHandler {
        public void onClick(ClickEvent event) {
            ((Main)mainPanel).ShowServices();
        }
    }
    
    private class AboutUsClickHandler implements ClickHandler {
        public void onClick(ClickEvent event) {
            ((Main)mainPanel).ShowAboutUs();
        }
    }
    
    private class ContactUsClickHandler implements ClickHandler {
        public void onClick(ClickEvent event) {
            ((Main)mainPanel).ShowContactUs();
        }
    }
    
    private class LoginClickHandler implements ClickHandler {
        public void onClick(ClickEvent event) {
            ((Main)mainPanel).ShowLoginDialog();
        }
    }
    
}

