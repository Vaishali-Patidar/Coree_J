package com.rays.basic;

import java.util.Arrays;

public class CopyIntegerArray {
public static void main(String[] args) {
	int [] from={3,5,7,9,2,6,1,8,4};
	int[] to= new int[5];
	System.arraycopy(from, 4, to, 0, 5);
     System.out.println(Arrays.toString(to));
 }
}
