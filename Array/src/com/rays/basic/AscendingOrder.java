package com.rays.basic;

import java.util.Arrays;

public class AscendingOrder {
	public static void main(String[] args) {
		int[] from = { 3, 4, 6, 8, 1, 9, 2, 5, 7 };
		int[] to = new int[9];

		System.out.println("orignal order:");
		for (int k = 0; k < from.length; k++) {

			System.out.print(from[k] + " ");
		}
		System.out.println(" ");

		for (int i = 0; i < from.length; i++) {
			for (int j = i + 1; j < from.length; j++) {
				if (from[i] > from[j]) {
					int temp = from[i];
					from[i] = from[j];
					from[j] = temp;
				}
			}

		}

		System.arraycopy(from, 0, to, 0, 9);
		System.out.println("Ascending order: " + Arrays.toString(to));

	}

}
