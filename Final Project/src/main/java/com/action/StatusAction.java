package com.action;

import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.struts.action.Action;
import org.apache.struts.action.ActionForm;
import org.apache.struts.action.ActionForward;
import org.apache.struts.action.ActionMapping;

import com.entity.Tickets;
import com.forms.TicketForm;
import com.repos.HomeDao;

public class StatusAction extends Action{

	@Override
	public ActionForward execute(ActionMapping mapping, ActionForm form, HttpServletRequest request,
			HttpServletResponse response) throws Exception {
		// TODO Auto-generated method stub
//		return super.execute(mapping, form, request, response);
		TicketForm tf= (TicketForm)form;
		Tickets t= new Tickets();
		t.setTicketid(tf.getTicketid());
		List<Tickets> l= HomeDao.getDetails(t.getTicketid());
		for(Tickets x: l) {
			
		}
		
		
		
		
		return mapping.findForward("success");
	}

}
