package s28_ExceptionHandling;

class Amount {
	private String currency;
	private int amount;

	public Amount(String currency, int amount) {
		super();
		this.currency = currency;
		this.amount = amount;
	}

	public void add(Amount that) throws CurrenciesDoNotMatchException {

		if (!this.currency.equals(that.currency)) {

			// throw new Exception("Currencies Do Not Match : " + this.currency + " & " +
			// that.currency);

			// CUSTOM EXCEPTION
			throw new CurrenciesDoNotMatchException(
					"Currencies Do Not Match : " + this.currency + " & " + that.currency + " : ");

		}
		this.amount = this.amount + that.amount;
	}

	@Override
	public String toString() {
		return amount + " " + currency;
	}
}

// CUSTOM EXCEPTION
class CurrenciesDoNotMatchException extends Exception {
	public CurrenciesDoNotMatchException(String msg) {
		super(msg);

	}
}
public class ThrowingExceptionRunner {

	public static void main(String[] args) throws CurrenciesDoNotMatchException {
		Amount amount1 = new Amount("USD", 10);
		Amount amount2 = new Amount("EUR", 20);
		amount1.add(amount2);
		System.out.println(amount1);

	}


}
