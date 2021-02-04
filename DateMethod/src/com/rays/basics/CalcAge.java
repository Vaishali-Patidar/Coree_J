package com.rays.basics;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;



public class CalcAge {
public static void main(String[] args) throws ParseException {
	Date d=new Date();
	long cm=d.getTime();
	System.out.println("Cd:"+d);
	SimpleDateFormat sdf= new SimpleDateFormat("dd-MM-yyyy");
	String Sd=sdf.format(d);
	System.out.println(Sd);
	long year=1*1000*60*60*24*365l;
	long month =1*1000*60*60*24*365l;
	
	String bdate="12-08-1996";
	Date bd=sdf.parse(bdate);
	long bm=bd.getTime();
	long age_in_milli=cm-bm;
	long age_in_year=age_in_milli/year;
	long age_in_month=age_in_milli/month;
	System.out.println(age_in_milli);
	System.out.println(age_in_year);
	System.out.println(age_in_month);
	
	}
}
