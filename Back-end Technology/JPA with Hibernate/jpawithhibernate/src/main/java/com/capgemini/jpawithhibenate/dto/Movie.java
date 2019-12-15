package com.capgemini.jpawithhibenate.dto;

import javax.persistence.*;
//pojo class
@Entity
@Table(name="movie")   //to connect with the table
public class Movie {
	@Id
	@Column(name="movie_id")
	private int mid;
	@Column(name="movie_name")   //we use (name="column name") only when the column name is differet.
	private String mname;
	@Column(name="movie_rating")
	private String rating;
	
	public int getMid() {
		return mid;
	}
	public void setMid(int mid) {
		this.mid = mid;
	}
	public String getMname() {
		return mname;
	}
	public void setMname(String mname) {
		this.mname = mname;
	}
	public String getRating() {
		return rating;
	}
	public void setRating(String rating) {
		this.rating = rating;
	}


}
