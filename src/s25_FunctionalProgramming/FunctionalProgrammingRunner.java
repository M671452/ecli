package s25_FunctionalProgramming;

import java.util.List;

public class FunctionalProgrammingRunner {

	public static void main(String[] args) {
		List<String> list = List.of("Apple", "Bat", "Cat", "Dog");
		printBasicWithFiltering2(list);

	}

	private static void printBasic(List<String> list) {
		// For loop of list
		for (String string : list) {
			System.out.println(string);
			// OUTPUT :
			// Apple
			// Bat
			// Cat
			// Dog
		}

	}

	private static void printBasicWithFiltering(List<String> list) {
		// For loop of list
		for (String string : list) {
			if (string.endsWith("at")) {
				System.out.println(string);
				// OUTPUT :
				// Bat
				// Cat
			}
		}

	}

	private static void printWithFP(List<String> list) {
		list.stream().forEach(element -> System.out.println(element));
		// OUTPUT :
		// Apple
		// Bat
		// Cat
		// Dog

	}

	private static void printBasicWithFiltering2(List<String> list) {
		list.stream().filter(element -> element.endsWith("at")).forEach(element -> System.out.println(element));
		// OUTPUT :
		// Bat
		// Cat

	}

}
