package com.forms;

import org.apache.struts.action.ActionForm;

public class TicketForm extends ActionForm{
	private Integer ticketid;
public Integer getTicketid() {
		return ticketid;
	}
	public void setTicketid(Integer ticketid) {
		this.ticketid = ticketid;
	}
private String subject;
private String description;
private String sender;
private String receiver;
private String dateraised;
public String getSubject() {
	return subject;
}
public void setSubject(String subject) {
	this.subject = subject;
}
public String getDescription() {
	return description;
}
public void setDescription(String description) {
	this.description = description;
}
public String getSender() {
	return sender;
}
public void setSender(String sender) {
	this.sender = sender;
}
public String getReceiver() {
	return receiver;
}
public void setReceiver(String receiver) {
	this.receiver = receiver;
}
public String getDateraised() {
	return dateraised;
}
public TicketForm() {
	super();
}
public TicketForm(String subject, String description, String sender, String receiver, String dateraised) {
	super();
	this.subject = subject;
	this.description = description;
	this.sender = sender;
	this.receiver = receiver;
	this.dateraised = dateraised;
}
public void setDateraised(String dateraised) {
	this.dateraised = dateraised;
}
private String username;
public String getUsername() {
	return username;
}
public void setUsername(Object object) {
	this.username = (String) object;
}
}
