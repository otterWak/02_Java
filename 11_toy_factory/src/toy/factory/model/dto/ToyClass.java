package toy.factory.model.dto;

import java.util.Map;

// 장난감의 정보를 저장하고 관리하는 데이터 전송 객체(DTO)
public class ToyClass {

	private String name;
	private int age;
	private int price;
	private String color;
	private int date;
	private Map<Integer, String> material;
	
	public ToyClass() {
		// TODO Auto-generated constructor stub
	}

	public ToyClass(String name, int age, int price, String color, int date) {
		super();
		this.name = name;
		this.age = age;
		this.price = price;
		this.color = color;
		this.date = date;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public int getPrice() {
		return price;
	}

	public void setPrice(int price) {
		this.price = price;
	}

	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}

	public int getDate() {
		return date;
	}

	public void setDate(int date) {
		this.date = date;
	}

	public Map<Integer, String> getMaterial() {
		return material;
	}

	public void setMaterial(Map<Integer, String> material) {
		this.material = material;
	}
	
	
	
}
