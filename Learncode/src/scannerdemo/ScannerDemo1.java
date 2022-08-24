package scannerdemo;

import java.util.Scanner;

public class ScannerDemo1 {

	// Java program to read data of various types using Scanner class.

	public static void main(String[] args) {
		// Declare the object and initialize with predefined standard input object
		Scanner sc = new Scanner(System.in);

		// String input
		System.out.println("Enter name");
		String name = sc.nextLine();
		
		// Character input
		System.out.println("Enter gender:");
		char gender = sc.next().charAt(0);

		// Numerical data input
		// byte, short and float can be read
		// using similar-named functions.
		System.out.println("Enter age:");
		int age = sc.nextInt();
		System.out.println("Enter Mobile:");
		long mobileNo = sc.nextLong();

		// Print the values to check if the input was correctly obtained.
		System.out.println("Name: " + name);
		System.out.println("Gender: " + gender);
		System.out.println("Age: " + age);
		System.out.println("Mobile Number: " + mobileNo);

	}
}
