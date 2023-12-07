package s20_ObjectOrientedLevel2;

public class Rectangle {
	
	// State
	private int length;
	private int width;

	// Creation
	public Rectangle(int length, int width) {
		this.setLength(length);
		this.setWidth(width);

	}

	// Operations
	public int getLength() {
		return length;
	}

	public void setLength(int length) {
		this.length = length;
	}

	public int getWidth() {
		return width;
	}

	public void setWidth(int width) {
		this.width = width;
	}

	public int area() {
		return length * width;
	}

	public int perimeter() {
		return 2 * length + width;

	}

	@Override
	public String toString() {
		return String.format("Length = %d Width = %d Area = %d Perimeter = %d", length, width, area(), perimeter());
		// return "Length = " + length + "Width = " + width +
		// "Area = " + area() + "Perimeter = " + perimeter();
	}

}
