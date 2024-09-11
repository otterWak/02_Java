package com.hw2.model.service;

import com.hw2.model.dto.Employee;
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
		for(int i = 0; i < prisoners.length; i++) {
			if(prisonerCount != prisoners.length) {
				prisoners[i] = (Prisoner) person;
				System.out.println(prisoners[i].getInfo());
				break;
			}else {
				System.out.println("인원이 모두 충원되었습니다");
				break;
			}
		}
	}


	@Override
	public void removePerson(String id) {
		for(int i = 0; i < prisoners.length; i++) {
			if(id.equals(prisoners[i].getId())) {
				prisoners[i] = null;
				break;
			}else {
				System.out.println("해당 id를 가진 수감자를 찾을 수 없습니다");
				break;
			}
		}
	}


	@Override
	public void displayAllPersons() {
		System.out.println("전체 수감자 명단 : ");
		
		for(int i = 0; i < prisoners.length; i++) {
			if(prisoners[i] == null) {
				break;
			}else {
				System.out.println(prisoners[i].getInfo());
			}
		}
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
