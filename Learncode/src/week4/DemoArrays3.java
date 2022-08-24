package week4;

import java.util.Iterator;
import java.util.Scanner;

/*array is treated as object*/
public class DemoArrays3 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in); // // Create a Scanner object

		int[][] arr = new int[3][4];

		for (int i = 0; i < arr.length; i++) {

			for (int j = 0; j < arr[i].length; j++) {

				System.out.println("Enter marks of class " + i + "Student " + j);

				arr[i][j] = sc.nextInt();
			}

		}
		System.out.println("Marks of students are");

		for (int i = 0; i < arr.length; i++) {

			for (int j = 0; j < arr[i].length; j++) {

				System.out.println(arr[i][j] + " ");

			}

			System.out.println();

		}

	}

}
