package com.codingdojo.zookeeperone;

public class Gorilla extends Mammal {
	public Gorilla() {};
	
	public void throwSomethin() {
		energyLevel = energyLevel - 5;
		System.out.println("The gorilla threw something at you, duck!");
	}
	
	public void eatBananas() {
		energyLevel = energyLevel + 10;
		System.out.println("That was bomb!");
	}
	
	public void climb() {
		energyLevel = energyLevel - 10;
		System.out.println("I am losing energy!");
	}
	
	@Override
    public String toString(){
        return "Gorilla{" + "EnergyLevel= " + energyLevel + "}";
    }
}