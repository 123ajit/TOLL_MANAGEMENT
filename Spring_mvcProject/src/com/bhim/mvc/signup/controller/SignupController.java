package com.bhim.mvc.signup.controller;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;
import com.bhim.mvc.signup.dto.SignupDTO;
import com.bhim.mvc.signup.service.SignupService;

@Controller
@RequestMapping("/")
public class SignupController
{
	@Autowired
	private SignupService service;
	
	public SignupController()
	{
		System.out.println("SignupController created \t"+this.getClass().getSimpleName());
	}

	@RequestMapping("/shaadi.bot")
	public ModelAndView sign(SignupDTO signupDTO)
	{
		System.out.println("called signup in controller \t"+signupDTO);
		service.save(signupDTO);
		ModelAndView response=new ModelAndView("/signup.jsp","marrige","no result found");
		response.addObject("signupDTO", signupDTO);
		return response;
	}
}
