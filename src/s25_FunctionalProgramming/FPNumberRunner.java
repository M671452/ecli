package s25_FunctionalProgramming;

import java.util.List;

public class FPNumberRunner {

	public static void main(String[] args) {
		List<Integer> numberList = List.of(4, 6, 8, 13, 3, 15);
		// numberList.stream().forEach(element -> System.out.println(element));
		// int sum1 = numberList.stream().reduce(0, (number1, number2) -> number1 +
		// number2);
		// System.out.println(sum1);
		// OUTPUT : 49

		// printNumbers(numberList);
		// printOddNumbers(numberList);
		// printEvenNumbers(numberList);
		// printSumOfNumbera(numberList);
		fpSum(numberList);
			
		}

	private static void printNumbers(List<Integer> numberList) {
		for (Integer integer : numberList) {
			System.out.println(integer);
			// OUTPUT:
			// 4
			// 6
			// 8
			// 13
			// 3
			// 15
		}

	}

	private static void printOddNumbers(List<Integer> numberList) {

		for (Integer integer : numberList) {
			if (integer % 2 == 1) {
				System.out.println(integer);
				// OUTPUT :
				// 13
				// 3
				// 15
			}
		}
	}

	private static void printEvenNumbers(List<Integer> numberList) {
		for (Integer integer : numberList) {
			if (integer % 2 == 0) {
				System.out.println(integer);
				// OUTPUT :
				// 4
				// 6
				// 8
			}
		}

	}

	private static int fpSum(List<Integer> numberList) {
		return numberList.stream().reduce(0, (number1, number2) -> number1 + number2);

		// OUTPUT :
		// 0 4
		// 4 6
		// 10 8
		// 18 13
		// 31 3
		// 34 15
		// WRONG 49
	}

	private static int printSumOfNumber(List<Integer> numberList) {
		int sum = 0;
		for (int numberList1 : numberList) {
			sum += numberList1;
		}
		return sum;
		// OUTPUT : 49
	}

	private static void printSumOfOddNumber(List<Integer> numberList) {
		int sum1 = 0;
		for (int numberList2 : numberList) {
			if (numberList2 % 2 == 1) {
				System.out.println(sum1 += numberList2);
			}
			// OUTPUT :
			// 13
			// 16
			// 31
		}


		}
	}



