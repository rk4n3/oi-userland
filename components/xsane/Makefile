#
# This file and its contents are supplied under the terms of the
# Common Development and Distribution License ("CDDL)". You may
# only use this file in accordance with the terms of the CDDL.
#
# A full copy of the text of the CDDL should have accompanied this
# source. A copy of the CDDL is also available via the Internet at
# http://www.illumos.org/license/CDDL.
#

#
# Copyright (c) 2014 Alexander Pyhalov
#

include ../../make-rules/shared-macros.mk

COMPONENT_NAME=		xsane
COMPONENT_VERSION=	0.999
COMPONENT_PROJECT_URL=	http://www.xsane.org
COMPONENT_SUMMARY=	Graphical scanning frontend for the SANE scanner interface
COMPONENT_FMRI=		image/scanner/xsane
COMPONENT_CLASSIFICATION=	Applications/System Utilities
COMPONENT_SRC=		$(COMPONENT_NAME)-$(COMPONENT_VERSION)
COMPONENT_ARCHIVE=	$(COMPONENT_SRC).tar.gz
COMPONENT_ARCHIVE_HASH=	\
    sha256:5782d23e67dc961c81eef13a87b17eb0144cae3d1ffc5cf7e0322da751482b4b
COMPONENT_ARCHIVE_URL=	http://www.xsane.org/download/$(COMPONENT_ARCHIVE)
COMPONENT_CLASSIFICATION = Applications/System Utilities
COMPONENT_FMRI = image/scanner/xsane
COMPONENT_LICENSE = GPLv2
COMPONENT_LICENSE_FILE = xsane.COPYING


include $(WS_TOP)/make-rules/prep.mk
include $(WS_TOP)/make-rules/configure.mk
include $(WS_TOP)/make-rules/ips.mk

PATH = /usr/gnu/bin:/usr/bin

COMPONENT_PREP_ACTION =        (chmod -R u+rw  $(SOURCE_DIR))

# Missing files in build dir for configure without this.
COMPONENT_PRE_CONFIGURE_ACTION =        ( cp -a $(SOURCE_DIR)/* $(@D))

CONFIGURE_SCRIPT=$(@D)/configure

CONFIGURE_OPTIONS+=	--sysconfdir=/etc
CONFIGURE_OPTIONS+=	--libexecdir=/usr/lib
CONFIGURE_OPTIONS+=	--localstatedir=/var/lib

# common targets
build:		$(BUILD_32)

install:	$(INSTALL_32)

test:		$(NO_TESTS)

BUILD_PKG_DEPENDENCIES = $(BUILD_TOOLS)

include $(WS_TOP)/make-rules/depend.mk
