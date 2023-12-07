package s20_ObjectOrientedLevel2;

public class Address {
	private String lane;
	private String city;
	private String zip;

	// Creations
	public Address(String lane, String city, String zip) {
		super();
		this.lane = lane;
		this.city = city;
		this.zip = zip;
	}


	@Override
	public String toString() {
		return lane + " " + city + " " + zip + " ";
	}

}
