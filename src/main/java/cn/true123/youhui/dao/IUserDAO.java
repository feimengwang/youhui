package cn.true123.youhui.dao;

import cn.true123.youhui.bean.User;

public interface IUserDAO {
public User getUser(String name,String password);
public User getUser(User user);
}
