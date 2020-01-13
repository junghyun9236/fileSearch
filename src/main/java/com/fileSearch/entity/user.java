package com.fileSearch.entity;

import javax.persistence.Entity;

@Entity
public class user {
	private int userId;
	private String userPw;
	private int lastLoginTime;
	private String lastLoginIp;
	private int createTime;
	private String createUser;
	private int updateTime;
	private String updateUser;
}
