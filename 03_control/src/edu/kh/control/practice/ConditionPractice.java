package edu.kh.control.practice;

import java.util.Scanner;

public class ConditionPractice {

	Scanner sc = new Scanner(System.in);
	
	public void practice1(){
		System.out.print("숫자를 한 개 입력하세요 : ");
		int num = sc.nextInt();
		
		String result;
		
		if(num<=0) {
			result = "양수만 입력해주세요";
		}else if(num%2 == 0) {
			result = "짝수입니다";
		}else {
			result = "홀수입니다";
		}
		
		
		System.out.println(result);
	}
	//키보드로 입력 받은 정수가 양수이면서 짝수일 때만 “짝수입니다.”를 출력하고
	//짝수가 아니면 “홀수입니다.“를 출력하세요.
	//양수가 아니면 “양수만 입력해주세요.”를 출력하세요.
	
	public void practice2(){
		System.out.print("국어점수 : ");
		int lang = sc.nextInt();
		
		System.out.print("수학점수 : ");
		int math = sc.nextInt();
		
		System.out.print("영어점수 : ");
		int eng = sc.nextInt();
		
		int sum = lang + math + eng;
		double avg = sum/3.0;
		
		if(lang<40 && eng<40 && math <40 && avg<60) {
			System.out.println("합계 : " + sum);
			System.out.println("평균 : " + avg);
			System.out.println("불합격입니다");
		}else {
			System.out.printf(" 국어 : %d\n 수학 : %d\n 영어 : %d\n 합계 : %d\n 평균 : %.2f\n 축하합니다, 합격입니다!"
					, lang, math, eng, sum, avg );
		}
		
	}
	//국어, 영어, 수학 세 과목의 점수를 키보드로 입력 받고 합계와 평균을 계산하고
	//합계와 평균을 이용하여 합격 / 불합격 처리하는 기능을 구현하세요.
	//(합격 조건 : 세 과목의 점수가 각각 40점 이상이면서 평균이 60점 이상일 경우)

	//합격 했을 경우 과목 별 점수와 합계, 평균, “축하합니다, 합격입니다!”를 출력하고
	//불합격인 경우에는 “불합격입니다.”를 출력하세요.
	
	
	public void practice3(){
		
		System.out.print("1~12 사이의 정수 입력 : ");
		int month = sc.nextInt();	
		int day;
		
		switch(month) {
		case 1:  case 3: case 5: case 7: case 8: case 10: case 12: day = 31;
		break;
		
		case 2 : day = 28;
		break;
		
		case 4 : case 6: case 9: case 11: day = 30;
		break;
		
		default : System.out.println(month + "월은 잘못 입력된 달입니다");
		return;
		}
		
		System.out.printf("%d월은 %d일까지 있습니다", month, day);
		
	}
	//1~12 사이의 수를 입력 받아 해당 달의 일수를 출력하세요.(2월 윤달은 생각하지 않습니다.)
	//잘못 입력한 경우 “OO월은 잘못 입력된 달입니다.”를 출력하세요. (switch문 사용)
	
	
	public void practice4(){
		
		System.out.print("키(m)를 입력 해 주세요 : ");
		double height = sc.nextDouble();
		
		System.out.print("몸무게(kg)를 입력 해 주세요 : ");
		double weight = sc.nextDouble();
		
		double bmi = weight/(height*height);
		
		System.out.println("BMI 지수 : "+ bmi);
		
		String result;
		
		if(bmi>=30) {
			result = "고도비만";
		}else if(bmi>=+25) {
			result = "비만";
		}else if(bmi>=23) {
			result = "과체중";
		}else if(bmi>=18.5) {
			result = "정상체중";
		}else{
			result = "저체중";
		};
		
		System.out.println(result);
	}
	//키, 몸무게를 double로 입력 받고 BMI지수를 계산하여 계산 결과에 따라
	//저체중/정상체중/과체중/비만을 출력하세요.
	
	
	public void practice5(){
		System.out.print("중간 고사 점수 : ");
		int rMS = sc.nextInt();
		double mS = rMS*0.2;
		
		System.out.print("기말 고사 점수 : ");
		int rFS = sc.nextInt();
		double fS = rFS*0.3;
		
		System.out.print("과제 점수 : ");
		int rTS = sc.nextInt();
		double tS = rTS*0.3;
		
		System.out.print("출석 횟수 : ");
		int attend = sc.nextInt();
		
		double total = mS+fS+tS+attend;
		
		System.out.println("=========== 결과 ===========");

		if((20-attend) >= 20*0.3) {
			System.out.printf("Fail [출석 횟수 부족 (%d / 20)", attend);
		}else {
			if(total < 70) {
				System.out.println("Fail [점수 미달]");
			}else {
				System.out.println("중간 고사 점수 (20) : "+mS);
				System.out.println("기말 고사 점수 (30) : "+fS);
				System.out.println("과제 점수 (30) : "+tS);
				System.out.println("출석 점수 (20) : "+attend);
				System.out.println("총점 : "+total);
				System.out.println("Pass");
			}
		}
	}
	//중간고사, 기말고사, 과제점수, 출석횟수를 입력하고 Pass 또는 Fail을 출력하세요.
	//평가 비율은 중간고사 20%, 기말고사 30%, 과제 30%, 출석 20%로 이루어져 있고
	//이 때, 출석 횟수는 총 강의 횟수 20회 중에서 출석한 날만 따진 값으로 계산하세요.
	//70점 이상일 경우 Pass, 70점 미만이거나 전체 강의에 30% 이상 결석 시 Fail을 출력하세요.
}
