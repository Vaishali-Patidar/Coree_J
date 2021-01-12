package com.rays.collection;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Iterator;

public class TestCompareTo {
public static void main(String[] args) {
	Marksheet m1=new Marksheet();
	m1.setFname("A");
	Marksheet m2=new Marksheet();
	m2.setFname("Z");
	Marksheet m3=new Marksheet();
	m3.setFname("c");
	Marksheet m4=new Marksheet();
	m4.setFname("B");
	
	ArrayList list=new ArrayList<>();
	list.add(m1);
	list.add(m2);
	list.add(m3);
	list.add(m4);
	
	Collections.sort(list);
	Iterator it=list.iterator();
	while(it.hasNext())
	{
		Marksheet m=(Marksheet)it.next();
		System.out.println(m.getFname());
	}
	
	
	
}
}
