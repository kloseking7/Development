/* 
 * File:   command.h
 * Author: mon2
 *  
 * Created on 26 March 2013, 11:33 AM
 */

#ifndef COMMAND_H
#define	COMMAND_H

#ifdef	__cplusplus
extern "C" {
#endif

    void runPOpenCommand(char *cmd, char *output);
    void runSystemCommand(char*cmd, int* result);

#ifdef	__cplusplus
}
#endif

#endif	/* COMMAND_H */

