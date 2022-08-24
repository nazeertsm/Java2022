package week4;

import java.util.Scanner;

/*array is treated as object*/
public class DemoArrays2 {

	public static void main(String[] args) {

		// create an array by using the new operator with the following syntax
		int a[] = new int[5]; // allocating memory for 5 integers.

		System.out.println("Array length is " + a.length);

		Scanner sc = new Scanner(System.in); // // Create a Scanner object
		for (int i = 0; i < a.length; i++) {

			System.out.println("Plese enter the marks of Student " + i);

			a[i] = sc.nextInt();

		}
		System.out.println("The marks of student are as follows");

		for (int i = 0; i < a.length; i++) {

			System.out.print(a[i] + " ");

		}

		System.out.println("\n");

	}

}
