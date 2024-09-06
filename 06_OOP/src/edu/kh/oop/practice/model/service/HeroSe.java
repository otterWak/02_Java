package edu.kh.oop.practice.model.service;

import edu.kh.oop.practice.model.vo.Hero;

public class HeroSe {

	public void practice() {
		Hero nb1 = new Hero("이구역짱", "전사", 200, 20, 1, 0);
		Hero nb2 = new Hero("Zi존위자드", "마법사", 100, 100, 1, 0);
		
		System.out.printf("=========%s 시점=========\n", nb1.getNickname());
		nb1.attack(100);
		nb1.attack(50.5);
		nb1.attack(49.5);
		nb1.dash();
		nb1.dash();
		nb1.dash();
		
		System.out.printf(nb1.toString(),
				nb1.getNickname(),
				nb1.getLevel(),
				nb1.getHp(),
				nb1.getMp(),
				nb1.getExp()
				);
		
		System.out.printf("=========%s 시점=========\n", nb2.getNickname());
		nb2.attack(300.0);
		nb2.dash();
		nb2.attack(300.0);
		nb2.attack(300.0);
		
		System.out.printf("=========%s 시점=========\n", nb2.getNickname());
		nb2.attack(100);
		nb2.attack(50.5);
		nb2.attack(49.5);
		nb2.dash();
		nb2.dash();
		nb2.dash();
		
	}
}
