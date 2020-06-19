package com.example.demo.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
@Entity
@Table(name = "userdata")
public class LoginModel {
	
@Id
@GeneratedValue(strategy = GenerationType.AUTO)

public Long id;
public String name;
public String email;
public Long getId() {
	return id;
}
public void setId(Long id) {
	this.id = id;
}
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
@Override
public String toString() {
	return "LoginModel [id=" + id + ", name=" + name + ", email=" + email + "]";
}
public LoginModel(Long id, String name, String email) {
	super();
	this.id = id;
	this.name = name;
	this.email = email;
}

public LoginModel() {}
}
