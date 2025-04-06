package factorymethod.dao.container;

import java.util.List;

import factorymethod.dao.interfaces.ProductDao;
import factorymethod.model.Product;

public class ProductContainerDao implements ProductDao {

	@Override
	public Product getById(int productNumber) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Product> getAll() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public int add(Product product) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public Boolean delete(int productNumber) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Boolean update(Product product) {
		// TODO Auto-generated method stub
		return null;
	}

}
