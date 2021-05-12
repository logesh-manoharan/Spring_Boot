package com.logesh.DependencyInjection;

import org.springframework.stereotype.Component;

// Laptop's object is also created inside the SPRING CONTAINER.

@Component
public class Laptop {
	private int lid;
	private String brand;
	private int price;
	public int getLid() {
		return lid;
	}
	public void setLid(int lid) {
		this.lid = lid;
	}
	public String getBrand() {
		return brand;
	}
	public void setBrand(String brand) {
		this.brand = brand;
	}
	public int getPrice() {
		return price;
	}
	public void setPrice(int price) {
		this.price = price;
	}
	
	
	public void hai() {
		System.out.println("Hai...I am HP laptop");
	}
	
}
