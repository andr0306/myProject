package com.football.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Lob;
import javax.persistence.Table;

@Entity
@Table(name ="peticionEntity")
public class PeticionEntity extends BaseEntity {

	private String firstname;
	
	private String lastname;
	 
	private String title;
	
	private int likes;
	
	private int dislike;
	
	@Lob
	@Column(columnDefinition="TEXT")
	private String description;
	
	

	public PeticionEntity() {
		super();
		// TODO Auto-generated constructor stub
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

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public int getLikes() {
		return likes;
	}

	public void setLikes(int likes) {
		this.likes = likes;
	}

	public int getDislike() {
		return dislike;
	}

	public void setDislike(int dislike) {
		this.dislike = dislike;
	}
	
	

}
