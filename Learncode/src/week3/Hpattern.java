package week3;

public class Hpattern {

	public static void main(String[] args) {

		int n = 7;

		for (int i = 0; i < n; i++) {

			for (int j = 0; j < n; j++) {

				if (j==0|| j==n-1 ||i==(n-1)/2)

					System.out.print("*");

				else
					System.out.print(" ");

			}
			System.out.print("\n");

		}

	}

}
