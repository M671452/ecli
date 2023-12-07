package s9_introObjectOriented;

public class BookRunner {

	public static void main(String[] args) {
		// Class object = new class();
		Book artOfComputerProgrammering = new Book(200);
		// Class object = new class();
		Book effectiveJava = new Book(200);
		// Class object = new class();
		Book cleanCode = new Book(200);

		System.out.println(artOfComputerProgrammering.getQuantity());
		System.out.println(effectiveJava.getQuantity());
		System.out.println(cleanCode.getQuantity());

		// artOfComputerProgrammering.setQuantity(200);
		// effectiveJava.setQuantity(200);
		// cleanCode.setQuantity(200);

		artOfComputerProgrammering.increase(20);
		effectiveJava.increase(20);
		cleanCode.increase(20);

		artOfComputerProgrammering.decrease(50);
		effectiveJava.decrease(50);
		cleanCode.decrease(50);

		System.out.println(artOfComputerProgrammering.getQuantity());
		System.out.println(effectiveJava.getQuantity());
		System.out.println(cleanCode.getQuantity());

	}

}
