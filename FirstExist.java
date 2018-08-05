package in.co.capgemini;

import java.util.Scanner;
import java.io.File;

//Class First exit to check whether the given path exits or not
public class FirstExist{
	
	public static void main(String[] args) {
		Scanner src = new Scanner(System.in);
		System.out.println("Enter file path");
		String input = src.nextLine();
		File file = new File(input);
		//It checks whether file exits or not
		if(file.exists()) {
			System.out.println("File exists");
		}
	}
}
