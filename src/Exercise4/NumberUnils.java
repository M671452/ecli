package Exercise4;

public class NumberUnils {

	public int getLastDigits(int number) {

		if (number < 0) {
			return -1;
		}

		return number % 10;

		// find the last digit, use % 10.

	}

	public int getNumberOfDigits(int number) {
		if (number < 0) {
			return -1;
		}
		if (number == 0) {
			return 1;
		}
		// 12345= 5
		int numberOfDigits = 0;
		while (number > 0) {
			number = number / 10;
			numberOfDigits++;
		}
		return numberOfDigits;
	}

}
