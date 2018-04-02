package org.techlyric.controller;

import java.util.logging.Logger;

import javax.servlet.http.HttpSession;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.support.SessionStatus;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.view.RedirectView;


@Controller
@ControllerAdvice
public class DocumentsController{

	
	public DocumentsController(){}
	private final static Logger LOGGER = Logger.getLogger(DocumentsController.class.getName());
	
	@RequestMapping(value="/login.html") 
	ModelAndView secure_services(){
		return new ModelAndView("login");
	}
	@RequestMapping(value = "/documents")
	public ModelAndView services(ModelMap model) {
		return new ModelAndView("documents");
	}
	@RequestMapping(value = "/loginfail")
	public RedirectView security_check_failed(ModelMap model) {
		return new RedirectView("login.html");
	}
		
	@RequestMapping(value = "/signout")
	public RedirectView logoff(HttpSession session, SessionStatus sessionStatus) {
		if( session != null )
		{
			sessionStatus.setComplete();
			session.getLastAccessedTime();
			session.invalidate();
		}
		return new RedirectView("/", true);
	}
}