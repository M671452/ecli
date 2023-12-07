package Exercise2;

public class Square {

	private int side;

	public Square(int side) {
		this.side = side;

		// TODO: Initialixe side with the passed value.
	}

	public int calculateareal() {
		if (side <= 0) {
			return -1;
		}

		// TODO: Calculate and return the area of the square
		return side * side;
	}

	public int calculatePerimeter() {
		if (side <= 0) {
			return -1;
		}
		// TODO: Calculate and return the perimeter of the square
		return 4 * side;
	}

}
