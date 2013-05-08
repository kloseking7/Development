/* 
 * File:   apachecommands.h
 * Author: mon2
 *
 * Created on 29 March 2013, 6:43 PM
 */

#ifndef APACHECOMMANDS_H
#define	APACHECOMMANDS_H

#ifdef	__cplusplus
extern "C" {
#endif
#include "constants.h"
    
void startApache();
void stopApache();
void restartApache();
bool IsApacheInstalled();

#ifdef	__cplusplus
}
#endif

#endif	/* APACHECOMMANDS_H */

