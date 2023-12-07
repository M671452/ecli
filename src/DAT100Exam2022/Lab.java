package DAT100Exam2022;

//Subclass
public class Lab extends Rom {

	public int antall;

	public Lab(char blokk, int nr, int antall) {
		super(blokk, nr);
		this.antall = antall; // G L E M T
		// System.out.println("Lab " + blokk + nr + antall); F E I L

	}

	// G L E M T
	@Override
	public String toString() {
		return "Lab " + super.toString() + "[" + antall + "]\n";
	}

}