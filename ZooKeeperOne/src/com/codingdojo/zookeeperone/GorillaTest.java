package com.codingdojo.zookeeperone;

public class GorillaTest {
	public static void main(String[] args) {
		Gorilla ap = new Gorilla();
		
		System.out.println("First initialization " + ap);
		
		ap.throwSomethin();
		ap.throwSomethin();
		ap.throwSomethin();
		ap.displayEnergy();
		ap.eatBananas();
		ap.eatBananas();
		ap.displayEnergy();
		ap.climb();
		ap.displayEnergy();
	}
}
