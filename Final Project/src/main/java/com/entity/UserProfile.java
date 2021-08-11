package com.entity;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import javax.persistence.Table;

@Entity
@Table(name="userprofile")
public class UserProfile {
	@Id
	private String username;
@Column
	private String address;
public String getUsername() {
	return username;
}
public void setUsername(String username) {
	this.username = username;
}
@Column
	private Long mobile;
@Column
	private String email;
@OneToOne(cascade=CascadeType.ALL)
@JoinColumn(name="username")
	private Users users;
public String getAddress() {
	return address;
}
public void setAddress(String address) {
	this.address = address;
}
public Long getMobile() {
	return mobile;
}
public void setMobile(Long mobile) {
	this.mobile = mobile;
}
public String getEmail() {
	return email;
}
public void setEmail(String email) {
	this.email = email;
}
public Users getUsers() {
	return users;
}
public void setUsers(Users users) {
	this.users = users;
}

public UserProfile(String username, String address, Long mobile, String email) {
	super();
	this.username = username;
	this.address = address;
	this.mobile = mobile;
	this.email = email;
}
@Override
public String toString() {
	return "UserProfile [username=" + username + ", address=" + address + ", mobile=" + mobile + ", email=" + email
			+ ", users=" + users + "]";
}
public UserProfile() {
	super();
}


}
