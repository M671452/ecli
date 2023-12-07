package Exercise1;

public class TriangleValidator {
	public boolean isValidTriangle(int angle1, int angle2, int angle3) {
		// check if any angle is non-positive
		if (angle1 <= 0 || angle2 <= 0 || angle3 <= 0) {
			return false;
		}

		// calculate the sum of the angles
		int sumOfAngles = angle1 + angle2 + angle3;

		// if the sum is exactly 180, the angles form a valid triangle
		// boolean isSumOFangels180 = sumOfAngels == 180;
		// return isSumOFangels180;
		return sumOfAngles == 180;
	}
}