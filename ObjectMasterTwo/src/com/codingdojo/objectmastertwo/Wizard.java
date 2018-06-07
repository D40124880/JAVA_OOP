package com.codingdojo.objectmastertwo;

public class Wizard extends Human {
	public Wizard() {
		this.health = 50;
		this.intelligence = 8;
	};
	
	public void heal(Human person) {
		person.health = person.health + this.intelligence;
		System.out.println("Here is some awesomeness!");
	}
	
	public void fireball(Human person) {
		person.health = person.health - (this.intelligence * 3);
		System.out.println("How you like me now?!");
	}
	
	@Override
	public String toString(){
	    return "Wizard{" + "Strength= " + strength + " Intelligence= " + intelligence + " Stealth= " + stealth + " Health=" + health +"}";
	}
}
