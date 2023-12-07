package Exercise1;

public class ExamResult {
	public boolean isPass(int marks) {
		if (marks < 50) {
			return false;
		}

		return marks > 50;
		// Update Code : If the student's marks are greater than 50, they have passed
		// the exam.

	}

}


