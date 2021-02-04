package com.rays.basics;

public class Odd {
	public static void main(String[] args) {
		int n = 30,sum=0;
		System.out.println("Odd number from 1 to 30 are ");
		for (int i = 0; i <= n; i++) {
			if (i % 2 == 1){
				sum = sum + i;
			}	
			}
				System.out.println(sum);
		
	}
}
