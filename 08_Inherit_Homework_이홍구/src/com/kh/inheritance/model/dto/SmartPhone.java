package com.kh.inheritance.model.dto;

public class SmartPhone extends Phone{

	private String operatingSystem; // OS
	private int sotorageCapacity; // 스토리지공간크기
	
	public SmartPhone() {
		// TODO Auto-generated constructor stub
	}

	public SmartPhone(String brand, String model, int year, int price, String operatingSystem, int sotorageCapacity) {
		super(brand, model, year, price);
		this.operatingSystem = operatingSystem;
		this.sotorageCapacity = sotorageCapacity;
	}
	
	@Override
	public void printInfo() {
		super.printInfo();
		System.out.printf("Operating System: %s\n"
				+ "Storage Capacity: %sGB\n",operatingSystem, sotorageCapacity );
	}
	
}
