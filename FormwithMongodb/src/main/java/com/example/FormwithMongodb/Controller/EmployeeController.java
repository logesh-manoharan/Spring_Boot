package com.example.FormwithMongodb.Controller;

import com.example.FormwithMongodb.Model.EmployeeDetails;
import com.example.FormwithMongodb.repository.EmployeeRepository;

import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
@RequestMapping("/register")
public class EmployeeController {
	
	@Autowired
	private EmployeeRepository employeeRepository;
	
	@RequestMapping(method=RequestMethod.GET)
	public String openForm(Map<String, Object> model) {
		EmployeeDetails employeeForm = new EmployeeDetails();
		model.put("employeeForm", employeeForm);
		
		return "EmployeeForm";
	}
	
	@RequestMapping(method = RequestMethod.POST)
	public String collectDetails(@ModelAttribute("employeeForm") EmployeeDetails employee,
			Map<String, Object> model) {
		System.out.println("Employee Name: " + employee.getEmployeeName());
		System.out.println("Employee Age: " + employee.getAge());
		System.out.println("Employee City: " + employee.getCity());
		employeeRepository.save(employee); // save all the details into MongoDB
		return "RegistrationSuccess";
	}
}
