package s14_LoopsInJava;

// FOR LOOP
public class MyNumber {

	private int number;

	public MyNumber(int number) {
		this.number = number;
	}

	public boolean isPrime() {
		// 2 to number - 1
		// How can I check if a number is divisible by 2?

		if (number < 2) {
			// Guard condition: all number smaller
			// than 2 are not considered as prime numbers.
			return false;
		}

		for (int i = 2; i <= number - 1; i++) {
			if (number % i == 0) {
				return false;
			}
		}
		return true;
	}

	public int sumUptoN() {
		// 1+2+3+4+5+...+number
		int sum = 0;
		for (int i = 1; i <= number; i++) {
			sum = sum + i;
		}
		return sum;
	}

	public int sumOfDivisors() {
		// 6 except 1 and 6, 6=> 2,3
		int sum = 0;
		for (int i = 2; i < number; i++) {
			if (number % i == 0) {
				sum = sum + i;
			}
		}
		return sum;
	}

	public void printNumberTriangle() {
		// 1
		// 1+2
		// 1+2+3
		// 1+2+3+4
		// 1+2+3+4+5
		for (int i = 1; i <= number; i++) {
			for (int j = 1; j <= i; j++) {
				// Loop j in a Loop i loop j is only running up to i.

				System.out.print(j + " ");
			}
			System.out.println();

		}
	}

}
