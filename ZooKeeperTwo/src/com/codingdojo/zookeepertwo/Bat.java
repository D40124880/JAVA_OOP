package com.codingdojo.zookeepertwo;

public class Bat extends Mammal {
	public Bat() {
		energyLevel = 300;
	}
	
	public void fly() {
		System.out.println("I am flying through!");
		energyLevel -= 50;
	}
	
	public void eatHumans() {
		System.out.println("How awful the humans are, but so good!");
		energyLevel += 25;
	}
	
	public void attackTown() {
		System.out.println("FIRE EVERYWHERE!");
		energyLevel -=300;
	}
	
	@Override
	public String toString(){
	    return "Bat{" + "EnergyLevel= " + energyLevel + "}";
	}
}
