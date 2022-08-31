package dependencyinjuction.in.one;

public class Address {

	private Integer doorNo;


	private Integer pincode;
	private String State;
	private String City;
	private String Country;

	public Address(Integer doorNo, Integer pincode, String state, String city, String country) {
		super();
		this.doorNo = doorNo;
		this.pincode = pincode;
		State = state;
		City = city;
		Country = country;
	}
	
	//Sending the data to the users
	public Integer getDoorNo() {
		return doorNo;
	}

	public Integer getPincode() {
		return pincode;
	}

	public String getState() {
		return State;
	}

	public String getCity() {
		return City;
	}

	public String getCountry() {
		return Country;
	}
	
	


}
