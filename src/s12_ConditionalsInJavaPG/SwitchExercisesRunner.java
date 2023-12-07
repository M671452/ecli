package s12_ConditionalsInJavaPG;

public class SwitchExercisesRunner {

	public static void main(String[] args) {
		System.out.println(isWeekDay(5));
		System.out.println(determineNameOfMonth(2));
		System.out.println(determineNameOfDay(2));

	}
	public static boolean isWeekDay(int dayNumber) {
		/* First exercise
		 * public static boolean isWeekDay(int dayNumber) {
		 * Input-  number of day 0(sunday) to 6(satuerday)
		 * Return if the day is a week day
		 */


		switch(dayNumber) {
		case 0:
		case 6:
			return false;
		case 1:
		case 2:
		case 3:
		case 4:
		case 5:
			return true;

		}
		return false;
		
	}

	public static String determineNameOfMonth(int monthNumber) {
		/*
		 * Secound exercise public static String determineNameOfTheMonth(int
		 * monthNumber) { Input- number of the month 1 (january) to 6 (december) Output-
		 * name of the month
		 */

		switch (monthNumber) {
		case 1:
			return "January";

		case 2:
			return "Febuary";

		case 3:
			return "March";

		case 4:
			return "April";

		case 5:
			return "May";
		
		case 6:
			return "June";

		case 7:
			return "July";

		case 8:
			return "August";

		case 9:
			return "September";

		case 10:
			return "Oktober";

		case 11:
			return "November";

		case 12:
			return "December";

		}
		return "Invalid Day";
	}

	public static String determineNameOfDay(int dayNumber) {
		/*
		 * public static String determineNameOfTheDay(int dayNumber) { Intput- number of
		 * the day 0 (sunday) to 6 (satuerday) Return the day of the week in text
		 * 
		 */
		switch(dayNumber) {
		case 0:
			return "Sunday";
		case 1:
			return "Monday";
		case 2:
			return "Tuesday";
		case 3:
			return "Wednesday";
		case 4:
			return "Thursday";
		case 5:
			return "Friday";
		case 6:
			return "Saturday";

		}
		return "Invalid";
		
	}

}

