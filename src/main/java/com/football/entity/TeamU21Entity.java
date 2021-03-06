package com.football.entity;

import javax.persistence.Entity;
import javax.persistence.Table;

@Entity
@Table(name="teamU21")
public class TeamU21Entity extends BaseEntity{

private String firstname;
	
	private String lastname;
	
	private int age;
	
	private String position;
	
	private String img;
	
	private String rating;

	public TeamU21Entity() {
		super();
		
	}

	public String getFirstname() {
		return firstname;
	}

	public void setFirstname(String firstname) {
		this.firstname = firstname;
	}

	public String getLastname() {
		return lastname;
	}

	public void setLastname(String lastname) {
		this.lastname = lastname;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public String getPosition() {
		return position;
	}

	public void setPosition(String position) {
		this.position = position;
	}

	public String getImg() {
		return img;
	}

	public void setImg(String img) {
		this.img = img;
	}

	public String getRating() {
		return rating;
	}

	public void setRating(String rating) {
		this.rating = rating;
	}
	
	
}
