package com.zl.Type.Demo;
import org.springframework.stereotype.Repository;


@Repository
//@Scope("prototype")
public class UserDaoImpl extends BaseDaoImpl<User> implements IUserDao{


	@Override
	public User findByUsernameAndPassword(String username, String password) {
		// TODO Auto-generated method stub
		return null;
	}


}
