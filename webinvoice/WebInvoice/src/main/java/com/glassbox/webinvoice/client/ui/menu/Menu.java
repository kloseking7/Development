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

    @UiField HTMLPanel MenuPanel;
    @UiField DivElement Menu;
    @UiField DivElement AuthMenu;
    @UiField HTMLPanel Home;
    @UiField HTMLPanel Services;
    @UiField HTMLPanel AboutUs;
    @UiField HTMLPanel ContactUs;
    @UiField HTMLPanel Login;
    @UiField HTMLPanel Dashboard;
    @UiField HTMLPanel Clients;
    @UiField HTMLPanel Invoices;
    @UiField HTMLPanel Reciepts;
    @UiField HTMLPanel Products;
    @UiField HTMLPanel Logout;    
    
    public Menu(Object panel, MenuType type) {
        initWidget(uiBinder.createAndBindUi(this));
        this.mainPanel = panel;
        this.Menu.setId("menu");
        this.AuthMenu.setId("authmenu"); 
        if (type == MenuType.StandardMenu) {
            CreateMenu();
        }
        else if (type == MenuType.AuthenticatedMenu) {
            CreateMenuForAuthenticatedUser();
        }
    }
    
    public void setMenuType(MenuType type){
        if (type == MenuType.StandardMenu) {
            CreateMenu();
        }
        else if (type == MenuType.AuthenticatedMenu) {
            CreateMenuForAuthenticatedUser();
        }        
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
        Anchor AnchorDashboard = new Anchor();
        Anchor AnchorClients = new Anchor();
        Anchor AnchorInvoices = new Anchor();
        Anchor AnchorReciepts = new Anchor();
        Anchor AnchorProducts = new Anchor();
        Anchor AnchorLogout = new Anchor();
        
        Menu.getStyle().setDisplay(Display.NONE);
        AuthMenu.getStyle().setDisplay(Display.BLOCK);
        
        AnchorDashboard.setHTML("<a href=\"#\">Dashboard</a>");
        AnchorClients.setHTML("<a href=\"#\">Clients</a>");
        AnchorInvoices.setHTML("<a href=\"#\">Invoices</a>");
        AnchorReciepts.setHTML("<a href=\"#\">Reciepts</a>");
        AnchorProducts.setHTML("<a href=\"#\">Products</a>");
        AnchorLogout.setHTML("<a href=\"#\">Logout</a>");        

        Dashboard.add(AnchorDashboard);
        Clients.add(AnchorClients);
        Invoices.add(AnchorInvoices);
        Reciepts.add(AnchorReciepts);
        Products.add(AnchorProducts);
        Logout.add(AnchorLogout);
        
        AnchorDashboard.addClickHandler(new DashboardClickHandler());
        AnchorClients.addClickHandler(new ClientsClickHandler());
        AnchorInvoices.addClickHandler(new ServicesClickHandler());
        AnchorReciepts.addClickHandler(new AboutUsClickHandler());
        AnchorProducts.addClickHandler(new ContactUsClickHandler());
        AnchorLogout.addClickHandler(new LogoutClickHandler());
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

    private class DashboardClickHandler implements ClickHandler {
        public void onClick(ClickEvent event) {
            ((Main)mainPanel).ShowDashboard();
        }
    }

    private class ClientsClickHandler implements ClickHandler {
        public void onClick(ClickEvent event) {
            ((Main)mainPanel).ShowClients();
        }
    }
        
    private class LogoutClickHandler implements ClickHandler {
        public void onClick(ClickEvent event) {
            ((Main)mainPanel).ChangeContextToNonAuthenticatedUser();
        }
    }
}

