package com.jsp.tollapp.controller.login;

import java.util.Date;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import com.jsp.tollapp.dto.admin.AdminDTO;
import com.jsp.tollapp.dto.login.LoginDTO;
import com.jsp.tollapp.service.login.LoginService;

@Controller
@RequestMapping("/")
public class LoginController {

	private static Logger logger = LoggerFactory.getLogger(LoginController.class);

	@Autowired
	private LoginService service;

	public LoginController() {
		logger.info("created.." + this.getClass().getCanonicalName());
	}

	@RequestMapping(value = "/register.toll", method=RequestMethod.POST)
	public ModelAndView fetchUserController(LoginDTO loginDTO,HttpServletRequest req) {
		logger.info("Login controller method started");
		AdminDTO dtoFromDB = null;
		String message=null;
		//ModelAndView modelAndView =  null;
		try {
			dtoFromDB = service.fetchUserService(loginDTO);
		
		if (dtoFromDB != null)
		{
			if(dtoFromDB.isStatus())
			{
				if(dtoFromDB.getExpiryDate().after(new Date()))
				{
					HttpSession session = req.getSession();
					session.setAttribute("adto", dtoFromDB);

					if(dtoFromDB.isRole())
					{
					  return new ModelAndView("SuperHome.jsp","msg","Login Successfully");	
					}
					else
					{
						return new ModelAndView("Home.jsp","msg","Login Successfully");
					}
				}
					else
					{
					message="Your Contract has been Expired";	
					}
			}
					else
					{
						message="Your Account not yet activated.Please Activate your Account";
					}
		}
		else 
		{
			message="Invalid Credentials ";

		}
		} catch (Exception e) {
			logger.error("Exception in LoginController fetchUserController");
		}
		return new ModelAndView("Login.jsp", "msg",message);
	}
}
