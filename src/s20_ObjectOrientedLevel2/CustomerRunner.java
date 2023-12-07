package s20_ObjectOrientedLevel2;

public class CustomerRunner {

	public static void main(String[] args) {
		
		Address homeAddress = new Address("Vardesvingen", "Bergen", "5141");
		Customer customer = new Customer("Mannat Gabria", homeAddress);
		
		Address workAddress = new Address("Loddegfjord", "Bergen", "0789");
		customer.setWorkAddress(workAddress);
		
		System.out.println(customer);

	}

}
