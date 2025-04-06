package factorymethod.dao.container;

import factorymethod.dao.interfaces.CustomerDao;
import factorymethod.dao.interfaces.*;

public class ContainerDaoFactory implements DaoFactory {

	@Override
	public ProductDao createProductDao() {
		
		return new ProductContainerDao();
	}

	@Override
	public CustomerDao createCustomerDao() {
	
		return new CustomerContainerDao();
	}

}
