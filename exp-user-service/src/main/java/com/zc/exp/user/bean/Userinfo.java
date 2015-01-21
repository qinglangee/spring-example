package com.zc.exp.user.bean;

import java.io.Serializable;
import java.util.Date;

public class Userinfo implements Serializable{
	private static final long serialVersionUID = 727149855164705755L;
	
	private Long userId;
	/** 用户名 */
	private String userName;
	/** 用户密码 */
	private String password;
	/** 年龄 */
	private Integer age;
	/** 用户类型 1 普通用户 */
	private Integer type;
	/** 自我介绍 */
	private String profile;
	private Date createTime;
	private Date updateTime;

	public String toString() {
		return "id:" + userId + " name:" + userName + " age:" + age + " type:" + type;
	}

	public Long getUserId() {
		return userId;
	}

	public void setUserId(Long userId) {
		this.userId = userId;
	}

	public String getUserName() {
		return userName;
	}

	public void setUserName(String userName) {
		this.userName = userName;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public Integer getAge() {
		return age;
	}

	public void setAge(Integer age) {
		this.age = age;
	}

	public Integer getType() {
		return type;
	}

	public void setType(Integer type) {
		this.type = type;
	}

	public String getProfile() {
		return profile;
	}

	public void setProfile(String profile) {
		this.profile = profile;
	}

	public Date getCreateTime() {
		return createTime;
	}

	public void setCreateTime(Date createTime) {
		this.createTime = createTime;
	}

	public Date getUpdateTime() {
		return updateTime;
	}

	public void setUpdateTime(Date updateTime) {
		this.updateTime = updateTime;
	}

}
