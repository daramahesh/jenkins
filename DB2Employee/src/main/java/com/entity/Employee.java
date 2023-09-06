package com.entity;

import java.util.Date;

public class Employee {
	
	
	
	  private String empNo; 
	  private String midinit;
	  private String firstName;
	  private String lastName;
	  private String workDept; 
	  private String job;
	  private String sex; 
	  private String phoneNo; 
	  private Date hireDate;
	  private int edLevel;
	  private Date birthDate; 
	  private float bonus;
	  private float comm;
	  private float salary;
	  
	  
	  
	  public Employee() { super();
	  
	  }



	public String getEmpNo() {
		return empNo;
	}



	public float getSalary() {
		return salary;
	}



	public void setSalary(float salary) {
		this.salary = salary;
	}



	public void setEmpNo(String empNo) {
		this.empNo = empNo;
	}



	public String getMidinit() {
		return midinit;
	}



	public void setMidinit(String midinit) {
		this.midinit = midinit;
	}



	public String getFirstName() {
		return firstName;
	}



	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}



	public String getLastName() {
		return lastName;
	}



	public void setLastName(String lastName) {
		this.lastName = lastName;
	}



	public String getWorkDept() {
		return workDept;
	}



	public void setWorkDept(String workDept) {
		this.workDept = workDept;
	}



	public String getJob() {
		return job;
	}



	public void setJob(String job) {
		this.job = job;
	}



	public String getSex() {
		return sex;
	}



	public void setSex(String sex) {
		this.sex = sex;
	}



	public String getPhoneNo() {
		return phoneNo;
	}



	public void setPhoneNo(String phoneNo) {
		this.phoneNo = phoneNo;
	}



	public Date getHireDate() {
		return hireDate;
	}



	public void setHireDate(Date hireDate) {
		this.hireDate = hireDate;
	}



	public int getEdLevel() {
		return edLevel;
	}



	public void setEdLevel(int edLevel) {
		this.edLevel = edLevel;
	}



	public Date getBirthDate() {
		return birthDate;
	}



	public void setBirthDate(Date birthDate) {
		this.birthDate = birthDate;
	}







	public float getBonus() {
		return bonus;
	}



	public void setBonus(float bonus) {
		this.bonus = bonus;
	}



	public float getComm() {
		return comm;
	}



	public void setComm(float comm) {
		this.comm = comm;
	}
	  
	  
	 
	  
	  
	  
	 
}
