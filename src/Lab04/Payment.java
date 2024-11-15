package Lab04;

enum PaymentType {
	Cash, Check, Credit
}

abstract class Payment {

	float amount;
	PaymentType type;

	public Payment(float amount, PaymentType type) {
		this.amount = amount;
		this.type = type;

	}

	@Override
	public String toString() {
		String str = "";
		str = "Payment [amount=" + amount + ", type=" + type + "]";
		return str;
	}

}
