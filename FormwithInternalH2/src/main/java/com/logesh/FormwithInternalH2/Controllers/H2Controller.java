package com.logesh.FormwithInternalH2.Controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;

import com.logesh.FormwithInternalH2.Model.Emloyee;
import com.logesh.FormwithInternalH2.Repo.H2Repo;

import java.util.*;

@Controller
public class H2Controller {
	
	@Autowired
	public H2Repo repo;
	
	@RequestMapping("/")
	public String callHomePage() {
		return "home";
	}
	
	@RequestMapping("register")
	public String callRegistrationPage() {
		return "registrationForm";
	}
	
	@RequestMapping("/addData")
	public ModelAndView addData(Emloyee employee) {
		ModelAndView mv = new ModelAndView();
		mv.addObject("employee", employee);
 		mv.setViewName("confirmationForm");
		repo.save(employee);
		return mv;
	}
	
	@RequestMapping("/getDataform")
	public ModelAndView getDataform() {
		ModelAndView mv = new ModelAndView();
		mv.addObject("title", "Get Employee");
		mv.addObject("method", "getData");
		mv.setViewName("GetEmployeeform");
		return mv;
	}
	
//	@RequestMapping("/updateDataform")
//	public ModelAndView updateDataform() {
//		ModelAndView mv = new ModelAndView();
//		mv.addObject("title", "Update Employee");
//		mv.addObject("method", "updateData");
//		mv.setViewName("GetEmployeeform");
//		return mv;
//	}
	
	@RequestMapping("/deleteDataform")
	public ModelAndView deleteDataform() {
		ModelAndView mv = new ModelAndView();
		mv.addObject("title", "Delete Employee");
		mv.addObject("method", "deleteData");
		mv.setViewName("GetEmployeeform");
		return mv;
	}
	
	@RequestMapping("/getData")
	public ModelAndView getData(@RequestParam int employeeId) {
		Emloyee employee = repo.findById(employeeId).orElse(null);
		ModelAndView mv = new ModelAndView();
		mv.addObject("employee", employee);
		mv.setViewName("confirmationForm");
		System.out.println(repo.findByEmployeeName("logesh").get(0).getEmployeeAge());
		System.out.println(repo.findByEmployeeAgeGreaterThan(20).get(0).getEmployeeName());  // age greater than 20
		System.out.println("With Sorting: " + repo.findByEmployeeAgeSorted(21).get(0).getEmployeeName());
		return mv;
	}
	
//	@RequestMapping("/updateData")
//	public ModelAndView updateData(@RequestParam int employeeId) {
//		Emloyee employee = repo.findById(employeeId).orElse(null);
//		ModelAndView mv = new ModelAndView();
//		mv.addObject("employee", employee);
//		mv.setViewName("confirmationForm");
//		return mv;
//	}
//	
	@RequestMapping("/deleteData")
	@ResponseBody
	public String deleteData(@RequestParam int employeeId) {
		repo.deleteById(employeeId);
		return "Deleted Succesfully";
	}
}
