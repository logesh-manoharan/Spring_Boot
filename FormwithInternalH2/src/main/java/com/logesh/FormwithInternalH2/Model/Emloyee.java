package com.logesh.FormwithInternalH2.Model;

import javax.persistence.Entity;
import javax.persistence.Id;

//Entity annotation will create the new table inside the database (JPA plays his role)

@Entity
public class Emloyee {
	@Id
	private int employeeId;
	private String employeeName;
	private int employeeAge;
	public String getEmployeeName() {
		return employeeName;
	}
	public void setEmployeeName(String employeeName) {
		this.employeeName = employeeName;
	}
	public int getEmployeeAge() {
		return employeeAge;
	}
	public void setEmployeeAge(int employeeAge) {
		this.employeeAge = employeeAge;
	}
	public int getEmployeeId() {
		return employeeId;
	}
	public void setEmployeeId(int employeeId) {
		this.employeeId = employeeId;
	}
	
}
