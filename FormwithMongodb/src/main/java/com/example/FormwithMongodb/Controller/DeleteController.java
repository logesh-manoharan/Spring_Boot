package com.example.FormwithMongodb.Controller;

import java.util.Map;

import javax.management.Query;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.mongodb.core.query.Criteria;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.example.FormwithMongodb.Model.DeleteDetails;
import com.example.FormwithMongodb.Model.EmployeeDetails;
import com.example.FormwithMongodb.repository.EmployeeRepository;

@Controller
@RequestMapping("/deleteEmployee")
public class DeleteController {
	
	@Autowired
	private EmployeeRepository employeeRepository;
	
	@RequestMapping(method=RequestMethod.GET)
	public String callDeletepage(Map<String, Object> model) {
		DeleteDetails deleteForm = new DeleteDetails();
		model.put("deleteForm", deleteForm);  
		// model.put("Name mentioned in ModelAttribute of DeleteForm")
		return "deleteForm";
	}
	
	@RequestMapping(method=RequestMethod.POST)
	public void deleteEmployeefromDB(@ModelAttribute("deleteForm") DeleteDetails deleteEmployee) {
		EmployeeDetails employee = employeeRepository.findByEmployeeName(deleteEmployee.getEmployeeName());
		System.out.println(employee);
	}
}
