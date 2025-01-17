package edu.kh.op.practice;

import java.util.Scanner;

public class OperatorPractice {
	Scanner sc = new Scanner(System.in);
	//모든 사람이 사탕을 골고루 나눠가지려고 한다. 인원 수와 사탕 개수를 키보드로 입력 받고
	//1인당 동일하게 나눠가진 사탕 개수와 나눠주고 남은 사탕의 개수를 출력하세요.
	public void practice1(){
		
		
		System.out.print("인원 수를 입력하시오 : ");
		int numP = sc.nextInt();
		System.out.print("사탕 개수를 입력하시오 : ");
		int numC = sc.nextInt();
		
		System.out.println("인당 사탕 개수 : " + (numC / numP));
		System.out.println("남은 사탕 개수 : " + (numC % numP));
	}

	/*
	ex.
	이름 : 홍길동
	학년(정수만) : 3
	반(정수만) : 4
	번호(정수만) : 15
	성별(남학생/여학생) : 남학생
	성적(소수점 아래 둘째 자리까지) : 85.75
	3학년 4반 15번 홍길동 남학생의 성적은 85.75이다.
	*/
	public void practice2(){
		System.out.print("이름 : ");
		String name = sc.next();
		
		System.out.print("학년 : ");
		int grade = sc.nextInt();
		
		System.out.print("반 : ");
		int classNum = sc.nextInt();
		
		System.out.print("번호 : ");
		int no = sc.nextInt();
		
		System.out.print("성별 : ");
		String sex = sc.next();
		
		// sc.nextLine(); // 입력버퍼 비우는 일(개행문자 비우기)
		
		System.out.print("성적(소수점 아래 둘째자리 까지) : ");
		float score = sc.nextFloat();
		
		System.out.printf("%d 학년 %d 반 %d 번 %s %s 학생의 성적은 %.2f 이다\n", 
				grade, classNum, no, name, sex, score);
	}

	//메소드 명 : public void practice3(){}
	//국어, 영어, 수학에 대한 점수를 키보드를 이용해 정수로 입력 받고,
	//세 과목에 대한 합계(국어+영어+수학)와 평균(합계/3.0)을 구하세요.
	
	public void practice3(){
		System.out.print("국어 : ");
		int lang = sc.nextInt();
		
		System.out.print("영어 : ");
		int eng = sc.nextInt();
		
		System.out.print("수학 : ");
		int math = sc.nextInt();
		System.out.println();
		System.out.printf("합계 : %d\n 평균 : %.2f\n", lang + eng + math, (lang + eng + math)/3.0);
		//System.out.println("합계 : " + (lang + eng + math));
		//System.out.println("합계 : " + ((lang + eng + math)/3.0));
		
	}
}


