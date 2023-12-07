package DAT100Exam2022;

//subclass
public class Kontor extends Rom {

	private String person;

	public Kontor(char blokk, int nr, String person) {
		super(blokk, nr);
		this.person = person;
	}

	@Override
	public String toString() {
		return "Kontor " + super.toString() + "[" + person + "]\n";

	}
}

