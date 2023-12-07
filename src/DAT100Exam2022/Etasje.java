package DAT100Exam2022;

public class Etasje {
	private int etasje;
	private Rom[] rom; // G L E M T

	public Etasje(int etasje, Rom[] rom) {
		this.etasje = etasje;
		this.rom = rom; // G L E M T
	}

	@Override
	public String toString() {
		String str = "Etasje " + etasje + "\n";

		for (Rom r : rom) {
			str = str + r.toString();
		}
		return str;
		// F E I L return super.toString() + "Etasje " + etasje + "\n" + "Kontor" +
		// blokk + nr + name;
	}
}
