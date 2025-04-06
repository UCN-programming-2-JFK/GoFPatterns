package factorymethod.dao.container;

import java.util.List;

import factorymethod.dao.interfaces.CustomerDao;
import factorymethod.model.Customer;

public class CustomerContainerDao implements CustomerDao {

	@Override
	public Customer getById(int customerNumber) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Customer> getAll() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public int add(Customer customer) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public Boolean delete(int customerNumber) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Boolean update(Customer customer) {
		// TODO Auto-generated method stub
		return null;
	}

}
