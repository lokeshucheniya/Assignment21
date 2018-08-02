package in.co.capgemini;

import java.io.File;
import java.io.IOException;
import java.util.Scanner;

public class WordCount {
	public static void main(String args[]) throws IOException {
		Scanner src = new Scanner(new File("P:\\Users\\lucheniy\\Desktop\\Sample.txt"));
		
		int c = 0;
		while(src.hasNext()) {
			
			c++;
			src.next();
		}
		System.out.println(c);
	}
}
