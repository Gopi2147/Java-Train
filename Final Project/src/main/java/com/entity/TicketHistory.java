package com.entity;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import javax.persistence.Table;

@Entity
@Table(name="tickethistory")
public class TicketHistory {


@Override
	public String toString() {
		return "TicketHistory [sno=" + sno + ", message=" + message + ", time="  + ", ticketid=" + "]";
	}

@Id
@GeneratedValue(strategy=GenerationType.IDENTITY)
	private Integer sno;
@Column
	private String message;

//@Column
//private Integer ticketid; 

public TicketHistory() {
	super();
}

public TicketHistory(Integer sno, String message) {
	super();
	this.sno = sno;
	this.message = message;
//	this.time = time;// 
}

@OneToOne(cascade= CascadeType.ALL)
@JoinColumn(name="ticketid")
private Tickets tickets;

public Integer getSno() {
	return sno;
}

public void setSno(Integer sno) {
	this.sno = sno;
}

public String getMessage() {
	return message;
}

public void setMessage(String message) {
	this.message = message;
}

//public String getTime() {
//	return time;
//}
//
//public void setTime(String time) {
//	this.time = time;
//}

public Tickets getTickets() {
	return tickets;
}

public void setTickets(Tickets tickets) {
	this.tickets = tickets;
}
	
}
