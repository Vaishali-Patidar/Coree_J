package com.rays.basic;

public class FabonacciSeries {
	public static void printFab(String[]args){
		int n1=0,n2=1,n3;
		System.out.println("enter the number");
		int number=Integer.parseInt(args[0]);
		System.out.println("you have entered number: "+number);
		System.out.print(n1+" "+n2);
		for(int i=2;i<number;i++){
			n3=n1+n2;
			System.out.print(" "+n3);
			n1=n2;
			n2=n3;
			
		}
	}
public static void main(String[] args) {
	printFab(args);
	
}
}
