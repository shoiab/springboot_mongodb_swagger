package com.taskapp.model;

import java.util.Date;

import org.springframework.data.mongodb.core.mapping.Document;

@Document(collection="UserCollection")
public class UserModel {
	private String name;
	private String email;
	private Date dateOfCreation;
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public Date getDateOfCreation() {
		return dateOfCreation;
	}
	public void setDateOfCreation(Date dateOfCreation) {
		this.dateOfCreation = dateOfCreation;
	}
	
	
}
