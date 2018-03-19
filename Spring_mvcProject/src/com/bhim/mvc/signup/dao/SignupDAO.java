package com.bhim.mvc.signup.dao;
import org.hibernate.HibernateException;
import org.hibernate.Session;

import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Repository;

import com.bhim.mvc.signup.dto.SignupDTO;
import com.sun.xml.internal.ws.handler.HandlerException;

@Repository
public class SignupDAO
{
	@Autowired
	private SessionFactory factory;
	
	public SignupDAO()
	{
		System.out.println("SignupDAO created \t"+this.getClass().getSimpleName());
	}

	public SignupDTO save(SignupDTO dto)
	{
		System.out.println("calling save in DAO \t"+dto);
		Session session=factory.openSession();
		Transaction transaction=session.beginTransaction();
		try
		{
			session.save(dto);
			transaction.commit();
		}
		catch (HibernateException e) 
		{
			e.printStackTrace();
			transaction.rollback();
		}
		finally
		{
			session.close();
		}
		return dto;
	}
}