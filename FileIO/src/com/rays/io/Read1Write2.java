package com.rays.io;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class Read1Write2 {
	public static void main(String[] args) throws IOException {
		FileReader fr=new FileReader("C:\\Users\\Dell\\Desktop\\New folder\\abc.txt");
		FileWriter fw=new FileWriter("C:\\Users\\Dell\\Desktop\\New folder\\xyz.txt");
		FileWriter fw1=new FileWriter("C:\\Users\\Dell\\Desktop\\New folder\\mno.txt");
		int line = fr.read();
		char ch;
		while(line!=-1)
		{
			ch=(char)line;
			System.out.println(ch);
			fw.write(ch);
			fw1.write(ch);
			line= fr.read();
		}
		fr.close();
		fw.close();
		fw1.close();
		System.out.println("done");
			
		}
	}


