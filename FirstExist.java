package in.co.capgemini;

import java.util.Scanner;
import java.io.File;

public class FirstExist{
	public static void main(String[] args) {
		Scanner src = new Scanner(System.in);
		System.out.println("Enter file path");
		String input = src.nextLine();
		File file = new File(input);
		if(file.exists()) {
			System.out.println("File exists");
		}
	}
}
