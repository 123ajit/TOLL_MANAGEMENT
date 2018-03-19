package com.bhim.mvc.signup.dto;
import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

import org.hibernate.annotations.GenericGenerator;

@Entity
@Table(name = "signup_table")
public class SignupDTO implements Serializable
{
	@Id
	@GenericGenerator(name = "anything", strategy = "increment")
	@GeneratedValue(generator = "anything")
	private int sid;
	private String religion;
	private String gender;
	private int age;
	private double height;
	private double salary;
	private String experience;
	public SignupDTO() 
	{
		System.out.println("SignupDTO created \t"+this.getClass().getSimpleName());
	}
	public String getReligion() {
		return religion;
	}
	public void setReligion(String religion) {
		this.religion = religion;
	}
	public String getGender() {
		return gender;
	}
	public void setGender(String gender) {
		this.gender = gender;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public double getHeight() {
		return height;
	}
	public void setHeight(double height) {
		this.height = height;
	}
	public double getSalary() {
		return salary;
	}
	public void setSalary(double salary) {
		this.salary = salary;
	}
	public String getExperience() {
		return experience;
	}
	public void setExperience(String experience) {
		this.experience = experience;
	}
	@Override
	public String toString() {
		return "{religion=" + religion + ", gender=" + gender + ", age=" + age + ", height=" + height
				+ ", salary=" + salary + ", experience=" + experience + "}";
	}
}