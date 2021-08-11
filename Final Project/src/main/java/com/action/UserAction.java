package com.action;

import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.struts.action.Action;
import org.apache.struts.action.ActionForm;
import org.apache.struts.action.ActionForward;
import org.apache.struts.action.ActionMapping;

import com.entity.Users;
import com.forms.HomeForm;
import com.repos.HomeDao;

public class UserAction extends Action{

	@Override
	public ActionForward execute(ActionMapping mapping, ActionForm form, HttpServletRequest request,
			HttpServletResponse response) throws Exception {
		// TODO Auto-generated method stub
//		return super.execute(mapping, form, request, response);
		HomeForm home= (HomeForm) form;
		Users users= new Users();
		users.setUsername(home.getUsername());
		users.setPassword(home.getPassword());
	List<Users> l=	HomeDao.getUser(users.getUsername(), users.getPassword());
	request.getSession().setAttribute("username", users.getUsername());
		if(l.contains("user")) {
			return mapping.findForward("user");
		}else if(l.contains("admin")) {
			return mapping.findForward("admin");
		}else {
			return mapping.findForward("error");
		}
	}	
	
}
