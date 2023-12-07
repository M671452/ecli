package s18_ArraysAndArrayList;

import java.math.BigDecimal;
import java.math.RoundingMode;
import java.util.ArrayList;
import java.util.Collections;

public class Student {

	private String name;// Field name = String name
	private ArrayList<Integer> marks = new ArrayList<Integer>();// Field marks = integer array marks

	public Student(String name, int... marks) {
		// Member variables of name and marks
		// Remember to create a field name of name and marks
		this.name = name;

		for (int mark : marks) {
			this.marks.add(mark);
		}

	}

	public int getNumberOfMarks() {

		return marks.size();
		// Length in array = return marks.length;
		// Length in arraylist = return marks.size();
	}

	public int getTotalSumOfMarks() {
		int sum = 0;
		for (int mark : marks) {
			sum = sum + mark;
		}

		return sum;
	}

	public int getMaximumMark() {
		return Collections.max(marks);
	}

	public int getMinimumMark() {
		return Collections.min(marks);
	}

	/*
	 * Array public int getMaximumMark() { int maximum = Integer.MIN_VALUE; // 95,
	 * 98, 100 for (int mark : marks) { if (mark > maximum) { maximum = mark; } }
	 * return maximum; }
	 */

	/*
	 * public int getMinimumMark() { int minimum = Integer.MAX_VALUE; for (int mark
	 * : marks) { if (mark < minimum) { minimum = mark; } } return minimum; }
	 */

	public BigDecimal getAverageMarks() {
		int sum = getTotalSumOfMarks();
		int number = getNumberOfMarks();

		return new BigDecimal(sum).divide(new BigDecimal(number), 3, RoundingMode.UP);
	}


	@Override
	public String toString() {
		return name + " Gabria's marks: " + marks;
	}

	public void addMark(int mark) {
		marks.add(mark);
	}

	public void removeMarkAtIndex(int index) {
		marks.remove(index);
	}

}

