/* 
 * File:   main.c
 * Author: mon2
 *
 * Created on 19 March 2013, 10:34 AM
 */

#include <stdio.h>
#include <stdlib.h>
#include <gtk.h>
#include <app-indicator.h>
#include "indicator.h"

int main(int argc, char **argv) {
    gtk_init(&argc, &argv);
    createIndicator();
    gtk_main();  

    return EXIT_SUCCESS;
}

