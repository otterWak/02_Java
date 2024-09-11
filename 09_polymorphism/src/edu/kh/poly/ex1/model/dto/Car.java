package edu.kh.poly.ex1.model.dto;

public class Car /*extends Object*/{

	// 속성(필드)
	private String engine; // 엔진
	private String fuel; // 연료
	private int wheel; // 바퀴 개수
	
	
	
	// 기능(생성자 + 메서드)
	public Car() {}

	public Car(String engine, String fuel, int wheel) {
		super();
		this.engine = engine;
		this.fuel = fuel;
		this.wheel = wheel;
	}

	public String getEngine() {
		return engine;
	}

	public void setEngine(String engine) {
		this.engine = engine;
	}

	public String getFuel() {
		return fuel;
	}

	public void setFuel(String fuel) {
		this.fuel = fuel;
	}

	public int getWheel() {
		return wheel;
	}

	public void setWheel(int wheel) {
		this.wheel = wheel;
	}


	// Object.toString() 오버라이딩
	@Override // 오버라이딩했다는걸 컴파일러에게 알려주는 Override 어노테이션
	public String toString() {
		return engine + " / " + fuel + " / " + wheel;
	}
	
	// 컴파일 에러 : 코드상 직접 발생하는 에러
	// 런타임 에러 : 실행을 했을 때 발생하는 에러
	
	
	
	
}
