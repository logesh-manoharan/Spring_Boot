package com.example.FormwithMongodb.Model;

import org.springframework.data.mongodb.core.mapping.Document;

@Document(collection="EmployeeDetails")
public class EmployeeDetails {
	private String employeeName;
	private int age;
	private String city;
	
	public String getEmployeeName() {
		return employeeName;
	}
	public void setEmployeeName(String name) {
		this.employeeName = name;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public String getCity() {
		return city;
	}
	public void setCity(String city) {
		this.city = city;
	}
	
}
