package com.rays.basic;



public class Pattern {
	
	public static void printPattern(String[] args){
		System.out.println("Enter the number of rows");
		int number =Integer.parseInt(args[0]);
		System.out.println("you have entered number of rows: "+number);
		
		for(int row=0; row<=number-1;row++){
			for(int col=0;col<=row;col++){
				System.out.print("* ");
			}
		
			System.out.println();
		}
	}
public static void main(String[] args) {
	

     printPattern(args);
	
	
}

}