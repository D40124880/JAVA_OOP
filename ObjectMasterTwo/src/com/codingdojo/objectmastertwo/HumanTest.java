package com.codingdojo.objectmastertwo;

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
		
		System.out.println();
		
		System.out.println("After attacking " + man);
		System.out.println("After attacking " + black);
		System.out.println("After attacking " + red);
		
		man.fireball(black);
		System.out.println("Current status of Shadow after fireball " + black + "\n");
		
		man.heal(red);
		System.out.println("Current status of Oozo after heal " + red + "\n");
		
		red.deathBlow(man);
		System.out.println("Current status of Merlin after deathblow " + man + "\n");
		System.out.println("Current status of Oozo after deathblow " + red + "\n");
		
		red.meditate();
		System.out.println("Current status of Oozo after meditate " + red + "\n");
		
		Samurai boozo = new Samurai();
		System.out.println("Current status of Boozo " + boozo + "\n");
		
		black.steal(boozo);
		System.out.println("Current status of Boozo after steal " + boozo + "\n");
		System.out.println("Current status of Shadow after steal " + black + "\n");
		
		black.steal(red);
		System.out.println("Current status of Merlin after steal " + red + "\n");
		System.out.println("Current status of Shadow after steal " + black + "\n");
		
		black.runAway();
		System.out.println("Current status of Merlin after runaway " + black + "\n");
		
		red.howMany();
	}
}
