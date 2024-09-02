package edu.kh.control.practice;

import java.util.Scanner;

public class LoopPractice {
	
	Scanner sc = new Scanner(System.in);
	
	public void practice1(){
		System.out.print("1이상의 숫자를 입력하시오 : ");
		int num = sc.nextInt();
		
		
		if(num<1) {
			System.out.println("입력한 수는 1보다 크거나 같아야 합니다");
			return;
		}
		
		for(int i = 1; i <= num; i++) {
			System.out.print(i);
		}
	}
	//사용자로부터 한 개의 값을 입력 받아 1부터 그 숫자까지의 숫자들을 모두 출력하세요.
	//단, 입력한 수는 1보다 크거나 같아야 합니다.
	//만일 1 미만의 숫자가 입력됐다면 “1 이상의 숫자를 입력해주세요“를 출력하세요.
	
	
	public void practice2(){
		System.out.print("1이상의 숫자를 입력하시오 : ");
		int num = sc.nextInt();
		
		if(num<1) {
			System.out.println("입력한 수는 1보다 크거나 같아야 합니다");
			return;
		}
		
		for(int i = num; i >= 1; i--) {
			System.out.print(i);
		}
		
	}
	//사용자로부터 한 개의 값을 입력 받아 1부터 그 숫자까지의 모든 숫자를 거꾸로 출력하세요.
	//단, 입력한 수는 1보다 크거나 같아야 합니다.
	
	
	public void practice3(){
		System.out.print("정수를 하나 입력하시오 : ");
		int num = sc.nextInt();
		int add = 0;
		
		for(int i = 1; i <= num; i++) {
			if(i == num) {System.out.print(i +  "=");}
			else {System.out.print(i + "+");}
			
			add += i;
		}
		
		System.out.print(add);
	}
	//1부터 사용자에게 입력 받은 수까지의 정수들의 합을 for문을 이용하여 출력하세요.
	
	
	public void practice4(){
		System.out.println("첫 번째 숫자 : ");
		int num1 = sc.nextInt();
		
		System.out.println("두 번째 숫자 : ");
		int num2 = sc.nextInt();
		
		if(num1 < 1 || num2 < 1) {
			System.out.println("1 이상의 숫자를 입력해 주세요");
		}else if(num1 > num2) {
			for(int i=num2; i<=num1; i++) {
				System.out.print(i);
			}
		}else{
			for(int x=num1; x<=num2; x++) {
				System.out.print(x);
			}
		}
		
	}
	//사용자로부터 두 개의 값을 입력 받아 그 사이의 숫자를 모두 출력하세요.
	//만일 1 미만의 숫자가 입력됐다면 “1 이상의 숫자를 입력해주세요“를 출력하세요.
	
	
	public void practice5(){
		System.out.print("숫자 : ");
		int num = sc.nextInt();
		
		System.out.println("========="+num +"단=========");
		
		for(int i = 1; i <= 9 ; i++) {
			System.out.printf("%d x %d = %d\n", num, i, num*i);
		}
	}
	//사용자로부터 입력 받은 숫자의 단을 출력하세요.
	
	
	public void practice6(){
		System.out.print(" 숫자 : ");
		int num = sc.nextInt();
		
		if(num<2 || num>9) {
			System.out.println("2~9 사이 숫자만 입력해주세요.");
		}else {
			for(int i = num; i<=9; i++) {
				System.out.println("======"+i+"단======");
				for(int x = 1; x <=9; x++) {
					System.out.printf("%d x %d = %d\n", i, x, i*x);
				}
			}
		}
	}
	//사용자로부터 입력 받은 숫자의 단부터 9단까지 출력하세요.
	//단, 2~9를 사이가 아닌 수를 입력하면 “2~9 사이 숫자만 입력해주세요”를 출력하세요.
	
	
	public void practice7(){
		System.out.print("정수 입력 : ");
		int num = sc.nextInt();
		
		String result = "";
		
		for(int i = 1; i <=num; i++) {
			result += "*";
			System.out.printf("%s\n", result);
		}
	}
	//다음과 같은 실행 예제를 구현하세요.
	//정수 입력 : 4
	//*
	//**
	//***
	//****
	
	
	public void practice8(){
		System.out.print("정수 입력 : ");
		int num = sc.nextInt();
		
		for(int i = num; i >=1; i--) {
			for(int k=i; k>=1; k--) {
				System.out.print("*");
			}
			System.out.println();
		}
	}
	//다음과 같은 실행 예제를 구현하세요.
	//정수 입력 : 4
	//****
	//***
	//**
	//*
	

