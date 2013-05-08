#include <app-indicator.h>
#include <gtk-3.0/gtk/gtk.h>
#include "menu.h"
#include "apachecommands.h"

void createIndicator() {
    AppIndicator *indicator;
    GtkWidget *indicator_menu;

    indicator = app_indicator_new("apache-control-panel", "indicator-messages", APP_INDICATOR_CATEGORY_APPLICATION_STATUS);
    if (IsApacheInstalled() == true){
        indicator_menu = gtk_ui_manager_get_widget(createApacheMenu(), "/ui/IndicatorPopup");        
    }
    else {
        indicator_menu = gtk_ui_manager_get_widget(createNoApacheMenu(), "/ui/IndicatorPopup");
    }  

    app_indicator_set_status(indicator, APP_INDICATOR_STATUS_ACTIVE);
    app_indicator_set_icon_theme_path(indicator, "/home/mon2/projectsroot/linux/ApacheControlPanel/");
    app_indicator_set_icon(indicator, "default");

    app_indicator_set_menu(indicator, GTK_MENU(indicator_menu));
}
