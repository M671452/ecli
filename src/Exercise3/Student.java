package Exercise3;

public class Student {
	private int marks;
	
	public Student(int marks) {
		// TODO: Assign 'marks' to the instance variable 'this.marks'
		this.marks = marks;
	}
	

	public char assignGrade() {
		//TODO: Implement the method which assigns the grade based on marks.
		if (marks < 0 || marks > 100) { // If marks are less than 0 or greater to 100, return 'X'
			return 'X';
		}
		if (marks >= 90) {// If marks are greater than 0 or equal to 90, return 'A'
			return 'A';
		}
		if (marks >= 80) {// If marks are greater than 0 or equal to 80, return 'B'
			return 'B';
		}
		if (marks >= 70) {// If marks are greater than 0 or equal to 70, return 'C'
			return 'C';
		}
		if (marks >= 60) {// If marks are greater than 0 or equal to 60, return 'D'
			return 'D';
		}
		if (marks >= 50) {// If marks are greater than 0 or equal to 60, return 'E'
			return 'E';
		}

		return 'F';
	}
}
