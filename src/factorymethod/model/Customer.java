package factorymethod.model;

public class Customer {
	
	private int customerNumber;
	private String email;
	
	public String getEmail() {
		return this.email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public int getCustomerNumber() {
		return customerNumber;
	}
	public void setCustomerNumber(int customerNumber) {
		this.customerNumber = customerNumber;
	}
	
	
	public Customer(int customerNumber, String email) {
		
		this.setCustomerNumber(customerNumber);
		this.setEmail(email);
	}
}