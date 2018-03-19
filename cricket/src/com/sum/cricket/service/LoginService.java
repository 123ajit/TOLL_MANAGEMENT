package com.sum.cricket.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.servlet.DispatcherServlet;

import com.sum.cricket.dao.LoginDAO;
import com.sum.cricket.dto.LoginDTO;
@Service
public class LoginService {
	@Autowired
 private LoginDAO dao;
 public LoginService() {
	System.out.println("Created"+this.getClass().getSimpleName());
}
 public LoginDTO loginService(LoginDTO dto)
 {
	 return dao.getLoginDAO(dto);
 }
}
