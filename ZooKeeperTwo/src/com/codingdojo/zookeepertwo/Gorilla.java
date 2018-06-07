package com.codingdojo.zookeepertwo;

public class Gorilla extends Mammal {
	public Gorilla() {};
	
	public void throwSomethin() {
		energyLevel -= 5;
		System.out.println("The gorilla threw something at you, duck!");
	}
	
	public void eatBananas() {
		energyLevel += 10;
		System.out.println("The banana was good!");
	}
	
	public void climb() {
		energyLevel -= 10;
		System.out.print("That was a tough climb!");
	}
	
	@Override
    public String toString(){
        return "Gorilla{" + "EnergyLevel= " + energyLevel + "}";
    }
}








