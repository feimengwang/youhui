package cn.true123.youhui.service;

import cn.true123.youhui.bean.User;

public interface IUserService {
	public User getUser(String name, String password);
	public User getUser(User user);

}
