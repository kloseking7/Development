package com.glassbox.webinvoice.client.ui.menu;

import com.glassbox.webinvoice.client.ui.Main;
import com.google.gwt.core.client.GWT;
import com.google.gwt.dom.client.AnchorElement;
import com.google.gwt.dom.client.Element;
import com.google.gwt.event.dom.client.ClickEvent;
import com.google.gwt.event.dom.client.ClickHandler;
import com.google.gwt.uibinder.client.UiBinder;
import com.google.gwt.uibinder.client.UiField;
import com.google.gwt.uibinder.client.UiHandler;
import com.google.gwt.user.client.DOM;
import com.google.gwt.user.client.Event;
import com.google.gwt.user.client.Window;
import com.google.gwt.user.client.ui.Anchor;
import com.google.gwt.user.client.ui.Composite;
import com.google.gwt.user.client.ui.Widget;

public class Menu extends Composite {
    
    private static MenuUiBinder uiBinder = GWT.create(MenuUiBinder.class);
    private Object mainPanel;
    
    interface MenuUiBinder extends UiBinder<Widget, Menu> {
    }
    
    @UiField AnchorElement Login;
  
    
    public Menu(Object panel) {
        initWidget(uiBinder.createAndBindUi(this));
        this.mainPanel = panel;
        Anchor a = Anchor.wrap(Login);
        a.addClickHandler(new LoginClickHandler());
    }
    
    
    private class LoginClickHandler implements ClickHandler {

        public void onClick(ClickEvent event) {
            ((Main)mainPanel).ShowLoginDialog();
        }
    }
}

