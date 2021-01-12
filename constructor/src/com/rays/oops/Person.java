package com.rays.oops;

public class Person {
 private static Person p;
private String Fname=null;
 private String Lname=null;
 private String Address=null;
 
 public Person(String Fname,String Lname){
	 this.Fname=Fname;
	this.Lname=Lname;
	 }

 public Person(String Fname,String Lname,String Address){
	 this(Fname,Lname);
	 this.Address=Address;
 }
 
   public void display(){
	   System.out.println("Fname= "+Fname);
	   System.out.println("Lname= "+Lname);
	   System.out.println("address= "+Address);
	  
   }
public static void main(String[] args) {
	Person.p=new Person("ram","sharma","Indore");
	p.display();
}
}




   