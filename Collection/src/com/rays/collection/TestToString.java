package com.rays.collection;

public class TestToString {
	public static void main(String[] args) {
		Marksheet m1=new Marksheet();
		m1.setRollno(1);
		m1.setFname("riva");
		m1.setPhysics(78);
		m1.setMaths(98);
		m1.setChemistry(69);
		
		String m=m1.toString();
		System.out.println(m1);
		
		

		
		
	}

}
