package com.hibernate.hotel.util;
import com.hibernate.hotel.dto.HotelDTO;
public class HotelDTO_Tester
{
	public static void main(String[] args)
	{
		System.out.println("Main method starts");
		HotelDTO hotelDTO=new HotelDTO();
		hotelDTO.setHid(1301);
		hotelDTO.setHname("yaara");
		hotelDTO.setType("VEG");
		hotelDTO.setLocation("patiala");
		System.out.println(hotelDTO);
		System.out.println("Main method ends");
	}
}
