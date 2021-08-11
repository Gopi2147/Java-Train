package com.repos;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityTransaction;
import javax.persistence.Query;

import com.entity.TicketHistory;
import com.entity.Tickets;
import com.entity.UserProfile;
import com.entity.Users;

public class HomeDao {
	private static EntityManager em=JPARepository.getEntityManager();
	
	
	public static List<Users> getUser(String username, String password){
		Query q= em.createQuery("SELECT p.usertype FROM Users p WHERE p.username = '" +username+ "' and p.password= '"+password+"'");

	List<Users> list= q.getResultList();
	return list;
	}
	
	
	
	
	public static List<UserProfile> getProfile(String username){
		Query q= em.createQuery("SELECT p FROM UserProfile p WHERE p.username ='" + username +"'");
        		List<UserProfile> l= q.getResultList();
        		System.out.println(l);
        		return l;
	}	
	public static boolean addTicket(Tickets p, String username) {
		EntityTransaction t= em.getTransaction();
		try {
			t.begin();
//			Users u= new Users();
//			u.setUsername(username);
			
			Users u= em.find(Users.class, username);		
			p.setUsers(u);			
			em.persist(p);
			t.commit();
			return true;
		}catch(Exception e) {
			System.out.println(e.getMessage());
			return false; 
		}
	} 

	public static List<TicketHistory> getHistory(String username){
		Query q= em.createQuery("SELECT p FROM TicketHistory p WHERE p.tickets.ticketid IN (SELECT t.ticketid FROM Tickets t WHERE t.users.username= '"+username+"')");
	List<TicketHistory> list= q.getResultList();
	System.out.println(list);
	return list;
	}
	
	public static List<Tickets> getTickets(String username){
		Query q=em.createQuery("SELECT p FROM Tickets p WHERE p.status='unresolved' and p.users.username= '"+ username+"'");
		List<Tickets> l= q.getResultList();
		return l;
	}
	
	public static List<String> assignAdmin(){
		Query q= em.createQuery("SELECT p.username FROM Users p WHERE p.usertype='admin'");
		List<String> l= q.getResultList();
		return l;
	}
	
	public static List<Tickets> getTicketId(String sub){
		Query q=em.createQuery("SELECT p FROM Tickets p WHERE p.subject='" +sub+ "'");
		List<Tickets> l= q.getResultList();
		return l;		
	}
	public static void addHistory(Integer ti, String sub) {
		EntityTransaction t= em.getTransaction();
		try {
			TicketHistory p= new TicketHistory();
			t.begin();
Tickets u= em.find(Tickets.class, ti);	
			p.setTickets(u); 
			p.setMessage(sub);
			em.persist(p); 
			t.commit(); 
		}catch(Exception e) {
			System.out.println(e.getMessage());
		}
	}
	
	public static List<TicketHistory> getAdminHistory(String username){
		Query q= em.createQuery("SELECT p FROM TicketHistory p WHERE p.tickets.ticketid IN (SELECT t.ticketid FROM Tickets t WHERE t.receiver= '"+username+"')");
	List<TicketHistory> list= q.getResultList();
	return list;
	} 
	
	public static List<Tickets> getAdminOpen(String username){
		Query q= em.createQuery("SELECT p FROM Tickets p WHERE p.status='unresolved' and p.receiver='" + username+"'");
		List<Tickets> l= q.getResultList();
		System.out.println(l);
		return l;
	}
	
	public static List<Tickets> getDetails(Integer i){
		Query q= em.createQuery("SELECT p FROM Tickets p WHERE p.ticketid=" + i);
		List<Tickets> list= q.getResultList();
		return list;
	}
	
	public static void changeStatus(Tickets p) {
		 EntityTransaction t= em.getTransaction();
    	 try {
    	 t.begin();
    	 em.merge(p);//-----> Update operation in jpa
    	 t.commit();
    	 }
    	 catch(Exception e) {
    		 throw e;
    	 }
	}
}
