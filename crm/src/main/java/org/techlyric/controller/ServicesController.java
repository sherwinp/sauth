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
public class ServicesController{

	
	public ServicesController(){}
	private final static Logger LOGGER = Logger.getLogger(ServicesController.class.getName());
	
	@RequestMapping(value= {"index.html","/"}) 
	ModelAndView index(){
		return new ModelAndView("index");
	}
	
	@RequestMapping(value="login.html") 
	ModelAndView secure_services(){
		return new ModelAndView("login");
	}
	@RequestMapping(value = {"services.html", "/services"})
	public ModelAndView services(ModelMap model) {
		return new ModelAndView("services");
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