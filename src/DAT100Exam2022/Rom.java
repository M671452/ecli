package DAT100Exam2022;

//Superclass
public abstract class Rom {
	private int nr;
	private char blokk;


	public Rom(char blokk, int nr) {
		this.nr = nr; // G L E M T
		this.blokk = blokk; // G L E M T

	}

	public int getNr() {
		return nr;
	}

	public void setNr(int nr) {
		this.nr = nr;
	}
	public char getBlokk() {
		return blokk;
	}

	public void setBlokk(char blokk) {
		this.blokk = blokk;
	}

	@Override
	public String toString() {
		return Character.toString(blokk) + nr;
		// return "Rom" + blokk + nr; F E I L
	}


}


