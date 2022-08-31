package dependencyinjuction.in.two;

public class Student {

	String name;
	Integer age;

	// HAS A relation
	Address[] address;

	public Student(String name, Integer age, Address[] address) {

		this.name = name;
		this.age = age;
		this.address = address;

	}

	public void display() {

		for (Address addr : address) {

			System.out.println(addr.getCity());
			System.out.println(addr.getState());
		}

	}

}