	public void practice9(){
		System.out.print("정수 입력 : ");
		int num = sc.nextInt();
		
		for(int y = 1; y <= num; y++) {
			for(int x = num-1; x>=y; x--) {
				System.out.print(" ");
			}
			for(int x = 1; x <= y; x++) {
				System.out.print("*");
			}
			System.out.println();
		}
		
	}

//	다음과 같은 실행 예제를 구현하세요.
//	정수 입력 : 4
//	   *
//	  **
//	 ***
//	****
	
	
	public void practice10(){
		System.out.print("정수 입력 : ");
		int num = sc.nextInt();
		
		for(int y = 1; y <= num; y++) {
			for(int i=1; i<=y; i++) {
				System.out.print("*");
			}
			System.out.println();
		}
		
		for(int y = num-1; y >= 1; y--) {
			for(int x=1; x<=y; x++) {
				System.out.print("*");
			}
			System.out.println();
		}
	}
//	다음과 같은 실행 예제를 구현하세요.
//	ex.
//	정수 입력 : 3
//	*
//	**
//	***
//	**
//	*

	
	
	public void practice11(){

		System.out.print("정수 입력 : ");
		int num = sc.nextInt();
		
		for(int i = 1; i <= num ; i++) {
			for(int b = 1; b<=num-i; b++) {
				System.out.print(" ");
			}
			for(int x = 1; x<= 2*i-1; x++) {
				System.out.print("*");
			}
			System.out.println();
		}
	}
//	다음과 같은 실행 예제를 구현하세요.
//	ex.
//	정수 입력 : 4
//	   *
//	  ***
//	 *****
//	*******
	
	
	public void practice12(){
		System.out.print("정수 입력 : ");
		int num = sc.nextInt();
		
		for(int i = 1; i <=num; i++) {
			if(i == 1 || i == num) {
				for(int y = 1; y <= num; y++) {
					System.out.print("*");
				}
			}else {
				for(int y = 1; y <= num; y++) {
					if(y == 1 || y == num) {
						System.out.print("*");
					}else {
						System.out.print(" ");
					}
				}
			}
			System.out.println();
		}
	}
//	다음과 같은 실행 예제를 구현하세요.
//
//	ex.
//	정수 입력 : 5
//	*****
//	*   *
//	*   *
//	*   *
//	*****
	
	
	public void practice13(){
		int count = 0;
		
		System.out.print("자연수 하나를 입력하세요 : ");
		int num = sc.nextInt();
		
		for(int i=1; i <=num; i ++) {
			if(i%2==0 || i%3 ==0) {
				System.out.print(i + " ");
				if(i%2==0 && i%3==0) {
					count += 1;
				}
			}
		}
		System.out.println();
		System.out.println("count : "+ count);
	}
//	1부터 사용자에게 입력 받은 수까지 중에서
//	1) 2와 3의 배수를 모두 출력하고
//	2) 2와 3의 공배수의 개수를 출력하세요.
//
//	* ‘공배수’는 둘 이상의 수의 공통인 배수라는 뜻으로 어떤 수를 해당 수들로 나눴을 때
//	모두 나머지가 0이 나오는 수
//
//	ex.
//	자연수 하나를 입력하세요 : 15
//	2 3 4 6 8 9 10 12 14 15
//	count : 2
}
