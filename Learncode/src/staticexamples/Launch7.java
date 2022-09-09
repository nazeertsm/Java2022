package staticexamples;

//Java program to demonstrate the above example

 class Bird {
	private String name;
	private int number;

	Bird(String name)
	{
		this.name = name;
		number++;
	}

	public void fly()
	{
		System.out.println(
			"This bird flies");
	}

	public int getNumber()
	{
		return number;
	}

	public String getName()
	{
		return name;
	}
}

 public class Launch7 {
	public static void main(String args[])
	{
		Bird b1 = new Bird("Parrot");
		Bird b2 = new Bird("Sparrow");
		Bird b3 = new Bird("Pigeon");

		System.out.println(b1.getNumber());
	}
}
