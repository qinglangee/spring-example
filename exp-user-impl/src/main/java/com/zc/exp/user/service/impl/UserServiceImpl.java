package com.zc.exp.user.service.impl;

import com.zc.exp.user.bean.Userinfo;
import com.zc.exp.user.dao.UserDao;
import com.zc.exp.user.service.UserService;

public class UserServiceImpl implements UserService {
	
	private UserDao userDao;
	
	private String defaultName;
	public Userinfo getUser(Long userId) {
		return userDao.getUser(userId);
	}
	
	


	public void setUserDao(UserDao userDao) {
		this.userDao = userDao;
	}
	public void setDefaultName(String name){
		defaultName = name;
	}

}
