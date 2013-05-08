#!/bin/sh
# 
# File:   checkapache.sh
# Author: mon2
#
# Created on 01/04/2013, 1:57:00 PM
#
if dpkg-query -Wf'${db:Status-abbrev}' "apache2" 2>/dev/null | grep -q '^i'; then
    return 0;
else
    return 1;
fi
