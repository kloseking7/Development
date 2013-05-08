/* 
 * File:   menu.h
 * Author: mon2
 *
 * Created on 21 March 2013, 3:36 PM
 */

#ifndef MENU_H
#define	MENU_H

#ifdef	__cplusplus
extern "C" {
#endif

#include <glib.h>
#include <app-indicator.h>

    static void activate_apache_action(GtkAction *action);
    GtkUIManager *createApacheMenu();
    GtkUIManager *createNoApacheMenu();
    
#ifdef	__cplusplus
}
#endif

#endif	/* MENU_H */

