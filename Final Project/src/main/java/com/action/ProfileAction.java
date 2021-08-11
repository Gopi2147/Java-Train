package com.action;

import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.struts.action.Action;
import org.apache.struts.action.ActionForm;
import org.apache.struts.action.ActionForward;
import org.apache.struts.action.ActionMapping;

import com.entity.UserProfile;
import com.forms.HomeForm;
import com.forms.ProfileForm;
import com.repos.HomeDao;

public class ProfileAction extends Action{

	@Override
	public ActionForward execute(ActionMapping mapping, ActionForm form, HttpServletRequest request,
			HttpServletResponse response) throws Exception {
		// TODO Auto-generated method stub
//		return super.execute(mapping, form, request, response);
		HomeForm home= (HomeForm) form;
		UserProfile user= new UserProfile();
		List<UserProfile> l= HomeDao.getProfile(home.getUsername());
		request.getSession().setAttribute("profile", l);
		return mapping.findForward("success");		
	}

}
