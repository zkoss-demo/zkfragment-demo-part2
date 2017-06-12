/* DemoVM.java

	Purpose:
		
	Description:
		
	History:
		Mon Jun 12 14:10:39 CST 2017, Created by rudyhuang

Copyright (C) 2017 Potix Corporation. All Rights Reserved.
*/
package org.zkoss.fragment.demo;

import org.zkoss.bind.annotation.Command;

/**
 * @author rudyhuang
 */
public class DemoVM {
	private SomeBean someBean = new SomeBean();

	public SomeBean getSomeBean() {
		return someBean;
	}

	public void setSomeBean(SomeBean someBean) {
		this.someBean = someBean;
	}

	@Command
	public void submit() {
		// just a trigger
	}
}
