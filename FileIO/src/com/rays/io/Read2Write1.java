package com.rays.io;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.Reader;

public class Read2Write1 {
	public static void main(String[] args) throws IOException {
		FileReader fr=new FileReader("C:\\Users\\Dell\\Desktop\\New folder\\abc.txt");
		
		FileWriter fw=new FileWriter("C:\\Users\\Dell\\Desktop\\New folder\\xyz.txt");
		
		int line = fr.read();
		 char ch;
		while(line!=-1)
		{
			ch=(char)line;
			System.out.println(ch);
			fw.write(ch);
			line= fr.read();
		}
		fr=new FileReader("C:\\Users\\Dell\\Desktop\\New folder\\mno.txt");
		
		int line1 = fr.read();
		 char ch1;
		while(line1!=-1)
		{
			ch1=(char)line1;
			System.out.println(ch1);
			fw.write(ch1);
			
			line1= fr.read();
		}
		fw.flush();
		fr.close();
		fw.close();
		
		System.out.println("done");
			
		}
}
