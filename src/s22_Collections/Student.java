package s22_Collections;

public class Student implements Comparable<Student> {
	private int id;
	private String name;

	// Constructor
	public Student(int id, String name) {
		// super();
		this.id = id;
		this.name = name;
	}

	// Getter and setter
	public int getId() {
		return id;
	}

	public void setIt(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	// Tostring: printing ids and students
	@Override
	public String toString() {
		return id + " " + name;
	}


	// Comparing students
	@Override
	public int compareTo(Student that) {

		return Integer.compare(that.id, this.id); // Reverse order
		// return Integer.compare(this.id, that.id); // Normal order
	}

}
