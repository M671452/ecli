package ExerciseArrayArrayList;

public class BiArray {
	private int[] array1;
	private int[] array2;

	public BiArray(int[] array1, int[] array2) {
		this.array1 = array1;
		this.array2 = array2;
	}

	public boolean areSumsEqual() {

		int sum1 = calculateSum(array1);
		int sum2 = calculateSum(array2);

		// cheak if the sum are areSumsEqual
		return sum1 == sum2;
	}

	// This private helper method calculates the sum of an array
	private int calculateSum(int[] array) {

		int sum = 0; // Initialize sum to 0

		// For each number in the array, add it to the sum
		for (int num : array) {
			sum += num;
		}

		// return the total sum

		return sum;

	}
}

