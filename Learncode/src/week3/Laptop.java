package week3;

public class Laptop {
	String cpu;
	int ram = 8;
	int hdd;

	public void dosomething() {

		System.out.println("do something method");
		System.out.println("new ram value: "+ram);
	}

	public static void main(String[] args) {

		// obj is reference to new Laptop() is object

		Laptop obj = new Laptop();
		// change the ram value before calling method
		obj.ram = 16;
		obj.dosomething();

	}

}
