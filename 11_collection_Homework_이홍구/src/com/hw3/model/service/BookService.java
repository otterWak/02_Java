package com.hw3.model.service;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.Scanner;

import com.hw3.model.dto.Book;

public class BookService {

	List<Book> books = new ArrayList<Book>(); // 목록
	Scanner sc = new Scanner(System.in);
	List<Book> favorite = new ArrayList<Book>(); // 즐겨 찾기

	public void displayMenu() {
		int num = -1;
		while(num != 0) {
			System.out.println("====================================");
			System.out.println("<<도서 목록 프로그램>>");
			System.out.println("1. 도서 등록");
			System.out.println("2. 도서 조회");
			System.out.println("3. 도서 수정");
			System.out.println("4. 도서 삭제");
			System.out.println("5. 즐겨찾기 추가"); // 새로운 Map에 번호로 추가
			System.out.println("6. 즐겨찾기 삭제"); // 번호로 삭제
			System.out.println("7. 즐겨찾기 조회"); // Map 읽기
			System.out.println("8. 추천도서 뽑기"); // 제목만 출력
			System.out.println("0. 프로그램 종료");
			System.out.println("====================================");
			System.out.print("메뉴를 입력하세요 : ");
			num = sc.nextInt();
			
			switch(num) {
			case 1: addBooks(); break;
			case 2: searchBooks(); break;
			case 3: fixBooks(); break;
			case 4: deleteBooks(); break;
			case 5: addFavorite(); break;
			case 6: deleteFavorite(); break;
			case 7: searchFavorite(); break;
			case 8: recommendBook(); break;
			case 0: System.out.println("프로그램 종료"); break;
			default: System.out.println("0~8사이 숫자만 입력하시오");
			}
		}
	}
	
	public void addBooks() {
		books.add(new Book(1111, "세이노의 가르침", "세이노", 6480, "데이원"));
		books.add(new Book(2222, "문과남자의 과학공부", "유시민", 15750, "돌베개"));
		books.add(new Book(3333, "역행자", "자청", 17550, "웅진지식하우스"));
		books.add(new Book(4444, "꿀벌의 예언", "베르나르 베르베르", 15120, "열린책들"));
		books.add(new Book(5555, "도둑맞은 집중력", "요한 하리", 16920, "어크로스"));
	}


	public void searchBooks() {
		for(int i = 0; i < books.size(); i++) {
			System.out.println(books.get(i).toString());
		}
	}


	public void fixBooks() {
		System.out.print("수정할 도서 번호를 입력하세요 : ");
		int num = sc.nextInt();
		
		boolean existBook = false;
		for(int i = 0; i < books.size(); i++) {
			if(books.get(i).getNum() == num ) {
				
				boolean flag = true;
				while(flag) {
					System.out.println("1. 도서명");
					System.out.println("2. 도서 저자");
					System.out.println("3. 도서 가격");
					System.out.println("4. 도서 출판사");
					System.out.println("0. 수정 종료");
					System.out.print("어떤 정보를 수정하시겠습니까?");
					int selectNum = sc.nextInt();
					
					
					switch(selectNum) {
					case 1 : books.get(i).setTitle(fixTitle()); break;
					case 2 : books.get(i).setAuthor(fixAuthor()); break;
					case 3 : books.get(i).setPrice(fixPrice()); break;
					case 4 : books.get(i).setPublisher(fixPublisher()); break;
					case 0 : System.out.println("수정 종료"); flag = false; break; 
					default : System.out.println("0~4 사이 숫자만 입력하시오");
					}
					
				}
				existBook = true;
			}
		}
		
		if(existBook == false) {
			System.out.println("해당하는 책을 찾을 수 없습니다");
		}
		
	}

	
	public String fixTitle() {
		System.out.println("=====도서 제목 수정=====");
		System.out.print("수정할 제목을 입력하세요 : ");
		String newTitle = sc.next();
		sc.nextLine();
		System.out.println();
		System.out.println("수정 완료");
		
		return newTitle;
		
	}
	
	public String fixAuthor() {
		System.out.println("=====도서 저자 수정=====");
		System.out.print("수정할 저자를 입력하세요 : ");
		String newAuthor = sc.next();
		sc.nextLine();
		System.out.println();
		System.out.println("수정 완료");
		
		return newAuthor;
		
	}
	
	public int fixPrice() {
		System.out.println("=====도서 가격 수정=====");
		System.out.print("수정할 가격을 입력하세요 : ");
		int newPrice = sc.nextInt();
		System.out.println();
		System.out.println("수정 완료");
		
		return newPrice;
	}
	
	public String fixPublisher() {
		System.out.println("=====도서 출판사 수정=====");
		System.out.print("수정할 출판사를 입력하세요 : ");
		String newPublisher = sc.next();
		sc.nextLine();
		System.out.println();
		System.out.println("수정 완료");
		
		return newPublisher;
	}


	// 4. 도서 삭제
	public void deleteBooks() {
		System.out.println("<도서 삭제>");
		System.out.print("삭제할 도서 번호 입력 : ");
		int input = sc.nextInt();
		boolean flag = false;
		for(int i =0; i < books.size(); i++) {
			if(input == books.get(i).getNum()) {
				books.remove(i);
				
				flag = true;
			}
		}
		
		if(!flag) {
			System.out.println("입력하신 번호에 해당하는 책이 없습니다");
		}else {
			System.out.println("삭제 완료");
		}
	}


	// 5. 즐겨찾기 추가
	public void addFavorite() {
		System.out.println("<즐겨찾기 등록>");
		System.out.print("즐겨찾기에 등록할 도서 번호 입력 : ");
		int input = sc.nextInt();
		
		boolean flag = false;
		for(int i =0; i < books.size(); i++) {
			if(input == books.get(i).getNum()) {
				favorite.add(books.get(i));
				flag = true;
			}
		}
		
		if(!flag) {
			System.out.println("입력하신 번호에 해당하는 책이 없습니다");
		}else {
			System.out.println("즐겨찾기 등록 완료");
		}
	}

	
	// 6. 즐겨찾기 삭제
	public void deleteFavorite() {
		System.out.println("<즐겨찾기 삭제>");
		System.out.print("삭제할 도서 번호 입력 : ");
		int input = sc.nextInt();
		boolean flag = false;
		for(int i =0; i < favorite.size(); i++) {
			if(input == favorite.get(i).getNum()) {
				favorite.remove(i);
				flag = true;
			}
		}
		
		if(!flag) {
			System.out.println("입력하신 번호에 해당하는 책이 없습니다");
		}else {
			System.out.println("삭제 완료");
		}
	}

	
	// 7. 즐겨찾기 조회
	public void searchFavorite() {
		if(favorite.isEmpty()) {
			System.out.println("즐겨찾기에 등록된 책이 없습니다. 등록하세요.");
		}else {	
			for(int i = 0; i < favorite.size(); i++) {
				System.out.println(favorite.get(i).toString());
			}
		}
	}

	
	// 8. 추천도서 뽑기
	public void recommendBook() {
		System.out.println("<추천 도서 뽑기>");
		Random random = new Random();
		int result = random.nextInt(books.size());
		
		String rBook = books.get(result).getTitle();
		
		System.out.println("추천 도서 : " + rBook);
	}
}
