package com.hw2.model.service;

import com.hw2.model.dto.Person;
import com.hw2.model.dto.Prisoner;

public class Prison implements ManagementSystem{

	private Prisoner[] prisoners; // 전체 수용자 저장용 배열
	
	private int prisonerCount; // 사용자 수 
	
	
	public Prison(int size) {
		prisoners = new Prisoner[size];
		prisonerCount = 0;
	}


	@Override
	public void addPerson(Person person) {
		
	}


	@Override
	public void removePerson(String id) {
		
	}


	@Override
	public void displayAllPersons() {
		
	}


	public Prisoner[] getPrisoners() {
		return prisoners;
	}


	public void setPrisoners(Prisoner[] prisoners) {
		this.prisoners = prisoners;
	}


	public int getPrisonerCount() {
		return prisonerCount;
	}


	public void setPrisonerCount(int prisonerCount) {
		this.prisonerCount = prisonerCount;
	}
	
	
	
	
}
