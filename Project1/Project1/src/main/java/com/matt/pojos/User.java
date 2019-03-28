package com.matt.pojos;

public class User 
{
	private int id;
	private String username;
	private String password;
	private String empRole; //will be set to either E or M --> E for employee and M for manager
	
	public User() {}
	
	public User(int id, String username, String password, String er) 
	{
		super();
		this.id = id;
		this.username = username;
		this.password = password;
		this.empRole = er;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public String getEmpRole() {
		return empRole;
	}

	public void setEmpRole(String empRole) {
		this.empRole = empRole;
	}

	@Override
	public String toString() {
		return "User [id=" + id + ", username=" + username + ", password=" + password + "]";
	}
}