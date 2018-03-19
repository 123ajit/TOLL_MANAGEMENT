package com.sum.cricket.dto;

import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

import org.hibernate.annotations.GenericGenerator;
@Entity  //datbase mapping
@Table(name="Admin") //create table
public class LoginDTO implements Serializable
{
	@Id
	@GenericGenerator(name="ab", strategy="increment") //automatic id generate
	@GeneratedValue(generator="ab")  //Automatic id generate
	private int id;
	private String userName;
	private String password;
	
	public LoginDTO() {
		System.out.println("Created "+this.getClass().getSimpleName());
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getUserName() {
		return userName;
	}
	public void setUserName(String userName) {
		this.userName = userName;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	
  
@Override
public String toString() {
	return "LoginDTO [userName=" + userName + ", password=" + password + "]";
}

}
