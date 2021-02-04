package com.rays.opp;
import java.io.IOException;

public class TryCatch {
public static void main(String[] args) {

	int a=50,b=0,c=0;
	try{
		c=a/b;	
		System.out.println("bye");
	}//finally
	
	catch(ArithmeticException e)
	{
		System.out.println("exception");
		
	}
	System.out.println("hello");
	
}
}
