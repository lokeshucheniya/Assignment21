package in.co.capgemini;

import java.io.File;
import java.io.IOException;
import java.util.Scanner;

//Class Word Count for Counting Words in file 
public class WordCount {
	public static void main(String args[]) throws IOException {
		
		//Passing URL of file
		Scanner src = new Scanner(new File("\\.......\\Sample.txt"));
		
		int c = 0;
		
		//For counting number of words
		while(src.hasNext()) {
			
			c++;
			src.next();
		}
		System.out.println(c);
	}
}
