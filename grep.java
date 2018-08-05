package in.co.capgemini;

import java.io.File;
import java.io.IOException;
import java.util.Scanner;

//Class Grep for finding a specific word  in given file
public class grep {
	public static void main(String args[]) throws IOException {
		File file = new File("P:\\Users\\lucheniy\\Desktop\\Sample.txt");
		Scanner src = new Scanner(file);
		
		//Taking input from user
		Scanner sr = new Scanner(System.in);
		System.out.println("Enter file");
		String str = sr.nextLine();
		
		System.out.println("Enter word to be searched");
		String word = sr.next();
		
		
		int c = 0,nf=0;
		
		//Logic for searching word
		while(src.hasNextLine()) {
			String line = src.nextLine();
			if(line.contains(word)) {
				c++;
				System.out.println("Found"+c);
			}
			else {
				c++;
				nf++;
			}
		}
		
		//If not present 
		if(c == nf) {
			System.out.println("Not found");
		}
		
	}
}
