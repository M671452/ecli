package s18_ArraysAndArrayList;

public class WeekRunner {
	// STRING ARRAY

	public static void main(String[] args) {

		// 1) Create a string array with days of the week.

		String[] daysOfWeek = { "Monday ", "Tuesday ", "Wednesday ", "Thursday ", "Friday ", "Saturday ", "Sunday " };

		String dayWithMostCharacters = "";

		// 2) Find the day with most number of letters in it
		// - Longeste String

		for (String day : daysOfWeek) {
			if (day.length() > dayWithMostCharacters.length()) {
				dayWithMostCharacters = day;

			}
		}

		System.out.println("Days with most number of characters: " + dayWithMostCharacters);

		// 3) Print days of the week backwards

		for (int i = daysOfWeek.length - 1; i >= 0; i--) {
			System.out.println(daysOfWeek[i]);
		}

	}


}
