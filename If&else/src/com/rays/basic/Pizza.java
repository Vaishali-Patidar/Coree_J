package com.rays.basic;

public class Pizza {
	public static void main(String[] args) {
		int badget=20;
		if(badget>=400)
			System.out.println("you can buy large pizza");
		else if(badget>=300)
			System.out.println("you can buy medium pizza");
		else if (badget>=200)
			System.out.println("you can buy small pizza");
		else if(badget>=99)
			System.out.println("you can buy regular pizza");
		else
			System.out.println("you can buy burger that is 30rs");
	}

}
