package com.glassbox.webinvoice.client.ui.controller;

import com.glassbox.webinvoice.shared.model.AuthenticationResult;
import com.glassbox.webinvoice.client.ui.container.Container;
import com.glassbox.webinvoice.client.ui.container.Container.ContainerType;
import com.glassbox.webinvoice.client.ui.footer.Footer;
import com.glassbox.webinvoice.client.ui.header.Header;
import com.glassbox.webinvoice.client.ui.menu.Menu;
import com.glassbox.webinvoice.client.ui.menu.Menu.MenuType;
import com.google.gwt.core.client.GWT;
import com.google.gwt.uibinder.client.UiBinder;
import com.google.gwt.uibinder.client.UiField;
import com.google.gwt.user.client.ui.Composite;
import com.google.gwt.user.client.ui.HTMLPanel;
import com.google.gwt.user.client.ui.Widget;

public class Main extends Composite {
    
    private static MainUiBinder uiBinder = GWT.create(MainUiBinder.class);
    private Header hdr;
    private Menu mnu;
    private Container container;
    private Footer footer;
    
    interface MainUiBinder extends UiBinder<Widget, Main> {
    }
    
    @UiField
            HTMLPanel MainPanel;
    
    public Main() {
        initWidget(uiBinder.createAndBindUi(this));
        hdr = new Header();
        mnu = new Menu(this, MenuType.StandardMenu);
        container = new Container(this, ContainerType.StandardContainer);
        footer = new Footer();
        
        this.MainPanel.add(hdr);
        this.MainPanel.add(mnu);
        this.MainPanel.add(container);
        this.MainPanel.add(footer);
    }
       
    public void UpdateLoginDialog(AuthenticationResult result) {
        if (result.isAuthenticated()) {
            this.container.HideLoginDialog();
            this.MainPanel.clear();
            this.ChangeContextToAuthenticatedUser();
        }
        else {
            this.container.UpdateLoginDialog(result);
        }
    }

    // <editor-fold defaultstate="collapsed" desc="Context switching based on authentication">
    public void ChangeContextToAuthenticatedUser() {
        this.MainPanel.clear();
        mnu.setMenuType(MenuType.AuthenticatedMenu);
        container.setContainerType(ContainerType.AuthenticatedContainer);
        this.MainPanel.add(mnu);
        this.MainPanel.add(container);
        this.MainPanel.add(footer);
    }
    
    public void ChangeContextToNonAuthenticatedUser() {
        this.MainPanel.clear();
        mnu.setMenuType(MenuType.AuthenticatedMenu);
        container.setContainerType(ContainerType.AuthenticatedContainer);
        this.MainPanel.add(hdr);
        this.MainPanel.add(mnu);
        this.MainPanel.add(container);
        this.MainPanel.add(footer);
    }
    // </editor-fold>
    
    // <editor-fold defaultstate="collapsed" desc="View handlers">
    public void ShowLoginDialog() {
        this.container.ShowLoginDialog();
    }
    
    public void ShowHome() {
        this.container.ShowHome();
    }
    
    public void ShowAboutUs() {
        this.container.ShowAboutUs();
    }
    
    public void ShowContactUs() {
        this.container.ShowContactUs();
    }
    
    public void ShowServices() {
        this.container.ShowServices();
    }

    public void ShowClients() {
        //temporary workaround until we implement session management.
        this.container.setContainerType(ContainerType.AuthenticatedContainer);
        this.container.ShowClients();
    }

    public void ShowDashboard() {
        //temporary workaround until we implement session management.
        this.container.setContainerType(ContainerType.AuthenticatedContainer);
        this.container.ShowDashboard();
    }
    // </editor-fold>
}
