package com.kh.inheritance.model.dto;

public class Phone {

	private String brand; // 브랜드
	private String model; // 모델명
	private int year; // 출시년도
	private int price; //가격
	
	
	// 생성자
	public Phone() {
		// TODO Auto-generated constructor stub
	}


	public Phone(String brand, String model, int year, int price) {
		super();
		this.brand = brand;
		this.model = model;
		this.year = year;
		this.price = price;
	}
	
	public void printInfo() {
		System.out.printf("Brand: %s\n"
				+ "Model: %s\n"
				+ "Year: %d\n"
				+ "Price: %d원\n", brand, model, year, price);
	}


	public String getBrand() {
		return brand;
	}


	public void setBrand(String brand) {
		this.brand = brand;
	}


	public String getModel() {
		return model;
	}


	public void setModel(String model) {
		this.model = model;
	}


	public int getYear() {
		return year;
	}


	public void setYear(int year) {
		this.year = year;
	}


	public int getPrice() {
		return price;
	}


	public void setPrice(int price) {
		this.price = price;
	}
	
	
	
}
