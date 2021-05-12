package com.logesh.FormwithInternalH2.Repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

import com.logesh.FormwithInternalH2.Model.Employee;


@RepositoryRestResource(collectionResourceRel = "employee", path="employee")
public interface EmployeeRepo extends JpaRepository<Employee, Integer> {
	
}
