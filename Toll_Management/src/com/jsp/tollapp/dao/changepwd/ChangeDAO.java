package com.jsp.tollapp.dao.changepwd;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.jsp.tollapp.dto.admin.AdminDTO;
import com.jsp.tollapp.dto.changepwd.ChangeDTO;

@Repository
public class ChangeDAO {

	private static Logger logger = LoggerFactory.getLogger(ChangeDAO.class);

	@Autowired
	private SessionFactory factory;

	public boolean changePass(ChangeDTO dto, String email) {
		Session session = factory.openSession();
		Transaction transaction = session.beginTransaction();
		try {
			logger.info("ChangeDAO changePass() method started");
			
			if (dto.getPassword().equals(dto.getConfirmpassword())) {
				String hqls = "update AdminDTO C set C.password=:pass where C.email=:ems";
				Query query = session.createQuery(hqls);
				query.setParameter("ems", email);
				query.setParameter("pass", dto.getConfirmpassword());
				query.executeUpdate();
				transaction.commit();
				return true;
			}
			else
			{
				return false;
			}

		} catch (Exception e) {
			logger.error("Exception in changePass() method method");
			e.printStackTrace();
		}
		logger.info("ChangeDAO changePass() method ended");
		return true;
	}
}
