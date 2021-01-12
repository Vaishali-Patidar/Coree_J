package com.rays.oops;

public class Employee extends Person{
	String des;
	
	public Employee(String Fname,String Lname,String des){
		super(Fname,Lname);
		this.des=des;
		System.out.println(des);
		
	}
	public static void main(String[] args) {
		Employee ob=new Employee("raj","sharma","HR");
		
		ob.display();
		
	}

}
