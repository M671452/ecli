package s14_LoopsInJava;

// FOR LOOP
public class MyNumberRunner {

	public static void main(String[] args) {

		MyNumber number = new MyNumber(5);

		boolean isPrime = number.isPrime(); // Is a number prime?
		// Hint : 5=> true, 7 => true, 11 => true, 6 => false
		System.out.println("IsPrime " + isPrime);

		int sum = number.sumUptoN(); // sum of numbers upto n?
		// 1 + 2 + 3 + 4 + 5 + 6
		System.out.println("sumUptoN " + sum);

		int sumOfDivisors = number.sumOfDivisors();
		System.out.println("sumOfDivisors " + sumOfDivisors);

		number.printNumberTriangle();

		// 1
		// 1+2
		// 1+2+3
		// 1+2+3+4
		// 1+2+3+4+5

	}
}

