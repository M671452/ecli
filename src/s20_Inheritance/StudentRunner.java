package s20_Inheritance;

public class StudentRunner {

	public static void main(String[] args) {
		// Student student = new Student();
		// student.setName("Mannat");
		// student.setEmail("Mannatgabria@yahoo.com");

		/*
		 * Person person = new Person(); person.setName("Mannat Gabria");
		 * person.setEmail("Mannatgabria@yahoo.com");
		 * person.setPhoneNumber("+47 94781459"); String value = person.toString();
		 * System.out.println(value); System.out.println(person);
		 */

		Employee employee = new Employee("Mannat Gabria", "Developer");
		// employee.setName("Mannat Gabria");
		employee.setEmail("Mannatgabria@yahoo.com");
		employee.setPhoneNumber("+47 94781459");
		employee.setEmployeeGrade('A');
		employee.setTitle("Developer");

		System.out.println(employee);

	}

}
