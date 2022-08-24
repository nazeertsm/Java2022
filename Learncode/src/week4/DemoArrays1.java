package week4;

/*array is treated as object*/
public class DemoArrays1 {

	public static void main(String[] args) {

		// create an array by using the new operator with the following syntax
		int a[] = new int[5]; // allocating memory for 5 integers.

		// initialize the elements of the array
		a[0] = 10;
		a[1] = 20;
		a[2] = 30;
		a[3] = 40;
		a[4] = 60;

		//length is property, it gives length, length is not method(method has())
		
		for (int i = 0; i < a.length; i++) {

			System.out.println(a[i]);

		}

	}

}
