package com.hw2.model.service;

import com.hw2.model.dto.Employee;
import com.hw2.model.dto.Person;
import com.hw2.model.dto.Prisoner;

public class Prison implements ManagementSystem{

	private Prisoner[] prisoners; // 전체 수감자 저장용 배열
	
	private int prisonerCount; // 수감자 수 
	
	
	public Prison(int size) {
		prisoners = new Prisoner[size];
		prisonerCount = 0;
	}


	@Override
	public void addPerson(Person person) {
		if(person instanceof Prisoner && prisonerCount < prisoners.length) {
			prisoners[prisonerCount++] = (Prisoner)person;
			System.out.println("수감자가 추가 되었습니다 - " + person.getInfo());
		}else {
			System.out.println("인원이 많아서 더 이상 수감 불가");
		}
	}

	@Override
	public void removePerson(String id) {
		for(int i = 0; i < prisonerCount; i++) {
			if(id.equals(prisoners[i].getId())) {
				System.out.println("수감자가 삭제되었습니다 - " + prisoners[i].getInfo());
				prisoners[i] = null;
				
				for(int c = i; c < prisonerCount -1 ; c++) {
					prisoners[c] = prisoners[c+1];
				}
				
				prisoners[--prisonerCount] = null;
				return;
			}

			System.out.println("해당 id를 가진 수감자를 찾을 수 없습니다");
		}
		
	}


	@Override
	public void displayAllPersons() {
		System.out.println("전체 수감자 명단 : ");
		
		for(int i = 0; i < prisonerCount; i++) {
				System.out.println(prisoners[i].getInfo());
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
