package com.zc.exp.user.service.impl;

import junit.framework.Assert;

import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.test4j.module.spring.annotations.SpringBeanByName;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import com.zc.exp.user.bean.Userinfo;
import com.zc.exp.user.service.UserService;


public class UserServiceImplTest {
	

	private ClassPathXmlApplicationContext context;

	@BeforeClass
	public void init() {

		// 初始化
		context = new ClassPathXmlApplicationContext(new String[] { "exp-user-spring-service-test.xml" });
		context.start();
		userService = (UserService) context.getBean("userService");

	}

	@SpringBeanByName
	private UserService userService;

	public UserService getUserService() {
		return userService;
	}

	public void setUserService(UserService userService) {
		this.userService = userService;
	}

	@Test
	public void getUser() {
		Userinfo user = userService.getUser(1L);
		System.out.println(user);
		Assert.assertEquals(user.getUserName(), "zhch");
	}
}
