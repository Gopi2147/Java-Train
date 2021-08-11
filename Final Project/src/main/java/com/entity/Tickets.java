package com.entity;
import java.util.*;
import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToOne;
import javax.persistence.Table;

@Entity
@Table(name="tickets")
public class Tickets {
@Id
@GeneratedValue(strategy=GenerationType.IDENTITY)
private Integer ticketid;
	@Column
private String subject;
	public Integer getTicketid() {
		return ticketid;
	}
	public void setTicketid(Integer ticketid) {
		this.ticketid = ticketid;
	}
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
	public String getStatus() {
		return status;
	}
	public void setStatus(String status) {
		this.status = status;
	}
	public String getDateraised() {
		return dateraised;
	}
	public void setDateraised(String dateraised) {
		this.dateraised = dateraised;
	}
	public Tickets() {
		super();
	}

	public Tickets(Integer ticketid, String subject, String description, String status, String dateraised) {
		super();
		this.ticketid = ticketid;
		this.subject = subject;
		this.description = description;
		this.status = status;
		this.dateraised = dateraised;
		
	}
//	public Users getUsers() {
//		return users;
//	}
//	public void setUsers(Users users) {
//		this.users = users;
//	}
	@Column
private String description;
	public Users getUsers() {
		return users;
	}
	public void setUsers(Users users) {
		this.users = users;
	}
	@Column
private String status;
	@Column
	
private String dateraised;
//	@Column
//	private String sender;
	@Column
	private String receiver;
//public String getSender() {
//		return sender;
//	}
//	public void setSender(String sender) {
//		this.sender = sender;
//	}
	public String getReceiver() {
		return receiver;
	}
	public void setReceiver(String receiver) {
		this.receiver = receiver;
	}
@ManyToOne(cascade= CascadeType.ALL)
@JoinColumn(name="sender")
private Users users;
//@Column
//private String sender;
//public String getSender() {
//	return sender;
//}
//public void setSender(String sender) {
//	this.sender = sender;
//}
@OneToOne(mappedBy="tickets", cascade= CascadeType.ALL)
private Set<TicketHistory> ticketHistory;

@Override
public String toString() {
	return "Tickets [ticketid=" + ticketid + ", subject=" + subject + ", description=" + description + ", status="
			+ status + ", dateraised=" + dateraised + ", receiver=" + receiver + ", users=" + users + "]";
}

}
