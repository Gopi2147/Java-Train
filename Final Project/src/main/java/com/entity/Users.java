package com.entity;

import java.util.Set;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;
import javax.persistence.Table;

@Entity
@Table(name="users")
public class Users {
	@Id
private String username;
@Column
private String password;
@Column
private String usertype;

@OneToOne(mappedBy="users", cascade= CascadeType.ALL)
private Set<UserProfile> userProfile;

@OneToMany(mappedBy="users", cascade=CascadeType.ALL)
private Set<Tickets> tickets;



public Set<Tickets> getTickets() {
	return tickets;
}
public void setTickets(Set<Tickets> tickets) {
	this.tickets = tickets;
}
public String getUsername() {
	return username;
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
public Set<UserProfile> getUserProfile() {
	return userProfile;
}
public Users() {
	super();
}
public Users(String username, String password, String usertype) {
	super();
	this.username = username;
	this.password = password;
	this.usertype = usertype;
}
public void setUserProfile(Set<UserProfile> userProfile) {
	this.userProfile = userProfile;
}


}
