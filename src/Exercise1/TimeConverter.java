package Exercise1;

public class TimeConverter {
	public static int convertHoursToMinutes(int hours) {
		/*
		 * This method converts hours into minutes and returns -1 for invalid cases
		 * (negative hours). Since there are 60 minutes in an hour, it does this by
		 * multiplying the provided hours argument by 60, after checking if the input is
		 * valid:
		 */
		if (hours < 0) {
			return -1;
		}
		int noOfMinutes = hours * 60;
		return noOfMinutes;
		// return hours * 60;
	}

	public static int convertDaysToMinutes(int days) {
		/*
		 * This method converts days into minutes and returns -1 for invalid cases
		 * (negative days). Since there are 24 hours in a day and 60 minutes in an hour,
		 * it does this by multiplying the provided days argument by 24 * 60, after
		 * checking if the input is valid:
		 */
		if (days < 0) {
			return -1;
		}
		int noOfDays = days * 24 * 60;
		return noOfDays;

		// return days * 24 * 60;

		/*
		 * These methods together allow for convenient conversion between different
		 * units of time, with appropriate error handling for negative input values.
		 */
	}

}

