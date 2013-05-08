#
# Generated Makefile - do not edit!
#
# Edit the Makefile in the project folder instead (../Makefile). Each target
# has a -pre and a -post target defined where you can add customized code.
#
# This makefile implements configuration specific macros and targets.


# Environment
MKDIR=mkdir
CP=cp
GREP=grep
NM=nm
CCADMIN=CCadmin
RANLIB=ranlib
CC=gcc
CCC=g++
CXX=g++
FC=gfortran
AS=as

# Macros
CND_PLATFORM=GNU-Linux-x86
CND_DLIB_EXT=so
CND_CONF=Release
CND_DISTDIR=dist
CND_BUILDDIR=build

# Include project Makefile
include Makefile

# Object Directory
OBJECTDIR=${CND_BUILDDIR}/${CND_CONF}/${CND_PLATFORM}

# Object Files
OBJECTFILES= \
	${OBJECTDIR}/apachecommands.o \
	${OBJECTDIR}/command.o \
	${OBJECTDIR}/indicator.o \
	${OBJECTDIR}/main.o \
	${OBJECTDIR}/menu.o \
	${OBJECTDIR}/notify.o


# C Compiler Flags
CFLAGS=

# CC Compiler Flags
CCFLAGS=
CXXFLAGS=

# Fortran Compiler Flags
FFLAGS=

# Assembler Flags
ASFLAGS=

# Link Libraries and Options
LDLIBSOPTIONS=`pkg-config --libs gtk+-3.0` `pkg-config --libs libnotify` `pkg-config --libs appindicator3-0.1`  

# Build Targets
.build-conf: ${BUILD_SUBPROJECTS}
	"${MAKE}"  -f nbproject/Makefile-${CND_CONF}.mk ${CND_DISTDIR}/${CND_CONF}/${CND_PLATFORM}/apachecontrolpanel

${CND_DISTDIR}/${CND_CONF}/${CND_PLATFORM}/apachecontrolpanel: ${OBJECTFILES}
	${MKDIR} -p ${CND_DISTDIR}/${CND_CONF}/${CND_PLATFORM}
	${LINK.c} -o ${CND_DISTDIR}/${CND_CONF}/${CND_PLATFORM}/apachecontrolpanel ${OBJECTFILES} ${LDLIBSOPTIONS}

${OBJECTDIR}/apachecommands.o: apachecommands.c 
	${MKDIR} -p ${OBJECTDIR}
	${RM} $@.d
	$(COMPILE.c) -O2 -I/usr/include/gtk-3.0 -I/usr/include/glib-2.0 -I/usr/lib/x86_64-linux-gnu/glib-2.0/include -I/usr/include/pango-1.0 -I/usr/include/cairo -I/usr/include/gdk-pixbuf-2.0 -I/usr/include/atk-1.0 -I/usr/include/libappindicator3-0.1/libappindicator -I/usr/include/gtk-3.0/gtk -I/usr/include/libnotify `pkg-config --cflags gtk+-3.0` `pkg-config --cflags libnotify` `pkg-config --cflags appindicator3-0.1`   -MMD -MP -MF $@.d -o ${OBJECTDIR}/apachecommands.o apachecommands.c

${OBJECTDIR}/command.o: command.c 
	${MKDIR} -p ${OBJECTDIR}
	${RM} $@.d
	$(COMPILE.c) -O2 -I/usr/include/gtk-3.0 -I/usr/include/glib-2.0 -I/usr/lib/x86_64-linux-gnu/glib-2.0/include -I/usr/include/pango-1.0 -I/usr/include/cairo -I/usr/include/gdk-pixbuf-2.0 -I/usr/include/atk-1.0 -I/usr/include/libappindicator3-0.1/libappindicator -I/usr/include/gtk-3.0/gtk -I/usr/include/libnotify `pkg-config --cflags gtk+-3.0` `pkg-config --cflags libnotify` `pkg-config --cflags appindicator3-0.1`   -MMD -MP -MF $@.d -o ${OBJECTDIR}/command.o command.c

