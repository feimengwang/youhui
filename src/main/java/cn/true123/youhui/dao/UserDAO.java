package cn.true123.youhui.dao;

import org.apache.ibatis.session.SqlSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import cn.true123.youhui.bean.User;
import cn.true123.youhui.mapper.UserMapper;

@Component
public class UserDAO implements IUserDAO {
	@Autowired
	private SqlSession sqlSession;

	@Override
	public User getUser(String name, String password) {

		UserMapper userMapper = sqlSession.getMapper(UserMapper.class);
		return userMapper.loginUser(name, password);

	}

	@Override
	public User getUser(User user) {
		UserMapper userMapper = sqlSession.getMapper(UserMapper.class);
		return userMapper.loginUser(user);

	}

}
