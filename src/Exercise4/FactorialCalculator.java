package Exercise4;

public class FactorialCalculator {

	public int calculateFactorial(int number) {
		if (number < 0) {
			return -1;
		}

		int factorial = 1;
		// 2 to number
		for (int i = 2; i <= number; i++) {
			factorial = factorial * i;
		}

		return factorial;
	}
	/*
	 * n! = n*(n-1) * (n-2)*... 3* 2* 1 for eks: 4! = 4 * 3 * 2 * 1 = 24 3! = 3 * 2
	 * * 1 = 6 2! = 2 * 1 = 2 1! = 1 0! is defined to be 1 if input is negative,
	 * return -1
	 */

}
