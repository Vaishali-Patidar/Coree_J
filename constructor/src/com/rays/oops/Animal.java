package com.rays.oops;

public class Animal {
	Animal(){
		System.out.println("animal created");
	}
}
class cat extends Animal{
	cat(){
		super();
		System.out.println("Dogs created");
	
	}


public static void main(String[] args) {
	  cat b=new cat();
}
}