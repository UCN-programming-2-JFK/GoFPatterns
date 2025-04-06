package factorymethod.controller;

import factorymethod.dao.interfaces.ProductDao;

public class ProductController {

	private ProductDao productDao;

	public ProductController() {
		
		this.productDao = new ConfigurationController().getProductDao();
		System.out.println("ProductController constructor received a " + productDao.getClass().getSimpleName());
	}
}