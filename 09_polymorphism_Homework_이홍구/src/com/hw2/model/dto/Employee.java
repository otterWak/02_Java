package com.hw2.model.dto;

public class Employee extends Person{

	private String position; // 직책

	
	
	public Employee(String id, String name, String position) {
		super(id, name);
		this.position = position;
		
		System.out.println("직원이 추가되었습니다 - " + getInfo() );
	}



	@Override
	public String getInfo() {
		return "ID : " + id
				+ " , 이름 : " + name
				+ " , 직책 : " + position + "\n";
	}



	public String getPosition() {
		return position;
	}



	public void setPosition(String position) {
		this.position = position;
	}
	
	
	
	
}
