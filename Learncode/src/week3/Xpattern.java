package week3;

public class Xpattern {

	public static void main(String[] args) {

		int n = 5;

		for (int i = 0; i < n; i++) {

			for (int j = 0; j < n; j++) {

				if (i == 0 || i == 4 || i + j == n - 1)
					System.out.print("*");

				else
					System.out.print(" ");

			}
			System.out.print("\n");

		}
	}
}
