package s12_ConditionalsInJavaPG;

public class SwitchPuzzles {

	public static void main(String[] args) {
		puzzle4();
	}

	private static void puzzle1() {
		int number = 2;
		switch (number) {
		case 1:
			System.out.println("1");
			break;
		case 2:
			System.out.println("2");
			break;
		case 3:
			System.out.println("3");
			break;
		default:
			System.out.println("Default");
			break;
		}

	}

	private static void puzzle2() {
		int number = 2;
		switch (number) {
		case 1:
			System.out.println(1);
			break;
		case 2:
		case 3:
			System.out.println("Number is 2 or 3");
			break;
		default:
			System.out.println("Default");
			break;
		}
	}

	private static void puzzle3() {
		int number = 10;
		switch (number) {
		case 1:
			System.out.println(1);
			break;
		case 2:
			System.out.println(2);
			break;
		case 3:
			System.out.println(3);
			break;
		default:
			System.out.println("Default");
			break;
		}
	}

	private static void puzzle4() {
		int number = 10;
		switch (number) {
		default:
			System.out.println("Default");
			break;
		case 1:
			System.out.println(1);
			break;
		case 2:
			System.out.println(2);
			break;
		case 3:
			System.out.println(3);
			break;
		}
	}

	private static void puzzle5() {
		long l = 15;
		/*
		 * switch(l) { }
		 */
	}
	// You cannot use switch on a long, float, boolean or on a double.
	// You can only use switch on integer, byte, char, short and String and enum.

	private static void puzzle6() {
		int number = 10;
		int i = number * 2;
		switch (number) {
		// case number>5: System.out.println("number > 5");
		// You cannot have a condition in a case.
		}
	}
}

