package dependencyinjuction.in.three;

public class Student {
	

	String name;
	Integer age;
	String sid;
	
	
	//HAS A relation
	Address address;
	
	public Student(String name, Integer age, String sid, Address address) {

		this.name = name;
		this.age = age;
		this.sid = sid;
		this.address = address;
	}


public void display() {
	
	System.out.println(	address.getCity());
	System.out.println(address.getState());
	
	
	
}
	
}
