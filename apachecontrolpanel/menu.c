#include <gtk.h>
#include <string.h>

static void activate_apache_action(GtkAction *action) {
    const gchar *name = gtk_action_get_name(action);

    char *startAction = "Start";
    char *stopAction = "Stop";
    char *restartAction = "Restart";

    if (strcmp(name, startAction) == 0) {
        startApache();
    }

    if (strcmp(name, stopAction) == 0) {
        stopApache();
    }

    if (strcmp(name, restartAction) == 0) {
        restartApache();
    }
}

static const gchar *ui_apache_info =
        "<ui>"
        "  <popup name='IndicatorPopup'>"
        "    <menuitem action='Start' />"
        "    <menuitem action='Stop' />"
        "    <menuitem action='Restart' />"
        "    <separator/>"
        "    <menuitem action='Quit' />"
        "  </popup>"
        "</ui>";

static const gchar *ui_noapache_info =
        "<ui>"
        "  <popup name='IndicatorPopup'>"
        "    <menuitem action='Message' />"
        "    <separator/>"
        "    <menuitem action='Quit' />"
        "  </popup>"
        "</ui>";
/*
 * 
 */
static GtkActionEntry apache_entries[] = {
    { "FileMenu", NULL, "_Control"},
    { "Start", "apache-start", "_Start", "<control>S", "Start the apache web server", G_CALLBACK(activate_apache_action)},
    { "Stop", "apache-stop", "_Stop", "<control>T", "Stop the apache server", G_CALLBACK(activate_apache_action)},
    { "Restart", "apache-restart", "_Restart", "<control>S", "Restart the apache server", G_CALLBACK(activate_apache_action)},
    { "Quit", "application-exit", "_Quit", "<control>Q", "Exit the application", G_CALLBACK(gtk_main_quit)},
};

static GtkActionEntry no_apache_entries[] = {
    { "FileMenu", NULL, "_Control"},
    { "Message", "no_apache-message", "_Cannot find apache", "<control>C", "cannot find apache", NULL},
    { "Quit", "application-exit", "_Quit", "<control>Q", "Exit the application", G_CALLBACK(gtk_main_quit)},
};

static guint n_apache_entries = G_N_ELEMENTS(apache_entries);
static guint n_noapache_entries = G_N_ELEMENTS(no_apache_entries);

GtkUIManager *createApacheMenu() {
    GtkActionGroup *action_group;
    GtkUIManager *uim;
    GError *error = NULL;

    // Menus
    action_group = gtk_action_group_new("AppActions");
    gtk_action_group_add_actions(action_group, apache_entries, n_apache_entries, NULL);

    uim = gtk_ui_manager_new();
    gtk_ui_manager_insert_action_group(uim, action_group, 0);

    if (!gtk_ui_manager_add_ui_from_string(uim, ui_apache_info, -1, &error)) {
        g_message("Failed to build menus: %s\n", error->message);
        g_error_free(error);
        error = NULL;
    }

    return uim;
}

GtkUIManager *createNoApacheMenu() {
    GtkActionGroup *action_group;
    GtkUIManager *uim;
    GError *error = NULL;
    GtkAction *action;
    
    // Menus
    action_group = gtk_action_group_new("AppActions");
    gtk_action_group_add_actions(action_group, no_apache_entries, n_noapache_entries, NULL);

    //disable message item
    action = gtk_action_group_get_action(action_group, "Message");
    gtk_action_set_sensitive(action, 0);    
    
    uim = gtk_ui_manager_new();
    gtk_ui_manager_insert_action_group(uim, action_group, 0);

    if (!gtk_ui_manager_add_ui_from_string(uim, ui_noapache_info, -1, &error)) {
        g_message("Failed to build menus: %s\n", error->message);
        g_error_free(error);
        error = NULL;
    }

    return uim;
}