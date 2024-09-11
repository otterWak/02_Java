package com.hw2.model.service;

import com.hw2.model.dto.Employee;
import com.hw2.model.dto.Person;

public class Company implements ManagementSystem {
	private Employee[] employees; // 전체 직원 저장용 배열
	private int employeeCount; // 직원수
	
	public Company(int size) {
		employees = new Employee[size];
		employeeCount = 0;
	}
	
	@Override
	public void addPerson(Person person) {
		
		for(int i = 0; i < employees.length; i++) {
			if(employeeCount != employees.length) {
				employees[i] = (Employee) person;
				System.out.println(employees[i].getInfo());
				break;
			}else {
				System.out.println("인원이 모두 충원되었습니다");
				break;
			}
		}
	}
	
	@Override
	public void removePerson(String id) {
		for(int i = 0; i < employees.length; i++) {
			if(id.equals(employees[i].getId())) {
				employees[i] = null;
				break;
			}else {
				System.out.println("해당 id를 가진 직원을 찾을 수 없습니다");
				break;
			}
		}
	}
	
	@Override
	public void displayAllPersons() {
		System.out.println("전체 직원 명단 : ");
		
		for(int i = 0; i < employees.length; i++) {
			if(employees[i] == null) {
				break;
			}else {
				System.out.println(employees[i].getInfo());
			}
		}
		
	}

	public Employee[] getEmployees() {
		return employees;
	}

	public void setEmployees(Employee[] employees) {
		this.employees = employees;
	}

	public int getEmployeeCount() {
		return employeeCount;
	}

	public void setEmployeeCount(int employeeCount) {
		this.employeeCount = employeeCount;
	}
	
	
	
	

}
