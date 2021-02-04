package com.rays.basics;

public class Average {
	public static void main(String[] args) {
		int n = 40, sum = 0, count = 0, average;
		System.out.println("Average of Even & Odd numbers from 1 to 40 is ");
		for (int i = 1; i <= n; i++) {
			if (i % 2 == 0 || i % 2 != 0) {
				sum = sum + i;
				count++;
			}
		}
		average = sum / count;

		System.out.println(average);

	}
}
