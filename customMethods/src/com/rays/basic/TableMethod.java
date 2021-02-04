package com.rays.basic;



public class TableMethod {
	public static void printTable(String[] args){
	
		System.out.println("enter the number");
		int n=Integer.parseInt(args[0]);
		   System.out.println("you have entered number:"+n);
		for(int i=1;i<=10;i++){
			System.out.println(n+"*"+i+"="+n*i);
		
		}
	}
	
 public static void main(String[] args){
	 
	 TableMethod.printTable(args);
	
	
    
	
}
}
