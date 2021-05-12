package com.example.FormwithMongodb.repository;

import javax.management.Query;

import org.springframework.data.mongodb.repository.MongoRepository;

import com.example.FormwithMongodb.Model.EmployeeDetails;

public interface EmployeeRepository extends MongoRepository<EmployeeDetails, Integer> {

	public EmployeeDetails findByEmployeeName(String employeeName);
	
}
