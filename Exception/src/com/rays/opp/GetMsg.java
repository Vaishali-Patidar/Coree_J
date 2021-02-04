package com.rays.opp;

public class GetMsg {
	public static void main(String[] args) {
		int a=50,b=0,c=0;
		try{
			c=a/b;	

		}catch(ArithmeticException e)
		{
			System.out.println(e.getMessage());
			e.printStackTrace();
		}
		
	}
	

}
