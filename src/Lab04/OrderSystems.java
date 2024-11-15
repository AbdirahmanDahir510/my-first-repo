package Lab04;

import java.util.ArrayList;

public class OrderSystems {

	public static void main(String[] args) {

		// Items
		ArrayList<Item> items = new ArrayList<>();
		items.add(Item.CreateItem(new String[] { "101", "T-Shirt", "20.5", "5" }));
		items.add(Item.CreateItem(new String[] { "102", "Salad", "3.5", "100" }));
		items.add(Item.CreateItem(new String[] { "103", "Gums", "1.5", "20" }));
		items.add(Item.CreateItem(new String[] { "104", "Water", "0.5", "1" }));

		// printing the items
		System.out.println("LIST 1: Printing list of items .............................");
		for (Item item : items) { // this loop prints everything in the array list
			if (items != null) { // if the item is not null print this
				System.out.println(item);
			}
		}

		// Customer
		ArrayList<Customer> customers = new ArrayList<>();
		Customer customer1 = Customer.Createcustomer(new String[] { "1", "Paulo", "15, Main Street" });
		Customer customer2 = Customer.Createcustomer(new String[] { "2", "Howard", "37, Woodroofe AV" });
		if (customer1 != null)
			customers.add(customer1);
		if (customer2 != null)
			customers.add(customer2);

		System.out.println("List 2: Printing list of customers.............................");
		for (Customer customer : customers) {
			System.out.println("- Customer: [Name: " + customer.name + "], [Address: " + customer.address + "].");
		}

		// payments and assign them to customers
		ArrayList<Payment> payments1 = new ArrayList<>();
		payments1.add(new Cash(100.0f, 100.0f));
		if (customer1 != null) {
			customer1.setPayments(payments1);
			customer1.totalCredit = 100.0f;
		}

		ArrayList<Payment> payments2 = new ArrayList<>();
		payments2.add(new Check(10.0f, "Howard", "Some Bank"));
		payments2.add(new Cash(20.0f, 20.0f));
		if (customer2 != null) {
			customer2.setPayments(payments2);
			customer2.totalCredit = 30.0f;
		}

		// list of payments for each customer
		System.out.println("LIST 3: Printing list of payments.............................................. ");
		for (Customer customer : customers) {
			System.out.println("Customer " + customer.name + " (Payment list):");
			for (Payment payment : customer.getPayments()) {
				System.out.println("- Payment type: " + payment.type + " [Amount: " + payment.amount + "].");
			}
			System.out.println("* Total credit:" + customer.totalCredit);
		}

	}
}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	