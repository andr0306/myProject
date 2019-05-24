package com.football.entity;

import javax.persistence.Entity;
import javax.persistence.Table;

@Entity
@Table(name = "matchEntity")
public class MatchEntity extends BaseEntity{

	private String name;
	
	private String enemyname;
	
	private int score;
	
	private int enemyscore;
	
	private String date;

	public MatchEntity() {
		super();
		// TODO Auto-generated constructor stub
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getEnemyname() {
		return enemyname;
	}

	public void setEnemyname(String enemyname) {
		this.enemyname = enemyname;
	}

	public int getScore() {
		return score;
	}

	public void setScore(int score) {
		this.score = score;
	}

	public int getEnemyscore() {
		return enemyscore;
	}

	public void setEnemyscore(int enemyscore) {
		this.enemyscore = enemyscore;
	}

	public String getDate() {
		return date;
	}

	public void setDate(String date) {
		this.date = date;
	}
	
	
}
