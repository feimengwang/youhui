package cn.true123.youhui.mapper;

import org.apache.ibatis.annotations.Param;

import cn.true123.youhui.bean.User;

public interface UserMapper {
	public User selectUser(int id);
	public User loginUser(@Param("name") String name,@Param("password")String password);
	public User loginUser(User user);

}
