/* VM1.java

	Purpose:
		
	Description:
		
	History:
		Mon Jun 12 12:40:32 CST 2017, Created by rudyhuang

Copyright (C) 2017 Potix Corporation. All Rights Reserved.
*/
package org.zkoss.fragment.demo;

import org.zkoss.bind.ValidationContext;
import org.zkoss.bind.Validator;
import org.zkoss.bind.validator.AbstractValidator;

/**
 * @author rudyhuang
 */
public class VM1 {
	private String prop1;
	private Validator validator1 = new Validator1();
	private Validator regExValidator = new RegExValidator();

	public Validator getValidator1() {
		return validator1;
	}

	public Validator getRegExValidator() {
		return regExValidator;
	}

	public String getProp1() {
		return prop1;
	}

	public void setProp1(String prop1) {
		this.prop1 = prop1;
	}

	public class Validator1 extends AbstractValidator {
		public void validate(ValidationContext ctx) {
			String value = (String) ctx.getProperty().getValue();
			if (value == null || value.length() == 0) {
				addInvalidMessage(ctx, "prop1", "Cannot be empty");
			}
		}
	}

	public class RegExValidator extends AbstractValidator {
		public void validate(ValidationContext ctx) {
			String regex = (String) ctx.getValidatorArg("regex");
			String key = (String) ctx.getValidatorArg("key");
			Object value = ctx.getProperty().getValue();
			if (value == null || !value.toString().matches(regex)) {
				addInvalidMessage(ctx, key, "Invalid: " + value);
			}
		}
	}
}
