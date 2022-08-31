package dependencyinjuction.in.three;

public class Address {
	


	private Integer Houseno;
	private String city;
	private String state;
	
	public Address(Integer houseno, String city, String state) {

		this.Houseno = houseno;
		this.city = city;
		this.state = state;
	}

	public Integer getHouseno() {
		return Houseno;
	}

	public String getCity() {
		return city;
	}

	public String getState() {
		return state;
	}


}
