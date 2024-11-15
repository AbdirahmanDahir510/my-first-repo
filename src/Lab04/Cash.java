package Lab04;

public class Cash extends Payment {
	private static PaymentType type;
	float cash;

	// Corresponding method
	public static Cash createCash(String[] caSh) {
		Cash ch = null;
		if ((caSh == null) || (caSh.length != 2))
			return null;
		float cash = Float.parseFloat(caSh[0]);
		float amount = Float.parseFloat(caSh[1]);
		ch = new Cash(amount, cash);
		return ch;
	}

	// constructor
	 Cash(float amount, float cash) {
		super(amount,PaymentType.Cash);
		this.cash = cash;

	}

	// getters and setters
	public float getCash() {
		return cash;
	}

	public void setCash(float cash) {
		this.cash = cash;
	}
}
