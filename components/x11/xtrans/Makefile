#
# This file and its contents are supplied under the terms of the
# Common Development and Distribution License ("CDDL"), version 1.0.
# You may only use this file in accordance with the terms of version
# 1.0 of the CDDL.
#
# A full copy of the text of the CDDL should have accompanied this
# source.  A copy of the CDDL is also available via the Internet at
# http://www.illumos.org/license/CDDL.
#

#
# Copyright 2015 Alexander Pyhalov
#

include ../../../make-rules/shared-macros.mk

COMPONENT_NAME= xtrans
COMPONENT_VERSION= 1.2.7
COMPONENT_SUMMARY= xtrans - X network protocol transport layer development files
COMPONENT_SRC= $(COMPONENT_NAME)-$(COMPONENT_VERSION)
COMPONENT_ARCHIVE= $(COMPONENT_SRC).tar.bz2
COMPONENT_ARCHIVE_HASH= \
  sha256:7f811191ba70a34a9994d165ea11a239e52c527f039b6e7f5011588f075fe1a6
COMPONENT_ARCHIVE_URL= \
  http://xorg.freedesktop.org/archive/individual/lib/$(COMPONENT_ARCHIVE)
COMPONENT_PROJECT_URL = http://www.freedesktop.org/wiki/
COMPONENT_FMRI= x11/library/xtrans
COMPONENT_LICENSE= MIT
COMPONENT_LICENSE_FILE= COPYING
COMPONENT_CLASSIFICATION= Development/X11

include $(WS_TOP)/make-rules/prep.mk
include $(WS_TOP)/make-rules/configure.mk
include $(WS_TOP)/make-rules/ips.mk

PATH=/usr/gnu/bin:/usr/bin

CONFIGURE_OPTIONS+= --sysconfdir=/etc

COMPONENT_INSTALL_ARGS += pkgconfigdir=/usr/share/pkgconfig

build: $(BUILD_32)

install: $(INSTALL_32)
