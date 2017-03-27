package com.dubbo.bean;

import java.io.Serializable;

public class UserInfoBean implements Serializable{
	private static final long serialVersionUID = -2814022769568306965L;
  private String userid;
  private String name;
  private String useraccount;
  private String password;
  private Object info;
  private boolean check;//true验证通过，false 验证失
  private String token;
  private boolean manager;//true可以登录管理网站，false不可以管理网站

public String getUseraccount() {
	return useraccount;
}
public void setUseraccount(String useraccount) {
	this.useraccount = useraccount;
}
public boolean isManager() {
	return manager;
}
public void setManager(boolean manager) {
	this.manager = manager;
}
public String getToken() {
	return token;
}
public void setToken(String token) {
	this.token = token;
}
public String getUserid() {
	return userid;
}
public void setUserid(String userid) {
	this.userid = userid;
}
public String getName() {
	return name;
}
public void setName(String name) {
	this.name = name;
}
public String getPassword() {
	return password;
}
public void setPassword(String password) {
	this.password = password;
}
public Object getInfo() {
	return info;
}
public void setInfo(Object info) {
	this.info = info;
}
public boolean isCheck() {
	return check;
}
public void setCheck(boolean check) {
	this.check = check;
}
  
  
}
