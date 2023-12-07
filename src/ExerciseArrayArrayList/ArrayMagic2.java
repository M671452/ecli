package ExerciseArrayArrayList;

public class ArrayMagic2 {
	/**
	 * This method finds and returns the second largest element in the given array.
	 * 
	 * @param array the array in which to find the second largest element
	 * @return the second largest element in the array Our task is to complete the
	 *         function findSecondLargestElement(int[] array) in the class
	 *         ArrayMagic that will find and return the second largest element in
	 *         the provided array. Ifthere is no second largest element, it should
	 *         return -1.
	 */

	public int findSecondLargestElement(int[] array) {
		// Checking for less than two elements:
		/*
		 * The first thing to do in our function is to check if the provided array has
		 * less than two elements. In this case, there isn't a "second largest" element,
		 * so we immediately return -1.
		 */
		if (array.length < 2) {
			return -1;
		}
		// Initializing variables:
		/*
		 * Next, we initialize two variables, largest and secondLargest, both to
		 * Integer.MIN_VALUE. This is the smallest possible integer in Java, ensuring
		 * that any element in the array will be larger than these initial values.
		 */
		int largest = Integer.MIN_VALUE;
		int secondLargest = Integer.MIN_VALUE;

		// Iterating over the array:
		/*
		 * Now we iterate over the array, comparing each element against our largest and
		 * secondLargest variables.
		 */
		for (int element : array) {
			// Checking If Current Element is Greater than largest:
			/*
			 * Within our loop, the first comparison is to see if the current element is
			 * larger than the current largest. If it is, we have a new largest number, so
			 * we need to update largest and secondLargest. We assign the current largest to
			 * secondLargest, and then element to largest.
			 */
			if (element > largest) {
				secondLargest = largest;
				largest = element;

				// Checking If Current Element is Greater than secondLargest:
				/*
				 * The next comparison within our loop is to see if element is greater than
				 * secondLargest but not equal to largest (since we don't want secondLargest to
				 * be the same as largest). If this condition is met, we assign element to
				 * secondLarges.
				 */
			} else if (element > secondLargest && element != largest) {
				secondLargest = element;
			}
		}

		// Returning the Result:
		/*
		 * Once we've finished our loop, secondLargest should now hold the second
		 * largest element in the array. However, in some cases where there is no second
		 * largest number (for example, when all elements in the array are the same),
		 * secondLargest would still be Integer.MIN_VALUE. In these cases, we return -1.
		 */

		if (secondLargest == Integer.MIN_VALUE) {
			return -1;
		}
		return secondLargest;

	}

}
