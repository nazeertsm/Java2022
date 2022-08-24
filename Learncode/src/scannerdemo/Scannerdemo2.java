package scannerdemo;

import java.util.Scanner;

public class Scannerdemo2 {

	public static void main(String[] args) {

		Scanner sc1 = new Scanner(System.in);

		System.out.println("Enter name:");
	     // Using nextLine() to parse string values
		String name = sc1.nextLine();

		// Read an int value
		System.out.println("Enter age:");
		int age = sc1.nextInt();

		System.out.println("name:" + name);
		System.out.println("age:" + age);

	}

}
