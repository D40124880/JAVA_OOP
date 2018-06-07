package com.codingdojo.objectmasterone;

public class Human {
	protected int health;
	protected int strength;
	protected int stealth;
	protected int intelligence;
	
	public Human() {
		this.health = 100;
		this.strength = 3;
		this.stealth = 3;
		this.intelligence = 3;
	}
	
	public void attack(Human person) {
		this.health = this.health - person.strength;
	}
	
	@Override
    public String toString(){
        return "Human{" + "Strength= " + strength + " Intelligence= " + intelligence + " Stealth= " + stealth + " Health=" + health +"}";
    }
}
