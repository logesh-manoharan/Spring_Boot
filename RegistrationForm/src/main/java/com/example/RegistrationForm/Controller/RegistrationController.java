package com.example.RegistrationForm.Controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class RegistrationController {
	
	@GetMapping("/")
	public String callHomepage() {
		return "index";
	}
	
	@GetMapping("/register")
	public String callRegistrationpage() {
		return "registrationForm";
	}
	
	@PostMapping("/storeDetail")
	public String callDisplaypage(@RequestParam("fullname") String fullname,
			@RequestParam("username") String username, @RequestParam("password") String password,
			ModelMap modelMap) {
		modelMap.put("fullname", fullname);
		modelMap.put("username", username);
		modelMap.put("password", password);
		return "displayPage";
	}
}
