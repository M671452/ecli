package Exercise2;

// RGBColor class representing a color using Red Green Blue (RGB) model.
public class RGBColor {

	// The red, green and blue color values range from 0 to 255.
	private int red;
	private int green;
	private int blue;

	// Construtor for RGBColor class which initializes the color with provided red,
	// green and blue values.
	public RGBColor(int red, int green, int blue) {
		// Your code
		this.red = red;
		this.green = green;
		this.blue = blue;
	}

	// Getter method to get the red value of the color.
	public int getRed() {
		// Your code
		return this.red;
	}

	// Getter method to get the green value of the color.
	public int getGreen() {
		// your code
		return this.green;
	}

	public int getBlue() {
		// Your code
		return this.blue;
	}

	// Method to invert the color. The inversion is done by subtracting each color
	// component from 255.
	public void invert() {
		// Your code
		this.red = 255 - this.red;
		this.green = 255 - this.green;
		this.blue = 255 - this.blue;

	}
}
