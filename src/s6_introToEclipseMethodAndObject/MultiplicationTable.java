package s6_introToEclipseMethodAndObject;

public class MultiplicationTable {
	//5*1 = 5
	//5*10 = 50
	
	/*
	 * This is called Refactoring. Refactoring is basically an exercise where we
	 * change The structure of code without changing its functionality. We changed
	 * how print is written without changing the functionality of the code. We
	 * changed how print table is done without changing this functionality of the
	 * print table method.
	 * 
	 */
	void print() {
		print(5);

	}

	void print(int table) {
		print(table, 1, 10);

	}

	void print(int table, int from , int to) {
		for(int i = from; i <= to; i++) {
			System.out.printf("%d * %d = %d", table, i, table * i).println();
	    }
	}
}
