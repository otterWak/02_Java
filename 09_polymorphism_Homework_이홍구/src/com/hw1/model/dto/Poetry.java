package com.hw1.model.dto;

public class Poetry extends Book{

	private int numberIfPoems; // 시 수
	
	
	public Poetry() {}


	public Poetry(String title, String author, int numberIfPoems) {
		super(title, author);
		this.numberIfPoems = numberIfPoems;
	}

	@Override
	public void displayInfo() {
		System.out.printf("[시집] 제목 : %s / 저자 : %s / 시 수 : %s\n", getTitle(), getAuthor(), numberIfPoems);
	}


	public int getNumberIfPoems() {
		return numberIfPoems;
	}


	public void setNumberIfPoems(int numberIfPoems) {
		this.numberIfPoems = numberIfPoems;
	}
	
	
	
}
