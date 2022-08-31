package dependencyinjuction.in.one;

public class Student {
	
	String name;
	Integer age;
	String SId;


	// HAS-A variable injection
	Address address;

	public Student(String name, Integer age, String sId, Address address) {
		this.name = name;
		this.age = age;
		this.SId = sId;
		this.address = address;
	}
	

	public void displaysurdentdetails() {

		address.getCity();
		address.getCountry();
		address.getDoorNo();
		address.getPincode();
		
		System.out.println("Student:: display method called");
		System.out.println("*************EMPLOYEE DETAILS ARE****************");
		System.out.println("name    is  :: " + name);
		System.out.println("age  is  :: " + age);
		System.out.println("SId  is  :: " + SId);
		

		System.out.println("City:  " +address.getCity());
		System.out.println("Country:  " +address.getCountry() );
		System.out.println("DoorNo:  " +	address.getDoorNo() );
		System.out.println("Pincode:  " + address.getPincode());
		

	}

}
