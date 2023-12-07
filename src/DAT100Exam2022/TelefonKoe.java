package DAT100Exam2022;

import s20_Inheritance.Person;

public class TelefonKoe {

	private Person[] personer;
	private int antall;

	public TelefonKoe(int maksantall) {
		personer = new Person[maksantall];
		this.antall = 0;
	}

	public void vis() {
		for (int i = 0; i < antall; i++) {
			System.out.println("[" + (i + 1) + "]");
		}
	}

	public boolean settin(Person p) {
		boolean sattinn = false;

		if (antall < personer.length) {
			personer[antall] = p;
			antall++;
			sattinn = true;
		}
		return sattinn;
	}

	public Person neste() {
		if (antall > 0) {
			return personer[0];
		}
		return null;
	}

	public void fjern() {
		int i = 0;

		if (antall > 0) {
			while (personer[i + 1] != null) {
				personer[i] = personer[i + 1];

				antall--;
			}
		}
	}

	public int nummer(String navn) {
		int funnet = -1;
		int i = 0;

		while (funnet == -1 && i < antall) {
			if (personer[i].getNavn().equals(navn)) {
				funnet = i;
			}
			i++;
		}
		return funnet + 1;

	}


}
