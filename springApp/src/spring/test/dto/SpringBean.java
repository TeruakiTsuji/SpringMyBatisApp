package spring.test.dto;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

import spring.test.dao.UserDao;
import spring.test.bean.User;

public class SpringBean {

	@Autowired
	private UserDao dao;

	public void show() {
		List<User> list = dao.getUserList();
		for (User user : list) {
			System.out.println("loginid:" + user.getLoginid()
				+ " name:"   + user.getName()
				+ " pass:"   + user.getPass()
				+ " roleid:" + user.getRoleid());
		}
	}
}