${OBJECTDIR}/indicator.o: indicator.c 
	${MKDIR} -p ${OBJECTDIR}
	${RM} $@.d
	$(COMPILE.c) -O2 -I/usr/include/gtk-3.0 -I/usr/include/glib-2.0 -I/usr/lib/x86_64-linux-gnu/glib-2.0/include -I/usr/include/pango-1.0 -I/usr/include/cairo -I/usr/include/gdk-pixbuf-2.0 -I/usr/include/atk-1.0 -I/usr/include/libappindicator3-0.1/libappindicator -I/usr/include/gtk-3.0/gtk -I/usr/include/libnotify `pkg-config --cflags gtk+-3.0` `pkg-config --cflags libnotify` `pkg-config --cflags appindicator3-0.1`   -MMD -MP -MF $@.d -o ${OBJECTDIR}/indicator.o indicator.c

${OBJECTDIR}/main.o: main.c 
	${MKDIR} -p ${OBJECTDIR}
	${RM} $@.d
	$(COMPILE.c) -O2 -I/usr/include/gtk-3.0 -I/usr/include/glib-2.0 -I/usr/lib/x86_64-linux-gnu/glib-2.0/include -I/usr/include/pango-1.0 -I/usr/include/cairo -I/usr/include/gdk-pixbuf-2.0 -I/usr/include/atk-1.0 -I/usr/include/libappindicator3-0.1/libappindicator -I/usr/include/gtk-3.0/gtk -I/usr/include/libnotify `pkg-config --cflags gtk+-3.0` `pkg-config --cflags libnotify` `pkg-config --cflags appindicator3-0.1`   -MMD -MP -MF $@.d -o ${OBJECTDIR}/main.o main.c

${OBJECTDIR}/menu.o: menu.c 
	${MKDIR} -p ${OBJECTDIR}
	${RM} $@.d
	$(COMPILE.c) -O2 -I/usr/include/gtk-3.0 -I/usr/include/glib-2.0 -I/usr/lib/x86_64-linux-gnu/glib-2.0/include -I/usr/include/pango-1.0 -I/usr/include/cairo -I/usr/include/gdk-pixbuf-2.0 -I/usr/include/atk-1.0 -I/usr/include/libappindicator3-0.1/libappindicator -I/usr/include/gtk-3.0/gtk -I/usr/include/libnotify `pkg-config --cflags gtk+-3.0` `pkg-config --cflags libnotify` `pkg-config --cflags appindicator3-0.1`   -MMD -MP -MF $@.d -o ${OBJECTDIR}/menu.o menu.c

${OBJECTDIR}/notify.o: notify.c 
	${MKDIR} -p ${OBJECTDIR}
	${RM} $@.d
	$(COMPILE.c) -O2 -I/usr/include/gtk-3.0 -I/usr/include/glib-2.0 -I/usr/lib/x86_64-linux-gnu/glib-2.0/include -I/usr/include/pango-1.0 -I/usr/include/cairo -I/usr/include/gdk-pixbuf-2.0 -I/usr/include/atk-1.0 -I/usr/include/libappindicator3-0.1/libappindicator -I/usr/include/gtk-3.0/gtk -I/usr/include/libnotify `pkg-config --cflags gtk+-3.0` `pkg-config --cflags libnotify` `pkg-config --cflags appindicator3-0.1`   -MMD -MP -MF $@.d -o ${OBJECTDIR}/notify.o notify.c

# Subprojects
.build-subprojects:

# Clean Targets
.clean-conf: ${CLEAN_SUBPROJECTS}
	${RM} -r ${CND_BUILDDIR}/${CND_CONF}
	${RM} ${CND_DISTDIR}/${CND_CONF}/${CND_PLATFORM}/apachecontrolpanel

# Subprojects
.clean-subprojects:

# Enable dependency checking
.dep.inc: .depcheck-impl

include .dep.inc
