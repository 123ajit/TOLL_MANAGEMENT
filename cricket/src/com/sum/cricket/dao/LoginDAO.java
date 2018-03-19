package com.sum.cricket.dao;

import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.hibernate.Query;
import org.hibernate.Session;
import com.sum.cricket.dto.LoginDTO;

@Repository // object create
public class LoginDAO {
	@Autowired
	private SessionFactory factory;

	public LoginDAO() {
		System.out.println("Created" + this.getClass().getSimpleName());
	}

	public LoginDTO getLoginDAO(LoginDTO dto) {
		String hql = "Select n from LoginDTO n where n.userName=:un and n.password=:pwd";
		Session session = factory.openSession();
		Query qry = session.createQuery(hql);
		qry.setParameter("un", dto.getUserName());
		qry.setParameter("pwd", dto.getPassword());
		LoginDTO dto1 = (LoginDTO) qry.uniqueResult();
		return dto1;

	}
}
