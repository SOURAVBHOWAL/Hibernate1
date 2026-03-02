package com.model;

import jakarta.persistence.*;

@Entity
@Table(name="Emp")
public class Employee {
	@Id
	@Column(name="id")
	private int id;
	@Column
	private String name;
	@Column
	private String email;
	@Column
	private String mobile;
	public Employee() {
		
	}
	public Employee(int id, String name, String email, String mobile) {
		super();
		this.id = id;
		this.name = name;
		this.email = email;
		this.mobile = mobile;
	}
	public int getId() {
		return id;
	}
	public String getName() {
		return name;
	}
	public String getEmail() {
		return email;
	}
	public String getMobile() {
		return mobile;
	}
	public void setId(int id) {
		this.id = id;
	}
	public void setName(String name) {
		this.name = name;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public void setMobile(String mobile) {
		this.mobile = mobile;
	}
	@Override
	public String toString() {
		return id+" "+name+" "+email+" "+mobile;
	}
	
}
