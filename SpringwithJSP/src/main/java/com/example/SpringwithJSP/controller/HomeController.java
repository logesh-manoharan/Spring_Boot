package com.example.SpringwithJSP.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class HomeController {
	@GetMapping(value="/")
	public String callHomePage() {
		return "index";   // this will call the index.jsp file
	}
	
	@GetMapping(value="/about")
	public String callAboutPage() {
		return "about";
	}
}
