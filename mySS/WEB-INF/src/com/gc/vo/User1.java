package com.gc.vo;

import javax.servlet.http.HttpServletRequest;
import org.apache.struts.action.ActionForm;
import org.apache.struts.action.ActionMapping;

public class User1 extends ActionForm {
	private String name = null;
	private String password = null;

	public void setName(String name) {
		this.name = name;
	}

	public String getName() {
		return this.name;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public String getPassword() {
		return this.password;
	}

	public void reset(ActionMapping mapping, HttpServletRequest req) {
		this.name = null;
		this.password = null;
	}
}
