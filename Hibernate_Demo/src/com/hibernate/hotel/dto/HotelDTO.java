package com.hibernate.hotel.dto;
import java.io.Serializable;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
@Entity
@Table(name="hotel_table")
public class HotelDTO implements Serializable
{
	@Id
	@Column(name="h_id")
	private int hid;
	@Column(name="h_name")
	private String hname;
	@Column(name="h_type")
	private String type;
	@Column(name="h_location")
	private String location;
	public HotelDTO() 
	{
		System.out.println("Hotel Created");
	}
	public String toString() 
	{
		return "HotelDTO [hid=" + hid + ", hname=" + hname + ", type=" + type + ", location=" + location + "]";
	}
	public int getHid() {
		return hid;
	}
	public void setHid(int hid) {
		this.hid = hid;
	}
	public String getHname() {
		return hname;
	}
	public void setHname(String hname) {
		this.hname = hname;
	}
	public String getType() {
		return type;
	}
	public void setType(String type) {
		this.type = type;
	}
	public String getLocation() {
		return location;
	}
	public void setLocation(String location) {
		this.location = location;
	}
}
