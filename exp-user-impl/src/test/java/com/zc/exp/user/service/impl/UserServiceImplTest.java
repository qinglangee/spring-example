package com.zc.exp.user.service.impl;

import junit.framework.Assert;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.testng.AbstractTestNGSpringContextTests;
import org.testng.annotations.Test;

import com.zc.exp.user.bean.Userinfo;
import com.zc.exp.user.service.UserService;

/**
 * Spring和testNG整合后，进行单元测试的时只要test类继承该类，就可以方便的使用spring注入。
 * 实现了spring和testNG的无缝整合，我们可以像写普通类那样测试被spring IoC容器所管理的类
 * （否则我们必须在开始执行单元测试前重新加载Spring beanfactory，再用getBean("xxx")的方式获取IoC容器中类。）
 *
 *
 *其中最重要的就是@ContextConfiguration。默认的从classpath目录下读取applicationContext.xml作为spring的启动配置文件（对应ClassPathXmlApplicationContext？）。
等同于(locations={"classpath:applicationContext1.xml"})。因此必须确保spring的配置文件在classpath中。
如果有多个spring配置，用逗号进行分隔(locations={"applicationContext.xml", "/applicationContex_transaction.xml"})
 */
@ContextConfiguration   
(locations={"classpath:exp-user-spring-service-test.xml"})
public class UserServiceImplTest extends AbstractTestNGSpringContextTests{
	

	private ClassPathXmlApplicationContext context;

	// @BeforeClass  // 采用手工加载 spring的方式 , 去掉这一行的注释
	public void init() {
		// 初始化
		context = new ClassPathXmlApplicationContext(new String[] { "exp-user-spring-service-test.xml" });
		context.start();
		userService = (UserService) context.getBean("userService");

	}

	@Autowired 
	/** private 属性, 没有get set 方法, auto wired 也可以注入*/
	private UserService userService;
	@Autowired
	private UserService userServiceDubbo;


	@Test
	public void getUser() {
		Userinfo user = userService.getUser(1L);
		System.out.println(user);
		Assert.assertEquals(user.getUserName(), "zhch");
	}
	
	@Test
	public void getUserDubbo() {
		Userinfo user = userServiceDubbo.getUser(1L);
		System.out.println(user);
		Assert.assertEquals(user.getUserName(), "zhch");
	}
}
