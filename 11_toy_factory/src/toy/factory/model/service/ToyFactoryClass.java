package toy.factory.model.service;

import java.util.LinkedList;
import java.util.List;
import java.util.Scanner;

import toy.factory.model.dto.ToyClass;

// 장난감 공장을 모델링하고, 장난감 관리 기능을 제공하는 서비스 클래스
public class ToyFactoryClass {

	Scanner sc = new Scanner(System.in);
	List<ToyClass> toylist = new LinkedList<ToyClass>();
	
	public void displayMenu() {
		boolean flag = true;
		
		while(flag) {
			System.out.println("<<플레이타임 공장>>");
			System.out.println("1. 전체 장난감 조회하기");
			System.out.println("2. 새로운 장난감 만들기");
			System.out.println("3. 장난감 삭제하기");
			System.out.println("4. 장난감 제조일 순으로 조회하기");
			System.out.println("5. 연령별 사용 가능한 장난감 리스트 조회하기");
			System.out.println("6. 재료 추가");
			System.out.println("7. 재료 제거");
			System.out.println("8. 종료");
			System.out.print("선택 : ");
			int num = sc.nextInt();
			
			switch(num) {
			case 1: search(); break;
			case 2: addToy(); break; 
			case 3: delToy(); break;
			case 4: searchByDate(); break;
			case 5: searchByAge(); break;
			case 6: addmaterial(); break;
			case 7: delmaterial(); break;
			case 8: System.out.println("시스템 종료"); flag = false; break;
			default : System.out.println("1~7 사이 숫자만 입력하시오");
			}
		}
		
	}
	
	
	/**
	 * 공장에 있는 모든 장난감의 정보를 출력
	 */
	public void search() {
		
	}
	
	
	/**
	 * 새로운 장난감을 추가하고, 사용자가 입력한 정보로 객체를 생성
	 */
	public void addToy() {
		
	}
	
	
	/**
	 * 공장에서 장난감을 삭제
	 */
	public void delToy() {
		
	}
	
	
	/**
	 * 장난감을 제조일에 따라 정렬하여 출력
	 */
	public void searchByDate() {
		
	}
	
	
	/**
	 * 사용 가능한 연령을 입력 받고, 해당하는 장난감을 출력
	 */
	public void searchByAge() {
		
	}
	
	
	/**
	 * 새로운 재료를 등록하고, 장난감에 해당 재료를 추가
	 */
	public void addmaterial() {
		
	}
	
	
	/**
	 * 등록된 재료를 삭제하고, 해당하는 재료를 사용하는 장난감에서 제거
	 */
	public void delmaterial() {
		
	}
}
