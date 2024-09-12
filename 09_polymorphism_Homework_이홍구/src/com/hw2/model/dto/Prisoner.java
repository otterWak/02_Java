package com.hw2.model.dto;

public class Prisoner extends Person {

	private String crime; // 죄목

	
	
	public Prisoner(String id, String name, String crime) {
		super(id, name);
		this.crime = crime;
	}



	@Override
	public String getInfo() {
		return String.format("Id : %s , 이름 : %s , 직책 : %s", id, name, crime);
	}
	
	
	
}
