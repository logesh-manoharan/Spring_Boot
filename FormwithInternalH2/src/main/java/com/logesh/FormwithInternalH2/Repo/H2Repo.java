package com.logesh.FormwithInternalH2.Repo;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;

import com.logesh.FormwithInternalH2.Model.Emloyee;
import java.util.*;

// this CRUD(Create, Read, Update, Delete) Repository enables we to perform all the DB opertions
public interface H2Repo extends CrudRepository<Emloyee, Integer> {
	// Here we can create our own QUERIES
	
	// get data based on one particular field. Method FORMAT => 'findBy'+'field name'()
	List<Emloyee> findByEmployeeName(String employeeName);
	
	List<Emloyee> findByEmployeeAge(int employeeAge);
	
	// Greater Than operation is also supported here
	
	List<Emloyee> findByEmployeeAgeGreaterThan(int employeeAge);
	
	//COMPLEX QUERIES i.e. need more functionalities 'Query'(JPQL - Java Persistence Query Language) 
	   //...annotation is used
	
	// Note: Select * is NOT NEEDED here.
	// to use the VARIABLE '?' + 'number which indicates the nth parameter of a function' 
	   // ...is used before the variable name
	
	@Query("from Emloyee where employeeAge=?1 order by employeeName")
	List<Emloyee> findByEmployeeAgeSorted(int employeeAge);
}
