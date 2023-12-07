package s20_ObjectOrientedLevel2;

public class Customer {

	// State
	private String name;
	private Address homeAddress;
	private Address workAddress;

	// Creation
	public Customer(String name, Address homeAddress) {
		this.name = name;
		this.setHomeAddress(homeAddress);

	}

	// Operations
	public Address getHomeAddress() {
		return homeAddress;
	}

	public void setHomeAddress(Address homeAddress) {
		this.homeAddress = homeAddress;
	}

	public Address getWorkAddress() {
		return workAddress;
	}

	public void setWorkAddress(Address workAddress) {
		this.workAddress = workAddress;
	}


	@Override
	public String toString() {
		return String.format("Name - [%s] Home Address - [%s] Work Address - [%s]", name, homeAddress, workAddress);
	}

}
