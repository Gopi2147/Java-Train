package com.action;

import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.struts.action.Action;
import org.apache.struts.action.ActionForm;
import org.apache.struts.action.ActionForward;
import org.apache.struts.action.ActionMapping;

import com.entity.TicketHistory;
import com.forms.HomeForm;
import com.forms.TicketForm;
import com.repos.HomeDao;



public class HistoryAction extends Action{

	@Override
	public ActionForward execute(ActionMapping mapping, ActionForm form, HttpServletRequest request,
			HttpServletResponse response) throws Exception {
		// TODO Auto-generated method stub
//		return super.execute(mapping, form, request, response);
		HomeForm home = (HomeForm) form;
		TicketForm t= new TicketForm();
		t.setSender(home.getUsername());
		List<TicketHistory> l=HomeDao.getHistory(home.getUsername());
		request.getSession().setAttribute("history", l);
		System.out.println(l);
		return mapping.findForward("history");
	}
	
}
