package factorymethod.controller;

import factorymethod.dao.interfaces.CustomerDao;

public class CustomerController {
	private CustomerDao customerDao;
	
	public CustomerController() {
		
		this.customerDao = new ConfigurationController().getCustomerDao();
		System.out.println("CustomerController constructor received a " + customerDao.getClass().getSimpleName());
	}
}
