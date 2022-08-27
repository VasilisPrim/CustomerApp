package com.myWorkApp;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;


public class User {
	private String name;
	private String surname;
	private String gender;
	private String birthdate;
	private String homeAddress;
	private String workAddress;
	
	

public User(String name, String surname, String gender, String birthdate, String homeAddress, String workAddress) {
		super();
		this.name = name;
		this.surname = surname;
		this.gender = gender;
		this.birthdate = birthdate;
		this.homeAddress = homeAddress;
		this.workAddress = workAddress;
	}
	
	
	
	
	



public String getHomeAddress() {
		return homeAddress;
	}



	public void setHomeAddress(String homeAddress) {
		this.homeAddress = homeAddress;
	}



	public String getWorkAddress() {
		return workAddress;
	}



	public void setWorkAddress(String workAddress) {
		this.workAddress = workAddress;
	}




	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getSurname() {
		return surname;
	}

	public void setSurname(String surname) {
		this.surname = surname;
	}

	public String getGender() {
		return gender;
	}

	public void setGender(String gender) {
		this.gender = gender;
	}

	public String getBirthdate() {
		return birthdate;
	}

	public void setBirthdate(String birthdate) {
		this.birthdate = birthdate;
	}



	@Override
	public String toString() {
		return "User [name=" + name + ", surname=" + surname + ", gender=" + gender + ", birthdate=" + birthdate
				+ ", homeAddress=" + homeAddress + ", workAddress=" + workAddress + "]";
	}

	
	
	
	
	

}
