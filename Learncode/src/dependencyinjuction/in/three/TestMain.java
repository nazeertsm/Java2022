package dependencyinjuction.in.three;

public class TestMain {

	public static void main(String[] args) {
		
		//create dependency object
		Address add = new Address(101, "chennai", "Tamilnadu");
		
		//create target object
		Student std1 = new Student("sachin",40, "555", add);
		
		std1.display();
								
	}

}
