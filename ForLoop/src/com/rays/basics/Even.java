package com.rays.basics;

public class Even {
	public static void main(String[] args) {
		int n = 50,count=0;
		System.out.println("Even numbers from 1 to 50 are ");
		for (int i = 1; i <= n; i++) {
			
			if (i % 2 == 0){
				count++;
			}
				
		}
				System.out.println(count);
			

		}
	}
