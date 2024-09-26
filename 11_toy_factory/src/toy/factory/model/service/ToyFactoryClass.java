package toy.factory.model.service;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Scanner;
import java.util.Set;

import toy.factory.model.dto.ToyClass;

public class ToyFactoryClass {

	Set<ToyClass> toys = new HashSet<ToyClass>();
	Map<Integer, String> materials = new HashMap<Integer, String>();
	Scanner sc = new Scanner(System.in);
	
	
	public Set<String> addMaterial(Integer...newMaterials){
		
		Set<String> addMaterial = new HashSet<String>();
		
		for(Integer materialKey : newMaterials) {
			String materialValue = materials.get(materialKey);
			if(materialValue != null) {
				addMaterial.add(materialValue);
			}
		}
		
		return addMaterial;
	}
	
	public void toyFactory() {
		materials.put(1, "면직물");
		materials.put(2, "플라스틱");
		materials.put(3, "유리");
		materials.put(4, "고무");
		
		toys.add(new ToyClass("마이롱레그", 8, 36000, "분홍색", 19950805, addMaterial(1,4) ));
		toys.add(new ToyClass("허기워기", 5, 12000, "파란색", 19940312, addMaterial(1,2) ));
		toys.add(new ToyClass("키시미시", 5, 15000, "분홍색", 19940505, addMaterial(1,2) ));
		toys.add(new ToyClass("캣냅", 8, 27000, "보라색", 19960128, addMaterial(1,2) ));
		toys.add(new ToyClass("파피", 12, 57000, "빨간색", 19931225, addMaterial(1,2,4) ));
	}
	
	public void displayMenu() {
		int num = -1;
		while(num != 0) {
			System.out.println("===================================================");
			System.out.println("<<플레이타임 공장>>");
			System.out.println("1. 전체 장난감 조회하기");
			System.out.println("2. 새로운 장난감 만들기");
			System.out.println("3. 장난감 삭제하기");
			System.out.println("4. 장난감 제조일 순으로 조회하기");
			System.out.println("5. 연령별 사용 가능한 장난감 리스트 조회하기");
			System.out.println("6. 재료추가");
			System.out.println("7. 재료제거");
			System.out.println("0. 종료");
			System.out.println("===================================================");
			System.out.print("선택 : ");
			
			num = sc.nextInt();
			
			switch(num) {
			case 1: search(); break;
			case 2: createToy(); break;
			case 3: deleteToy(); break;
			case 4: searchByDate(); break;
			case 5: searchByAge(); break;
			case 6: addMaterial(); break;
			case 7: deleteMaterial(); break;
			case 0: System.out.println("프로그램 종료"); break;
			default : System.out.println("0~7 사이 숫자만 입력하시오");
			}
		}
	}


	public void search() {
		System.out.println("<전체 장난감 목록>");
		Iterator<ToyClass> it = toys.iterator();
		
		int i = 1;
		while(it.hasNext()) {
			ToyClass temp = it.next();
			System.out.println(i + "."+ temp);
			i++;
		}
	}

	
	public void createToy() {
		System.out.println("<<새로운 장난감 추가>>");
		
		System.out.print("장난감 이름 : ");
		String name = sc.next();
		
		for(ToyClass toy : toys) {
			if(toy.getName().equals(name)) {
				System.out.println("이미 존재하는 장난감입니다");
			}
		}
		
		System.out.print("사용가능 연령 : ");
		int age = sc.nextInt();
		
		System.out.print("가격 : ");
		int price = sc.nextInt();
		
		System.out.print("색상 : ");
		String color = sc.next();
		
		System.out.print("제조일 (YYYYMMDD 형식으로 입력): ");
		int date = sc.nextInt();
		
		Set<String> material = new HashSet<String>();
		boolean flag = true;
		while(flag) {
			System.out.print("재료를 입력하세요(종료버튼 : q) : ");
			String input = sc.next();
			
			material.add(input);
			
			if(input.equals("q")){
				flag = false;
			}
		}
		
		ToyClass newToy = new ToyClass(name, age, price, color, date, material);
		
		toys.add(newToy);
		System.out.println("새로운 장난감이 추가되었습니다");
		
	}

	
	public void deleteToy() {
		System.out.println();
		System.out.print("삭제할 장난감의 이름을 입력하세요 : ");
		String input = sc.next();
		
		boolean flag = false;
		
		for(ToyClass toy : toys) {
			if(toy.getName().equals(input)) {
				toys.remove(toy);
				flag = true;
				break;
				// 1. 효율 향상을 위해 break;
				// 2. 순회중인 컬렉션 객체가 수정되어 충돌한다는 예외 발생
				// -> 예외 방지 및 효율을 위해서 작성
			}
		}
		
		if(flag) {
			System.out.println("장난감이 삭제되었습니다");
		}else {
			System.out.println("해당하는 이름의 장난감이 없습니다");
		}
		
	}


