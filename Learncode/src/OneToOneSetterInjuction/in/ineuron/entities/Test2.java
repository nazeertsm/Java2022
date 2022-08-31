package OneToOneSetterInjuction.in.ineuron.entities;

public class Test2 {

	public static void main(String[] args) {
		
		// creating dependent object
		Account account = new Account();
		
		//performing setter injunction to inject the values
		account.setAccName("sachin");
		account.setAccNo("ISB-222");
		account.setAccType("current");
		
		
		//create target object and inject the dependent object in the constructor
		
		Employee employee = new Employee();
		employee.setEid(10);
		employee.setEname("sachin");
		employee.setEaddress("IND");
		
		//performing setter injection to account
		
		employee.setAccount(account);
		
		//checking the data of employee to see whether injection happened or not
		
		employee.display();
		
		
		

	}

}
