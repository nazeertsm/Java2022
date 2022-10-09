package oct08;

	class VarArgs {
		
		// this is a method that takes variable number of arguments
		
		static void funMethod(int... nums)
		{
			System.out.println("Number of arguments: "
							+ nums.length);
	 
			// display contents of a by using for each loop 
			for (int i : nums)
				System.out.print(i + " ");
			System.out.println();
		}
	 
		public static void main(String args[])
		{
			// Calling the varargs method with different parameters
			funMethod(100);
			funMethod(1, 2, 3, 4);
			funMethod();
		}
	}
