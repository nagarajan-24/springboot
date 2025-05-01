package com.example.demo.Model;


import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name="user")
public class User {
	@Id
	private String userName;
	private String email;
	private String user;
	private String password;
	private String role;
	
	public User() {
		super();
	}
	public User(String userName, String email, String user, String password, String role) {
		super();
		this.userName = userName;
		this.email = email;
		this.user = user;
		this.password = password;
		this.role = role;
	}
	public String getUserName() {
		return userName;
	}
	public void setUserName(String userName) {
		this.userName = userName;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getUser() {
		return user;
	}
	public void setUser(String user) {
		this.user = user;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public String getRole() {
		return role;
	}
	public void setRole(String role) {
		this.role = role;
	}
	
	@Override
	public String toString() {
		return "User [userName=" + userName + ", email=" + email + ", user=" + user + ", password=" + password
				+ ", role=" + role + "]";
	}
	
	
}
