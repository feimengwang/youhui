package cn.true123.youhui.service;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import cn.true123.youhui.bean.User;
import cn.true123.youhui.dao.IUserDAO;

@Service
public class UserService implements IUserService {

	@Autowired
	private IUserDAO userDAO;
	@Override
	public User getUser(String name, String password) {
		return userDAO.getUser(name, password);
	}
	@Override
	public User getUser(User user) {
		// TODO Auto-generated method stub
		return userDAO.getUser(user);
	}

}
