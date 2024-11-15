package Lab04;

public class Check extends Payment {
	private static PaymentType type;
	 String name;
	 String bank;

	public String getName() {
		return name;
	}

	// the corresponding method
	public static Check createCheck(String[] check) {
		Check ck = null;
		if ((check == null) || (check.length != 3))
			return null;
		float amount = Float.parseFloat(check[0]);
		String name = check[1];
		String bank = check[2];
		ck = new Check(amount, name, bank);
		return ck;
	}

	// the constructor
	 Check(float amount, String name, String bank) {
		super(amount,PaymentType.Check);
		this.bank = bank;
		this.name = name;

	}

	// setters and getters
	public void setName(String name) {
		this.name = name;
	}

	public String getBank() {
		return bank;
	}

	public void setBank(String bank) {
		this.bank = bank;
	}

}
