package com.rays.opp;

public class MultiCatch {
	public static void main(String[] args) {
		String name=null;
		try{
			
		System.out.println("name length: " +name.length());
		System.out.println("Name char at: "+name.charAt(3));
		}
		catch(NullPointerException e){
		e.printStackTrace();
		}
		catch(IndexOutOfBoundsException e){
			e.printStackTrace();
		}
	}

}