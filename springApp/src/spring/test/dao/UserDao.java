package spring.test.dao;

import java.util.List;

import spring.test.bean.User;

public interface UserDao {
	public List<User> getUserList();
}