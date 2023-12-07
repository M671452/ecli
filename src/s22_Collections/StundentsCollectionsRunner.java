package s22_Collections;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

class AscendingStudentComparetor implements Comparator<Student> {

	// Comparing student1 and student2 ID
	@Override
	public int compare(Student student1, Student student2) {
		return Integer.compare(student1.getId(), student2.getId());
	}
}

public class StundentsCollectionsRunner {

	public static void main(String[] arg) {

		List<Student> students = List.of(new Student(1, "Mannat"), new Student(2, "Sehaj"), new Student(3, "Manpreet"));

		List<Student> studentsAl = new ArrayList<>(students);
		System.out.println(students);

		Collections.sort(studentsAl);
		System.out.println("DescendingStudentComparetor" + studentsAl);

		// Collections.sort(studentsAl, new DescendingStudentComparetor());
		studentsAl.sort(new AscendingStudentComparetor());
		System.out.println("AscendingStudentComparetor" + studentsAl);


	}

}
