#include <string.h>
#include <stdio.h>
#include "notify.h"
#include "command.h"
#include "constants.h"


void runPOpenCommand(char *cmd, char *output){
    FILE *fp;
    char buff[MAX_COMMAND_OUTPUT_LENGTH];

    // Setup our pipe for reading and execute our command.
    fp = popen(cmd, "r");

    if (!fp) {
        fprintf(stderr, "Could not open pipe for output.\n");
        return;
    }

    //grab data from process execution
    while(fgets(buff, sizeof(buff), fp)!=NULL){
        strcat(output, buff);            
    }

    if (pclose(fp) != 0)
        fprintf(stderr, " Error: Failed to close command stream \n");
}

void runSystemCommand(char*cmd, int* result){
    *result = system(cmd);     
}
