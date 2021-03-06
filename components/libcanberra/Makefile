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

include ../../make-rules/shared-macros.mk

COMPONENT_NAME= libcanberra
COMPONENT_VERSION= 0.26
COMPONENT_SUMMARY= Event Sound API Using XDG Sound Theming Specification
COMPONENT_SRC= $(COMPONENT_NAME)-$(COMPONENT_VERSION)
COMPONENT_ARCHIVE= $(COMPONENT_SRC).tar.gz
COMPONENT_ARCHIVE_HASH= \
  sha256:4b5d8d2c2835133620adbc53745dd107b6e58b9a2963059e8f457143fee00982
COMPONENT_ARCHIVE_URL= \
  http://0pointer.de/lennart/projects/libcanberra/$(COMPONENT_ARCHIVE)
COMPONENT_PROJECT_URL = http://0pointer.de/lennart/projects/libcanberra/
COMPONENT_FMRI=	library/desktop/xdg/libcanberra
COMPONENT_CLASSIFICATION= System/Multimedia Libraries
COMPONENT_LICENSE = LGPLv2.1
COMPONENT_LICENSE_FILE = LGPL

include ../../make-rules/prep.mk
include ../../make-rules/configure.mk
include ../../make-rules/ips.mk

PATH=/usr/gnu/bin:/usr/bin

COMPONENT_PREP_ACTION =        ( cd $(@D)  && \
					libtoolize --copy --force &&\
					glib-gettextize -f &&\
					aclocal -I m4 &&\
					automake -c -f -a &&\
					autoconf )

CFLAGS += -I/usr/include/gconf/2

CONFIGURE_OPTIONS += --sysconfdir=/etc
CONFIGURE_OPTIONS += --enable-gtk
CONFIGURE_OPTIONS += --disable-static

COMPONENT_INSTALL_ENV+=  GCONF_DISABLE_MAKEFILE_SCHEMA_INSTALL=1

build: $(BUILD_32_and_64)

install: $(INSTALL_32_and_64)

test: $(TEST_32_and_64)
