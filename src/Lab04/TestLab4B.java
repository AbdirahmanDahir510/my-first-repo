package Lab04;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Order;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.TestMethodOrder;
import org.junit.jupiter.api.MethodOrderer.OrderAnnotation;

@TestMethodOrder(OrderAnnotation.class)
class TestLab4B {
    
	@Test
    @Order(1)    
	public void testCreateItem() {
		String[] data;
		Item item;
		data = new String[] { };
		item = Item.CreateItem(data);
		assertNull(item);
		data = new String[] {"1", ""};
		item = Item.CreateItem(data);
		assertNull(item);
		data = new String[] {"2", "Salad", "3.5", "1"};
		item = Item.CreateItem(data);
		assertNotNull(item);
	}
	
	@Test
    @Order(2)    
	public void testCreateCustomer() {
		Customer customer;
		String[] data;
		data = new String[] {"1", "Paulo"};
		customer = Customer.Createcustomer(data);
		assertNull(customer);
		data = new String[] {"-1", "Paulo", ""};
		customer = Customer.Createcustomer(data);
		assertNull(customer);
		data = new String[] {"2", "Howard", "37, Woddroofe Av"};
		customer = Customer.Createcustomer(data);		
		assertNotNull(customer);
	}
	
	@Test
    @Order(3)    
	public void testPayment() {
		String[] data;
		Payment payment;
		Customer customer;
		data = new String[] {"2", "Howard", "37, Woddroofe Av"};
		customer = Customer.Createcustomer(data);
		// Payment 1
		data = new String[] {"Howard", "My bank"};
		payment = Check.createCheck(data);
		assertNull(payment);
		// Payment 2
		data = new String[] {"100.0"};
		payment = Cash.createCash(data);
		assertNotNull(payment);
		customer.addPayment(payment);
	}
	
	@Test
    @Order(4)    
	public void testSystem() {
		OrderSystems.main(null);
	}
	
}
