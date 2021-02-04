package com.rays.io;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class Read2simul {
	public static void main(String[] args) throws IOException {
		FileReader fr=new FileReader("C:\\Users\\Dell\\Desktop\\New folder\\abc.txt");
		FileReader fr1=new FileReader("C:\\Users\\Dell\\Desktop\\New folder\\mno.txt");
		
		FileWriter fw=new FileWriter("C:\\Users\\Dell\\Desktop\\New folder\\xyz.txt");
		
		int line=fr.read();
		int line1=fr1.read();
		char ch,ch1;
		while(line!= -1||line1!=-1)
		{
			if(line!=-1) {
				ch=(char)line;
				System.out.println(ch);
				fw.write(ch);
				line=fr.read();
			}
			if(line1!=-1) {
				ch1=(char)line1;
				System.out.println(ch1);
				fw.write(ch1);
				line1=fr1.read();
		}
		
	}
		fw.flush();
		fr.close();
		fr1.close();
System.out.println("done");
	}
}
