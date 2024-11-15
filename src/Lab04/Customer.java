package Lab04;

import java.util.ArrayList;

public class Customer {
	int id;
	String name;
	String address;
	ArrayList<Payment> payments;
	float totalCredit;

	public static Customer Createcustomer(String[] customer) {
		Customer c = null;
		if ((customer == null) || (customer.length != 3))
			return null;
		int id = Integer.parseInt(customer[0]);
		String name = customer[1];
		String address = customer[2];
		c = new Customer(id, name, address);
		return c;

	}

	// private constructor of customer
	private Customer(int id, String name, String address) {
		this.id = id;
		this.name = name;
		this.address = address;

	}

	// getters and setters
	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public ArrayList<Payment> getPayments() {
		return payments;
	}

	public void setPayments(ArrayList<Payment> payments) {
		this.payments = payments;
	}

	public float getTotalCredit() {
		return totalCredit;
	}

	public void setTotalCredit(float totalCredit) {
		this.totalCredit = totalCredit;
	}

	@Override
	public String toString() {
		String str = "";
		str = "Customer [id=" + id + ", name=" + name + ", address=" + address + ", payments=" + payments
				+ ", totalCredit=" + totalCredit + "]";
		return str;
	}

	public void addPayment(Payment payment) {
		if (payments == null) {
			payments = new ArrayList<>();
		}
		payments.add(payment);
		totalCredit += payment.amount;

	}
}
