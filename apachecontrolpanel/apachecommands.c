#include <stdio.h>
#include <stdlib.h>
#include "constants.h"

void startApache() {
    char *command;
    int *result;
    
    result = malloc(sizeof(int));
    command = "pkexec /etc/init.d/apache2 start";
    runSystemCommand(command, result); 
    if (*result == 0){
        notifyMessage("Apache server started successfully.");
    }
    else {
        notifyMessage("Failed to start apache server.");        
    }
}

void stopApache() {
    char *command;
    int *result;
    
    result = malloc(sizeof(int));
    command = "pkexec /etc/init.d/apache2 stop";
    runSystemCommand(command, result); 
    if (*result == 0){
        notifyMessage("Apache server stopped successfully.");
    }
    else {
        notifyMessage("Failed to stop apache server.");        
    }
}

void restartApache() {
    char *command;
    int *result;
    
    result = malloc(sizeof(int));
    command = "pkexec /etc/init.d/apache2 restart";
    runSystemCommand(command, result); 
    if (*result == 0){
        notifyMessage("Apache server restarted successfully.");
    }
    else {
        notifyMessage("Failed to restart apache server.");        
    }
}

bool IsApacheInstalled() {
    bool response;
    char *command;
    int *result;
    
    result = malloc(sizeof(int));
    command = "sh ./checkapache.sh";
    runSystemCommand(command, result); 
    if (*result == 0){
        response = true;    
    }
    else {
        response = false;
    }
    
    return response;
}
