package dependencyinjuction.in.one;

public class TestMain {

	public static void main(String[] args) {

		// create dependency object through constructor
		
		Address address = new Address(12, 508552, "Tamilnadu", "chennai", "India");
		
		// create target object and inject the dependent object in the constructor only
		Student s1 = new Student("sachin", 40, "SID001", address);
		
		// checking the data of employee to see whether injunction happen or not
		
		s1.displaysurdentdetails();
		
	}

}
