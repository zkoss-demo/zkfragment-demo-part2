/* VM2.java

	Purpose:
		
	Description:
		
	History:
		Mon Jun 12 12:40:32 CST 2017, Created by rudyhuang

Copyright (C) 2017 Potix Corporation. All Rights Reserved.
*/
package org.zkoss.fragment.demo;

import org.zkoss.bind.ValidationContext;
import org.zkoss.bind.Validator;
import org.zkoss.bind.annotation.Command;
import org.zkoss.bind.validator.AbstractValidator;

/**
 * @author rudyhuang
 */
public class VM2 {
	private String prop1;
	private String prop2;

	public String getProp1() {
		return prop1;
	}

	public void setProp1(String prop1) {
		this.prop1 = prop1;
	}

	public String getProp2() {
		return prop2;
	}

	public void setProp2(String prop2) {
		this.prop2 = prop2;
	}

	@Command
	public void submit() {
		// just a trigger
	}

	public Validator getFormValidator() {
		return new AbstractValidator() {
			public void validate(ValidationContext ctx) {
				String val = (String) ctx.getProperties("prop1")[0].getValue();
				if (invalidCondition01(val)) {
					addInvalidMessage(ctx, "fkey1", "prop1 error");
				}
				val = (String) ctx.getProperties("prop2")[0].getValue();
				if (invalidCondition02(val)) {
					addInvalidMessage(ctx, "fkey2", "prop2 error");
				}
			}

			private boolean invalidCondition01(String val) {
				return val == null || val.length() < 7;
			}

			private boolean invalidCondition02(String val) {
				return val == null || !val.contains("ZK");
			}
		};
	}
}
