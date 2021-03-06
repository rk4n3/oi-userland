/*
 * CDDL HEADER START
 *
 * The contents of this file are subject to the terms of the
 * Common Development and Distribution License (the "License").
 * You may not use this file except in compliance with the License.
 *
 * You can obtain a copy of the license at usr/src/OPENSOLARIS.LICENSE
 * or http://www.opensolaris.org/os/licensing.
 * See the License for the specific language governing permissions
 * and limitations under the License.
 *
 * When distributing Covered Code, include this CDDL HEADER in each
 * file and include the License file at usr/src/OPENSOLARIS.LICENSE.
 * If applicable, add the following below this CDDL HEADER, with the
 * fields enclosed by brackets "[]" replaced with your own identifying
 * information: Portions Copyright [yyyy] [name of copyright owner]
 *
 * CDDL HEADER END
 */

/*
 * Copyright (c) 2010, 2012, Oracle and/or its affiliates. All rights reserved.
 */

package com.oracle.solaris.vp.panels.usermgr.client.swing;

import java.awt.BorderLayout;
import javax.swing.*;
import com.oracle.solaris.vp.util.misc.finder.Finder;
import com.oracle.solaris.vp.util.swing.GUIUtil;

/**
 * This panel provides preliminary information on what button
 * does what. Details are available from the Help button.
 */
@SuppressWarnings({"serial"})
public class UserMgrEmptyPanel extends JPanel {
    //
    // Constructors
    //

    public UserMgrEmptyPanel() {
	String msg = Finder.getString("usermgr.empty.message");
	JLabel msgLabel = new JLabel(msg,
	    GUIUtil.getIcon(JOptionPane.INFORMATION_MESSAGE),
	    SwingConstants.LEFT);

	msgLabel.setVerticalAlignment(SwingConstants.TOP);
	msgLabel.setVerticalTextPosition(SwingConstants.CENTER);

	setLayout(new BorderLayout());
	setOpaque(false);
	add(msgLabel);
    }
}
