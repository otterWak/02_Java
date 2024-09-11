package com.hw2.run;

import com.hw2.model.dto.Employee;

public class Run {
	public static void main(String[] args) {
		// Company의 생성자를 이용하여 10칸 짜리 Employee 객체배열 생성하는 Company 객체를
		// 생성하여 ManagementSystem 자료형의 company에 주소를 저장
		
		// Prison의 생성자를 이용하여 10칸 짜리 Prisoner 객체배열 생성하는 Prison 객체를
		// 생성하여 ManagementSystem 자료형의 prison에 주소를 저장
		
		// 2명 정도 직원 새로 등록하기
		// 등록된 전체 직원 조회
		
		// 2명 정도 수감자 새로 등록하기
		// 등록된 전체 수감자 조회
		
		// EMP001 id 를 가진 직원 삭제
		// 1205 id 를 가진 수감자 삭제
		
		// 현재 남은 직원 모두 조회
		// 현재 남은 수감자 모두 조회
		
		Employee emp1 = new Employee("EMP001", "유재석", "기획팀");
		Employee emp2 = new Employee("EMP002", "정형돈", "개발팀");
	}
}
