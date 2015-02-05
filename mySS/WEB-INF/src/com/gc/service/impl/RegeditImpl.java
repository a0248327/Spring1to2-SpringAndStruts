/*
 * Created on 2006-5-15
 * TODO
 * author:gf
 */
package com.gc.service.impl;

import com.gc.service.Regedit;
import com.gc.vo.User1;

public class RegeditImpl implements Regedit {
	public String saveUser(User1 user) {
		String str = "";
		if ("gf".equals(user.getName()) && "12345".equals(user.getPassword())) {
			str = "注册成功";
		} else if ("gf".equals(user.getName())) {
			str = "密码填写错误";
		} else if ("12345".equals(user.getPassword())) {
			str = "用户名填写错误";
		} else {
			str = "用户名和密码都填写错误";
		}
		return str;
	}
}
