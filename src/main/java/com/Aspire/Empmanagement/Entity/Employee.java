package com.Aspire.Empmanagement.Entity;

import java.time.LocalDate;


import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.validation.constraints.Email;
import javax.validation.constraints.Max;
import javax.validation.constraints.Min;
import javax.validation.constraints.NotBlank;

@Entity

public class Employee {
	@Id
	@GeneratedValue(strategy= GenerationType.AUTO)
	private long empid;
	
	@NotBlank(message="name should not empty")
	private String name;
	
	@Min(1000)
	@Max(100000)
	private double salary;
	
	
	private LocalDate joindate;
	
	@Email(message=" Enter correct email id")
	private String email;
	
	
	public long getEmpid() {
		return empid;
	}
	public void setEmpid(long empid) {
		this.empid = empid;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public double getSalary() {
		return salary;
	}
	public void setSalary(double salary) {
		this.salary = salary;
	}
	public LocalDate getJoindate() {
		return joindate;
	}
	public void setJoindate(LocalDate joindate) {
		this.joindate = joindate;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	
	
	
}
