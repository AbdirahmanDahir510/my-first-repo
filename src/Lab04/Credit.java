package Lab04;

public class Credit extends Payment {
	private static PaymentType type;
	 String name;
	 String validDate;

	// Corresponding method
	public static Credit createCredit(String[] credit) {
		Credit cr = null;
		if ((credit == null) || (credit.length != 3))
			return null;
		String name = credit[0];
		String validDate = credit[1];
		float amount = Float.parseFloat(credit[2]);
		cr = new Credit(amount, validDate, name);
		return cr;
	}

	// constructor
     Credit(float amount, String name, String validDate) {
		super(amount,type);
		this.name = name;
		this.validDate = validDate;
	}

	// getters and setters

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getValidDate() {
		return validDate;
	}

	public void setValidDate(String validDate) {
		this.validDate = validDate;
	}

}
