package com.sum.cricket.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import com.sum.cricket.dto.LoginDTO;
import com.sum.cricket.service.LoginService;

@RequestMapping("/")
@Controller //create an object
public class Logincotroller {
	@Autowired   //depency injecion
	private LoginService service;
	public Logincotroller() {
		System.out.println("Created"+this.getClass().getSimpleName());
	}
	@RequestMapping("/a.to") // mapping to JSP
	public ModelAndView getlogincontroller(LoginDTO dto)
	{
		
		LoginDTO Dbfrom =service.loginService(dto);
		if(Dbfrom!=null)
		{
			return new ModelAndView("login.jsp","msg","login success");
		}
		else{
			return new ModelAndView("login.jsp","msg","invalid credentials");
		}
	}
}
