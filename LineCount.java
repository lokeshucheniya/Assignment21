package in.co.capgemini;

import java.io.*;

import java.util.*;

public class LineCount {
	public static void main(String args[]) throws IOException {
		
		Scanner src = new Scanner(new File("P:\\Users\\lucheniy\\Desktop\\Sample.txt"));
		
		int c = 0;
		while(src.hasNextLine()) {
			c++;
			src.nextLine();
		}
		System.out.println(c);
	}
}
