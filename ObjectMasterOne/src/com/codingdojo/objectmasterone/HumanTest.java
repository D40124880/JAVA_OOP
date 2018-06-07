package com.codingdojo.objectmasterone;

public class HumanTest {
	public static void main(String[] args) {
		Wizard man = new Wizard();
		Ninja black = new Ninja();
		Samurai red = new Samurai();
		
		System.out.println("Before any attacking: " + man);
		System.out.println("Before any attacking: " + black);
		System.out.println("Before any attacking: " + red);
		
		man.attack(black);
		man.attack(black);
		black.attack(red);
		red.attack(man);
		red.attack(man);
		red.attack(man);
		
		System.out.println("After attacking " + man);
		System.out.println("After attacking " + black);
		System.out.println("After attacking " + red);
	}
}
