package com.zc.exp.user.dao.impl;

import org.mybatis.spring.SqlSessionTemplate;

import com.zc.exp.user.bean.Userinfo;
import com.zc.exp.user.dao.UserDao;

public class UserDaoImpl implements UserDao {

	private SqlSessionTemplate sqlSessionTemplate;

	public Userinfo getUser(Long userId) {
		return sqlSessionTemplate.<Userinfo> selectOne("User.get", userId);
	}

	public void setSqlSessionTemplate(SqlSessionTemplate sqlSessionTemplate) {
		this.sqlSessionTemplate = sqlSessionTemplate;
	}

}
