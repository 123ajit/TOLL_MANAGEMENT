package com.bhim.mvc.signup.service;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

import com.bhim.mvc.signup.dao.SignupDAO;
import com.bhim.mvc.signup.dto.SignupDTO;

@Service
public class SignupService
{
	@Autowired
	private SignupDAO dao;
	
	public SignupService()
	{
		System.out.println("SignupService created \t"+this.getClass().getSimpleName());
	}
	
	public boolean save(SignupDTO dto)
	{
		System.out.println("calling save in service ");
		if (dto != null) 
		{
			System.out.println("valid data , can give to dao");
			dao.save(dto);
		} 
		else 
		{
			System.out.println("invalid data , cannot give to dao");
		}
		System.out.println("executed save in service ");
		return true;
	}
}
