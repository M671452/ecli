package Exercise1;

public class TriangleValidatorSides {
	public boolean isRightAnged(int side1, int side2, int side3) {

		// check if any side length is non-positive
		if (side1 <= 0 || side2 <= 0 || side3 <= 0) {
			return false;
		}

		// check each combination of sides to see if Pythagorean theorem holds
		if (side1 * side1 == side2 * side2 + side3 * side3) {
			return true;
		}

		if (side2 * side2 == side1 * side1 + side3 * side3) {
			return true;
		}

		if (side3 * side3 == side1 * side1 + side2 * side2) {
			return true;
		}

		// if none of the combinations hold, it's not a right-angled triangle
		return false;
	}
}