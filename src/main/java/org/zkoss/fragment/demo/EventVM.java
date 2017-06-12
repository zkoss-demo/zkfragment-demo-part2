/* EventVM.java

	Purpose:
		
	Description:
		
	History:
		Mon Jun 12 14:36:12 CST 2017, Created by rudyhuang

Copyright (C) 2017 Potix Corporation. All Rights Reserved.
*/
package org.zkoss.fragment.demo;

import org.zkoss.bind.annotation.BindingParam;
import org.zkoss.bind.annotation.Command;
import org.zkoss.bind.annotation.ContextParam;
import org.zkoss.bind.annotation.ContextType;
import org.zkoss.zk.ui.event.CheckEvent;
import org.zkoss.zk.ui.event.MouseEvent;
import org.zkoss.zk.ui.util.Clients;

/**
 * @author rudyhuang
 */
public class EventVM {
	// Method 1
	@Command
	public void cmd1(@BindingParam("e") MouseEvent e) {
		// do something with event
		Clients.showNotification(String.format("(%d, %d)\n", e.getX(), e.getY()));
	}

	// Method 2
	@Command
	public void cmd2(@ContextParam(ContextType.TRIGGER_EVENT) CheckEvent e) {
		// do something with event
		Clients.showNotification(e.isChecked()
				? "You checked the checkbox."
				: "You unchecked the checkbox."
		);
	}
}
