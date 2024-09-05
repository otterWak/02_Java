package edu.kh.oop.practice.model.service;

import edu.kh.oop.practice.model.vo.Hero;

public class HeroSe {

	public void practice() {
		System.out.println("===========캐릭터 생성===========");
		
		Hero nb1 = new Hero("이구역짱", "전사", 200, 20, 1, 0.0);
		Hero nb2 = new Hero("Zi존위자드", "마법사", 100, 100, 1, 0.0);
		
		System.out.println(nb1.toString());
		System.out.println(nb2.toString());
		
		nb1.attack(100.0);
		nb1.attack(150.5);
		nb1.attack(200.0);
		nb1.dash();
		nb1.dash();
		nb1.dash();
		
		System.out.println(nb1.toString());
	}
}
