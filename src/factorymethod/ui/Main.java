package factorymethod.ui;

import factorymethod.controller.*;
import factorymethod.dao.DaoFactoryType;

public class Main {

	public static void main(String[] args) {
		
		ConfigurationController.selectFactory(DaoFactoryType.MSSQL);

		ProductController productController = new ProductController();
		CustomerController customerController = new CustomerController();
	}
}