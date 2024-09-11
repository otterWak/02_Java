package edu.kh.poly.ex1.model.dto;

public class Spark extends Car{ // 경차

	private double discountOffer; // 할인혜택
	
	// 기본 생성자
	public Spark() {
		// TODO Auto-generated constructor stub
	}

	
	// 매개변수 생성자
	public Spark(String engine, String fuel, int wheel, double discountOffer) {
		super(engine, fuel, wheel);
		this.discountOffer = discountOffer;
	}

	
	// getter / setter
	public double getDiscountOffer() {
		return discountOffer;
	}

	public void setDiscountOffer(double discountOffer) {
		this.discountOffer = discountOffer;
	}
	

	// toString Override
	@Override
	public String toString() {
		return super.toString() + " / " + discountOffer;
	}
}
