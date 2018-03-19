package com.hibernate.hotel.util;
import com.hibernate.hotel.dao.HotelDAO;
import com.hibernate.hotel.dto.HotelDTO;
public class HotelDAO_Tester 
{
	public static void main(String[] args)
	{
		System.out.println("Main method starts");
		HotelDTO hotelDTO=new HotelDTO();
		hotelDTO.setHid(1302);
		hotelDTO.setHname("yaara");
		hotelDTO.setLocation("ludhiana");
		hotelDTO.setType("Veg");
		System.out.println(hotelDTO);
		HotelDAO hotelDAO=new HotelDAO();
		hotelDAO.save(hotelDTO);
		HotelDAO hotelDAO1=new HotelDAO();
		HotelDTO hotelDTO1=hotelDAO1.getById(1300);
		System.out.println(hotelDTO1);
		hotelDAO1.updateLocationById(1301, "patran");
		System.out.println("Main method ends");
	}
}