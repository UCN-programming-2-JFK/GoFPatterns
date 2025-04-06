package factorymethod.dao.interfaces;

import java.util.List;

import factorymethod.model.*;

public interface ProductDao {
	Product getById(int productNumber);
	List<Product> getAll();
	int add(Product product);
	Boolean delete(int productNumber);
	Boolean update(Product product);
}