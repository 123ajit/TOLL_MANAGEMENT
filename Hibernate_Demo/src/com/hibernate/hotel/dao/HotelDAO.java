package com.hibernate.hotel.dao;
import java.util.Objects;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;
import com.hibernate.hotel.dto.HotelDTO;
public class HotelDAO 
{
	public void save(HotelDTO dto)
	{
		System.out.println("Saving \t"+dto);
		Configuration cfg=new Configuration();
		cfg.configure("Mysql.cfg.xml");
		cfg.addAnnotatedClass(HotelDTO.class);
		SessionFactory factory=cfg.buildSessionFactory();
		Session session=factory.openSession();
		Transaction tranaction=session.beginTransaction();
		session.save(dto);
		tranaction.commit();
		session.close();
		factory.close();
	}
	public HotelDTO getById(int id)
	{
		Configuration cfg=new Configuration();
		cfg.configure("Mysql.cfg.xml").addAnnotatedClass(HotelDTO.class);
		SessionFactory factory=cfg.buildSessionFactory();
		Session session=factory.openSession();
		HotelDTO dto=session.get(HotelDTO.class, id);
		if(Objects.nonNull(dto))
		{
			System.out.println("Object is found");
			return dto;
		}
		else
		{
			System.out.println("Object is not found");
		}	
		session.close();
		factory.close();
		return dto;
	}
	public void updateLocationById(int id,String newLocation)
	{
		SessionFactory factory=new Configuration().configure("Mysql.cfg.xml").addAnnotatedClass(HotelDTO.class).buildSessionFactory();
		Session session=factory.openSession();
		Transaction transaction=session.beginTransaction();
		HotelDTO fromDB=session.get(HotelDTO.class, id);
		if(Objects.nonNull(fromDB))
		{
			fromDB.setLocation(newLocation);
			session.update(fromDB);
			System.out.println("Object Created");
		}
		else
		{
			System.out.println("Object not created");
		}
		transaction.commit();
		session.close();
		factory.close();
	}
}