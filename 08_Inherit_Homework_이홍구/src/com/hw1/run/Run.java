package com.hw1.run;

import java.util.Scanner;

import com.hw1.model.vo.Employee;
import com.hw1.model.vo.Student;

public class Run {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		
		// 1. 3명의 학생 정보를 기록할 수 있게 객체 배열을 할당하고
		//    아래의 사용데이터를 참고하여 3명의 학생 객체 생성 후 반복문을 통해 출력
		
		// 2. 최대 10명의 사원 정보를 기록할 수 있게 객체 배열을 할당하고
		//    반복문을 사용하여 키보드로 사원 정보를 입력 받도록 구현
		//    2명 정도의 사원 정보를 입력 받아 각 객체에 저장하고 현재까지 기록된 사원들의 정보출력

		
		// 3명의 학생 정보를 기록할 수 있게 객체 배열 할당
		Student[] stdArray = new Student[3];
		
		// 위의 사용데이터 참고하여 3명의 학생 정보 초기화
		stdArray[0] = new Student("홍길동", 20, 178.2, 70, 1, "정보시스템공학과");
		stdArray[1] = new Student("김말똥", 21, 187.3, 80, 2, "경영학과");
		stdArray[2] = new Student("강개순", 23, 167.0, 45, 4, "정보통신학과");
		
		// 객체 출력
		// 향상된 for문
		/*
		 * 자바에서 배열, 컬렉션과 같은 데이터를 순차적으로 간단하게 반복할 수 있는
		 * 구조를 제공
		 * 일반적인 for문 보다 코드가 더 간결하고 가독성이 좋아서
		 * 반복 작업을 더 쉽게 할 수 있음
		 * 
		 * for(데이터타입 변수명 : 배열 또는 컬렉션){
		 * 				// 반복해서 실행할 코드
		 * }
		 * 
		 * */
		
		for(Student std : stdArray) {
			System.out.println(std.information());
		}
		
		
//		for(int i = 0; i < stdArray.length; i++) {
//			System.out.println(stdArray[i].information());
//		}
		
		System.out.println("=====================================================");
		
		// 최대 10명의 사원 정보를 기록할 수 있게 배열을 할당
		Employee[] emps = new Employee[10];
		// 사원들의 정보를 키보드로 계속 입력 받고(while(true) 무한 반복문 이용)
		// 계속 추가할 것인지 물어보고, 대소문자 상관없이 'y'이면 계속 객체 추가
		// 한명씩 추가 될 때 마다 카운트
		
		int count = 0;
		
		while(true) {
			System.out.print("이름 : ");
			String name = sc.next();
			
			System.out.print("나이 : ");
			int age = sc.nextInt();
			
			System.out.print("키 : ");
			double height = sc.nextDouble();
			
			System.out.print("몸무게 : ");
			double weight = sc.nextDouble();
			
			System.out.print("급여 : ");
			int salary = sc.nextInt();
			
			System.out.print("부서 : ");
			String dept = sc.next();
			
			emps[count] = new Employee(name, age, height, weight, salary, dept);
			count++;
			
			// 배열이 꽉 찼으면 반복 종료
			if(count == emps.length) {
				break;
			}
			
			// 추가 여부 묻기
			System.out.print("계속 추가할래? (y/n) : ");
			String str = sc.next().toUpperCase(); // 소문자 -> 대문자
			//  toLowerCase() : 대문자 -> 소문자
			
			if(str.equals("N")) break;
			
		}
		
		// 현재까지 기록된 사원들의 정보를 모두 출력
		for(Employee emp : emps) {
			// 만약에 emp 가 null 이면 반복 멈춰
			if(emp == null) break; // NullPoinerEnxception 해결
			
			System.out.println(emp.information());
		}
			

		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	
	}
}
