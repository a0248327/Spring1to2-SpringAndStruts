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
			str = "ע��ɹ�";
		} else if ("gf".equals(user.getName())) {
			str = "������д����";
		} else if ("12345".equals(user.getPassword())) {
			str = "�û�����д����";
		} else {
			str = "�û��������붼��д����";
		}
		return str;
	}
}
