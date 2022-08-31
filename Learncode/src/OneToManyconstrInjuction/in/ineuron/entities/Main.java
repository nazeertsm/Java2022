package OneToManyconstrInjuction.in.ineuron.entities;

public class Main {

	public static void main(String[] args) {

		// creating dependent object using constructor injection
		Employee emp1 = new Employee(10, "sachin");
		Employee emp2 = new Employee(18, "kohli");
		Employee emp3 = new Employee(45, "rohith");

		// creating an Array to perform one-Many Association

		Employee[] employees = new Employee[3];
		employees[0] = emp1;
		employees[1] = emp2;
		employees[2] = emp3;

		// creating and Target object using constructor Injection

		Department department = new Department(123, "BCCI", "dUBAI", employees);
		department.display();

	}

}
