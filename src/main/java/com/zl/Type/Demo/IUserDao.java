package com.zl.Type.Demo;

public interface IUserDao extends IBaseDao<User>{
	public User findByUsernameAndPassword(String username, String password);
}
