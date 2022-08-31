package OneToOneConstrInjuction.in.ineuron.entities;

public class TestApp {

	public static void main(String[] args) {

		// create dependency object through constructor
		Account account = new Account("ISB-1111", "Savings", "sachin");

		// create target object and inject the dependent object in the constructor only

		Employee employee = new Employee(10, "sachin", "MI", account);

		// checking the data of employee to see whether injunction happen or not
		employee.display();

	}

}
