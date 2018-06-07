package com.codingdojo.objectmastertwo;

public class Ninja extends Human {
	public Ninja() {
		this.stealth = 10;
	};
	
	public void steal(Human person) {
		person.health = person.health - this.health;
		this.health = this.health + this.stealth;
		System.out.println("Very quick to take!");
	}
	
	public void runAway() {
		this.health = this.health -10;
		System.out.println("Now this is speed!");
	}

	@Override
	public String toString(){
	    return "Ninja{" + "Strength= " + strength + " Intelligence= " + intelligence + " Stealth= " + stealth + " Health=" + health +"}";
	}
}
