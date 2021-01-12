package com.rays.basic;

import java.util.Arrays;

public class Descending {
public static void main(String[] args) {
	int[] from = { 3, 4, 6, 8, 1, 9, 2, 5, 7 };
	int[] to = new int[5];

	System.out.println("orignal order:");
	for (int k = 0; k < from.length; k++) {

		System.out.print(from[k] + " ");
	}
	System.out.println(" ");
	
	System.arraycopy(from, 1, to, 0, 5);
	
	
	for (int i = 0; i <to.length; i++) {
		for (int j =to.length-1; j > i; j--) {
			if (to[i]  < to[j]) {
				int temp = to[i];
				to[i] = to[j];
				to[j] = temp;
			}
		}

	}

	System.out.println("Ascending order: " + Arrays.toString(to));

}



}

