/* SomeBean.java

	Purpose:
		
	Description:
		
	History:
		Mon Jun 12 14:15:33 CST 2017, Created by rudyhuang

Copyright (C) 2017 Potix Corporation. All Rights Reserved.
*/
package org.zkoss.fragment.demo;

import javax.validation.constraints.Size;

/**
 * @author rudyhuang
 */
public class SomeBean {
	private String prop1;

	@Size(min = 3, message = "The prop1 is too short (minimum is 3 characters)")
	public String getProp1() {
		return this.prop1;
	}
	public void setProp1(String prop1) {
		this.prop1 = prop1;
	}
}
