package factorymethod.dao.interfaces;

import java.util.List;
import factorymethod.model.*;

public interface CustomerDao {
	
	public Customer getById(int customerNumber);
	public List<Customer> getAll();
	public int add(Customer customer);
	public Boolean delete(int customerNumber);
	public Boolean update(Customer customer);
}