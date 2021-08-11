package com.action;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.struts.action.Action;
import org.apache.struts.action.ActionForm;
import org.apache.struts.action.ActionForward;
import org.apache.struts.action.ActionMapping;

import com.entity.Tickets;
import com.entity.Users;
import com.forms.HomeForm;
import com.forms.TicketForm;
import com.repos.HomeDao;

import java.util.Date;
import java.util.List;
import java.util.Random;
import java.text.SimpleDateFormat;
//import java.util.Random;


public class TicketAction extends Action{

	@Override
	public ActionForward execute(ActionMapping mapping, ActionForm form, HttpServletRequest request,
			HttpServletResponse response) throws Exception {
		// TODO Auto-generated method stub

		 SimpleDateFormat formatter = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss");  
		    Date date = new Date();  
		    System.out.println(formatter.format(date));  
		    String d=formatter.format(date);
		TicketForm tf=(TicketForm) form;		
		Tickets tickets= new Tickets();
	    tickets.setSubject(tf.getSubject());
	    tickets.setDescription(tf.getDescription());
	    tickets.setDateraised(d);
	tickets.setStatus("unresolved");
//	    tickets.setReceiver("taylor swift");
	List<String> l= HomeDao.assignAdmin();
	String sr[]= new String[l.size()];
	int count=0;
	for(String x: l) {
		sr[count]= x;
		count++;
	}
	Random random= new Random();
	int randInt= random.nextInt(l.size());
	tickets.setReceiver(sr[randInt]);
	    System.out.println(tf.getDescription());
	    System.out.println(tf.getSender());
	   
	    tf.setUsername(request.getSession().getAttribute("username"));
	    System.out.println(tf.getUsername());
		if(HomeDao.addTicket(tickets, tf.getUsername())){
			List<Tickets> list= HomeDao.getTicketId(tf.getSubject());
			request.getSession().setAttribute("ticketinfo", list);
			HomeDao.addHistory(tickets.getTicketid(), tf.getSubject());
			System.out.println(list);
			return mapping.findForward("added");
		}else
			return mapping.findForward("failed");
	}
}
