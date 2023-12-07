package s12_ConditionalsInJavaPG;

//Nested if else
//Useful when you have three or multiple set of different conditions

public class IfStatementRunner {

	public static void main(String[] args) {
		int i = 23;
		if (i == 24) {
			System.out.println("i = 24");
		} else if (i == 25) {
			System.out.println("i = 25");
		} else if (i == 23) {
			System.out.println("i = 23");
		} else {
			System.out.println("i != 24 && i != 25 && i != 23");
		}
	}

}
