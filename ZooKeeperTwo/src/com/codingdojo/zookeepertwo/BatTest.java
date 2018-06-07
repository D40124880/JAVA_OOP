package com.codingdojo.zookeepertwo;

public class BatTest {

	public static void main(String[] args) {
		Gorilla grapeApe = new Gorilla();
		System.out.println("First initialization " + grapeApe);
		grapeApe.throwSomethin();
		grapeApe.throwSomethin();
		grapeApe.throwSomethin();
		grapeApe.eatBananas();
		grapeApe.eatBananas();
		grapeApe.climb();
		grapeApe.displayEnergy();
		
		Bat bat = new Bat();
		System.out.println("First Bat Initialization " + bat);
		bat.displayEnergy();
		bat.attackTown();
		bat.attackTown();
		bat.attackTown();
		bat.displayEnergy();
		bat.eatHumans();
		bat.eatHumans();
		bat.displayEnergy();
		bat.fly();
		bat.fly();
		bat.displayEnergy();
	}
}
