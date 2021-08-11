package com.action;

import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.struts.action.Action;
import org.apache.struts.action.ActionForm;
import org.apache.struts.action.ActionForward;
import org.apache.struts.action.ActionMapping;

import com.entity.Tickets;
import com.repos.HomeDao;

public class AdminOpenAction extends Action{

	@Override
	public ActionForward execute(ActionMapping mapping, ActionForm form, HttpServletRequest request,
			HttpServletResponse response) throws Exception {
		// TODO Auto-generated method stub
//		return super.execute(mapping, form, request, response);
		String s= (String) request.getSession().getAttribute("username");
		List<Tickets> l= HomeDao.getAdminOpen(s);
		request.getSession().setAttribute("adminopen", l);	
	return mapping.findForward("success");
}
}