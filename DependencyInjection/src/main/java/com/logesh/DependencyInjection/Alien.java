package com.logesh.DependencyInjection;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

// if we set a @Component annotation then ONE Object(SingleTon object) will created inside the
//...spring container(i.e. bean). We can access it anyplace without instantiating the class

@Component
public class Alien {
	// here now, Alien class depends on Laptop class so. How alien class get the object 
	//...inside the container i.e. laptop object inside container. Autowire is the solution for that
	
	@Autowired
	private Laptop laptop;
	
	private int aid;
	private String aname;
	public int getAid() {
		return aid;
	}
	public void setAid(int aid) {
		this.aid = aid;
	}
	public String getAname() {
		return aname;
	}
	public void setAname(String aname) {
		this.aname = aname;
	}
	
	public void hello() {
		System.out.println("Alien CLass");
		laptop.hai();
	}
	
	
}