	public void searchByDate() {
		System.out.println("<제조일 순으로 장난감을 정렬>");
		
		List<ToyClass> toySearchByDate = new ArrayList<ToyClass>(toys);
		toySearchByDate.sort(Comparator.comparing(ToyClass::getDate));
		
		for(int i = 0; i < toySearchByDate.size(); i++) {
			System.out.println(i+1 + "." + toySearchByDate.get(i));
		}
	}

	
	public void searchByAge() {
		System.out.println("<연령별로 사용 가능한 장난감>");
		
		Map<Integer, List<ToyClass>> toyage = new HashMap<Integer, List<ToyClass>>();
		// toyage라는 이름의 새로운 Map을 생성
		// -> 연령을 key로 지정하고, 해당 연령을 가진 장난감 List를 value로 가짐
		// {K : V, K : V, K : V...}
		// -> {5 : ["키시미시", "허기워기"], 8:["냇냅", "마미롱레그"], 12 : ["파피"]}
		
		for(ToyClass toy : toys) {
			int age = toy.getAge();
			toyage.putIfAbsent(age, new ArrayList<>());
			// putIfAbsent() : Map에서 제공하는 메서드로,
			// 해당 키가 존재하지 않는 경우메나 전달 받은 값을 추가함.
			// -> Map에 해당 연령의 리스트가 없는 경우에만 새로운 리스트를 생성하여 추가
			
			toyage.get(age).add(toy);
			// toyage.get(age) -> age(K)에 맞는 Value 반환 -> List
			// List.add(toy) -> 전달된 toy객체를 List에 추가
		}
		
		/* toyage (Map) :
		 * {
		 * 		5: ["키시미시", "허기워기"]
		 * 		8: ["캣냅", {마미롱레그"],
		 * 		12: ["파피"]
		 * }
		 * 
		 * */
		for(Entry<Integer, List<ToyClass>> entry : toyage.entrySet()) {
			int age = entry.getKey(); // 해당 entry의 key(나이)를 얻어옴
			List<ToyClass> list = entry.getValue(); // 해당 entry의 value를 얻어옴
			
			System.out.println("[연령 : " + age + "세]");
			int num = 1;
			for(ToyClass toy : list) {
				System.out.println(num + "." + toy);
				num++;
			}
		}
	}

	
	public void addMaterial() {
		System.out.println("<재료 추가>");
		System.out.println("---현재 등록된 재료---");
		for(Entry<Integer, String> entry : materials.entrySet()) {
			System.out.println(entry.getKey() + " : " + entry.getValue());
		}
		
		System.out.println("------------------------------------------");
		System.out.print("재료 고유번호(key) 입력 : ");
		int key = sc.nextInt();
		
		System.out.println("재료명 입력 : ");
		String newMaterial = sc.next();
		
		if(materials.containsKey(key)) {
			System.out.println("이미 해당 키에 재료가 등록되어 있습니다");
			System.out.print("덮어쓰시겠습니까?(y/n) : ");
			char input = sc.next().toLowerCase().charAt(0);
			
			//String input = sc.next(); // "Y", "y" / "N" , "n"
			
			//if(input.equalsIgnoreCase("y")) {}
			
			if(input == 'y') {
				materials.put(key, newMaterial);
				System.out.println("재료가 성공적으로 덮어쓰기 되었습니다");
			}else {
				System.out.println("취소되었습니다");
			}
		}else {
			materials.put(key, newMaterial);
			System.out.println("새로운 재료가 성공적으로 등록되었습니다");
		}
	}


	public void deleteMaterial() {
		System.out.println("<재료 삭제>");
		System.out.println("---현재 등록된 재료---");
		for(Entry<Integer, String> entry : materials.entrySet()) {
			System.out.println(entry.getKey() + " : " + entry.getValue());
		}
		
		System.out.println("------------------------------------------");
		
		System.out.print("삭제할 재료명 입력 : ");
		String input = sc.next();
		
		boolean flag = false;
		
		for(Entry<Integer, String> entry : materials.entrySet()) {
			if(entry.getValue().equals(input)) {
				materials.remove(entry.getKey());
				System.out.println("재료 '" + input + "'가 성공적으로 제거되었습니다");
				flag = true;
				break;
			}
		}
		
		if(!flag) {
			System.out.println("해당 이름의 재료가 존재하지 않습니다.");
		}
		
	}
}
