package ExerciseArrayArrayList;

public class ArrayMagic {
	/**
	 * This method determines whether there's an element greater than a given number
	 * in an array.
	 *
	 * @param array  The array to search through.
	 * @param number The number to compare with the array elements.
	 * @return True if there's an element greater than the given number in the
	 *         array, false otherwise.
	 */
	public boolean doesHaveElementGreaterThan(int[] array, int number) {

		// Check in the array is empty
		if (array.length == 0) {
			return false;
			// If the array has no elements, there's nothing to compare to the given number.
			// Thus, we return false.
		}

		// Iterate over the array
		for (int element : array) {
			// We use a for-each loop to iterate over each element in the array.
			// The variable element holds the current array element in each iteration.

			// Cheak if the current element is greater than the gives number
			if (element > number) {
				return true;
				// In each iteration, we check if the current array element (element)
				// is greater than the given number (number). If it is,
				// we've found an element that satisfies the condition.
				// We return true immediately, exiting the loop and the method.
			}
		}
		return false;

	}
}

