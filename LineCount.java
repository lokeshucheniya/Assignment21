package in.co.capgemini;

import java.io.*;
import java.util.*;

//Class LineCount for counting number of lines in file
public class LineCount {
	public static void main(String args[]) throws IOException {
		
		//Passing URL of file
		Scanner src = new Scanner(new File("\\.......\Sample.txt"));
		
		int c = 0;
		
		//For counting number of lines
		while(src.hasNextLine()) {
			c++;
			src.nextLine();
		}
		System.out.println(c);
	}
}
