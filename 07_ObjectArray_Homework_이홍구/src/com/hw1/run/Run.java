package com.hw1.run;

import java.util.Arrays;

import com.hw1.model.vo.Employee;

public class Run {

	public static void main(String[] args) {
		// 객체 배열을 크기 3으로 할당 한 뒤 3개의 생성자를 각각 이용하여 객체 생성 후 출력
		Employee[] empArr = new Employee[3];
		empArr[0] = new Employee();
		empArr[1] = new Employee(1, "홍길동", 19, 'M', "01022223333", "서울 잠실" );
		empArr[2] = new Employee(2, "강말순", "교육부", "강사", 20, 'F', 1000000, 0.01, "01011112222", "서울 마곡");
		
		for(int i = 0 ; i < empArr.length; i++) {
			System.out.println( empArr[i].information());
		}
		
		System.out.println("==========================================");
		// 3개의 객체 중 값이 없는 필드에 각각 값을 넣은 뒤 출력
		empArr[0].setEmpNo(0);
		empArr[0].setEmpName("김말똥");
		empArr[0].setDept("영업부");
		empArr[0].setJob("팀장");
		empArr[0].setAge(30);
		empArr[0].setGender('M');
		empArr[0].setSalary(3000000);
		empArr[0].setBonusPoint(0.2);
		empArr[0].setPhone("01055559999");
		empArr[0].setAddress("전라도 광주");
		
		empArr[1].setDept("기획부");
		empArr[1].setJob("부장");
		empArr[1].setSalary(4000000);
		empArr[1].setBonusPoint(0.3);
		
		System.out.println(empArr[0].information());
		System.out.println(empArr[1].information());
		
		System.out.println("==========================================");
		
		
		
		// 직원 각각의 보너스가 적용된 1년 연봉을 계산하여 출력
		// 연봉 = (급여 + (급여*보너스포인트))*12
		
		for(int i = 0; i < empArr.length; i++) {
			System.out.println(empArr[i].getEmpName() + "의 연봉 : "
					+ (int)(12*(empArr[i].getSalary()*(1+empArr[i].getBonusPoint())))+ "원");
		}
		System.out.println("==========================================");
		
		// 3명의 직원의 연봉 평균을 구하여 출력
		int result = 0;
		for(int i = 0; i < empArr.length; i++) {
			result += (int)(12*(empArr[i].getSalary()*(1+empArr[i].getBonusPoint())));
		}
		
		System.out.println("직원들의 연보으이 평균 : " + (result/empArr.length)+"원");
		
	}
}
