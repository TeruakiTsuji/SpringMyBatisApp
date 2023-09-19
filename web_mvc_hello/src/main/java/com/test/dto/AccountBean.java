package com.test.dto;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

import com.test.bean.User;
import com.test.dao.UserDao;

public class AccountBean {

	@Autowired
	private UserDao dao;

	public List<User> getUserList() {
		List<User> ret = dao.getUserList();
		for (User user : ret) {
			System.out.println("loginid:" + user.getLoginid()
				+ " name:"   + user.getName()
				+ " pass:"   + user.getPass()
				+ " roleid:" + user.getRoleid());
		}
		return ret;
	}
}
