package com.example.FormwithMongodb.Controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class HomepageController {
	@RequestMapping("/")
	public String callHomepage() {
		return "index";
	}
	
}
