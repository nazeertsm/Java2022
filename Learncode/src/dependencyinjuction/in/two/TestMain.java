package dependencyinjuction.in.two;

public class TestMain {

	public static void main(String[] args) {

		// create dependency object

		Address adds1 = new Address("chennai", "Tamilnadu");
		Address adds2 = new Address("Miryalaguda", "Telangana");

		// creating an Array to perform one-Many Association

		Address[] addAll = new Address[2];
		addAll[0] = adds1;
		addAll[1] = adds2;

		// student has 2 address
		// create target object
		Student s1 = new Student("sachin", 40, addAll);

		s1.display();

	}

}
