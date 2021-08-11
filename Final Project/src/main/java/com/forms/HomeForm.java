package com.forms;

import java.util.List;

import org.apache.struts.action.ActionForm;

import com.entity.Users;

public class HomeForm extends ActionForm{
	
	private String username;
	private String password;
	private String usertype;
	public HomeForm(String username, String password, String usertype) {
		super();
		this.username = username;
		this.password = password;
		this.usertype = usertype;
	}
	@Override
	public String toString() {
		return "HomeForm [username=" + username + ", password=" + password + ", usertype=" + usertype + ", list=" + list
				+ "]";
	}
	public String getUsername() {
		return username;
	}
	public HomeForm() {
		super();
	}
	public void setUsername(String username) {
		this.username = username;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}         
	public String getUsertype() {
		return usertype;
	}
	public void setUsertype(String usertype) {
		this.usertype = usertype;
	}
	public List<Users> getList() {
		return list;
	}
	public void setList(List<Users> list) {
		this.list = list;
	}
	private List<Users> list;

}
