package com.training.spring;

public class Car {
	
	private String color;
	private String type;
	private String make;
	private String model;
	
	public String getColor() {
		return color;
	}
	public void setColor(String color) {
		this.color = color;
	}
	public String getType() {
		return type;
	}
	public void setType(String type) {
		this.type = type;
	}
	public String getMake() {
		return make;
	}
	public void setMake(String make) {
		this.make = make;
	}
	public String getModel() {
		return model;
	}
	public void setModel(String model) {
		this.model = model;
	}
	
	public String getCarDetails() {
		return color+":"+type+":"+make+":"+model;
	}
	

}
