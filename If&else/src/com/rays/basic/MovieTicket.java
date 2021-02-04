package com.rays.basic;

public class MovieTicket {
	public static void main(String[] args) {
		int budget=300;
            if(budget>=500)
            	System.out.println("you can buy Platinum ticket");
            else if(budget>=400)
            	System.out.println("you cna buy Gold ticket");
            else if (budget>=300)
            	System.out.println("you can buy silver ticket");
            else if(budget>=200)
            	System.out.println("you can buy Regular ticket");
            else
            	System.out.println("you can not buy any ticket");
	}

}
