package spring.test.dao;

import java.util.List;

import org.apache.ibatis.session.SqlSession;

import spring.test.bean.User;

public class UserDaoImpl implements UserDao {

	private SqlSession session;

	public void setSession(SqlSession ss) {
		this.session = ss;
	}

	public List<User> getUserList() {
		return session.selectList("test.sql.selectUser");
	}
}