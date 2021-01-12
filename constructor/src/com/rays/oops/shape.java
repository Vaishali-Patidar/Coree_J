package com.rays.oops;

public class shape {
private String color;
private int borderwidth;

public shape(){
	System.out.println("default constructor");
	
	
}

public shape(String c,int bw){
	
	color=c;
	borderwidth=bw;
	System.out.println("parameter constructor");
	System.out.println(color);
	System.out.println(borderwidth);
	
	
	
}
}
