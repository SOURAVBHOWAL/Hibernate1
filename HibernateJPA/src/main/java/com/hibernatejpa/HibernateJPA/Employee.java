package com.hibernatejpa.HibernateJPA;

import jakarta.persistence.*;

@Entity
@Table
public class Employee {
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Id
	@Column
	private int id;
	@Column
	private String name;
	@Column
	private double salary;
	public Employee() {
		
	}
	public Employee(String name, double salary) {
		super();
		this.name = name;
		this.salary = salary;
	}
	public int getId() {
		return id;
	}
	public String getName() {
		return name;
	}
	public double getSalary() {
		return salary;
	}
	public void setId(int id) {
		this.id = id;
	}
	public void setName(String name) {
		this.name = name;
	}
	public void setSalary(double salary) {
		this.salary = salary;
	}
	@Override
	public String toString() {
		return id+" "+name+" "+salary;
	}
	
}

