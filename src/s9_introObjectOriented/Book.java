package s9_introObjectOriented;

public class Book {
	// noOfCopiesOfEachBook
	// datatype instancevariacle;
	private int quantity;

// nameOfTheMethod(class Name)(parameters){
	Book(int quantity) {// constructor method, and dont need a returntype
		this.quantity = quantity;
	}
	public void setQuantity(int quantity) {
		if (quantity > 0) {
			this.quantity = quantity;
		}
	}

	public int getQuantity() {
		return this.quantity;
	}

	public void increase(int howMuch) {
		setQuantity(this.quantity + howMuch);
		}

	public void decrease(int howMuch) {
		setQuantity(this.quantity - howMuch);
	}
}
