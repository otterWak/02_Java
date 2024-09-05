package edu.kh.oop.practice.run;

import edu.kh.oop.practice.model.service.BookService;

public class PracticeRun {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

//		+ main(args : String[]) : void
//		null / 0 / 0.0 / null
//		자바의정석 / 30000 / 0.2 / 남궁성
//		=============================
//		수정된 결과 확인
//		C언어 / 30000 / 0.1 / 홍길동
//		=============================
//		도서명 = C언어
//		할인된 가격 = 27000원
//		도서명 = 자바의정석
//		할인된 가격 = 24000원
		
		BookService BS = new BookService();
		
		BS.practice();
		
	}
	
//	    현실 객체 : 자신의 기능과 속성이 다른 것들과 구분 되는 것
//		객체 지향 언어 : 독립적으로 각각 인식할 수 있게 하는 것
//		자바 객체 : 클래스에 정의된 내용대로 new 연산자를 통해 메모리 영역에 생성된 것
//		class : 객체의 속성과 기능에 대해 정의한 것
//		new 연산자 : 
//		추상화 : 공통된 내용만을 넣는 것
//		캡슐화 : 데이터들과 기능을 하나로 묶어 관리
//		캡슐화 원칙 : 1. 멤버 변수는 private
//					  2. 멤버 변수에 대한 연산 메소드는 클래스 내에 작성
//					  3. 멤버 메소드는 public
//		메서드/기능의 '정의'란 : 특정 기능을 수행하기 위한 코드의 집합
//		메서드의 '호출' 이란 : 정의된 메소드를 사용하기 뒤하 넋
//		return : 자신을 호출한 함수쪽으로 돌아가는 것
//
//		public String ex1() {
//		    return "Hi";
//		}
//
//		위 메서드 상세히 해석 
//		어디에서든 호출한 곳으로 "Hi"를 반환해주는 문자열 변수  ex1


}
