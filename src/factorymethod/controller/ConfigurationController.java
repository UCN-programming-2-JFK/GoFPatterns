package factorymethod.controller;

import javax.swing.SwingContainer;

import factorymethod.dao.*;
import factorymethod.dao.container.ContainerDaoFactory;
import factorymethod.dao.interfaces.*;
import factorymethod.dao.mssql.*;

public class ConfigurationController {
	
	private static DaoFactory daoFactory;
	
	public ProductDao getProductDao() {
		
		return daoFactory.createProductDao();
	}
	
	public CustomerDao getCustomerDao() {
		
		return daoFactory.createCustomerDao();
	}

	public static void selectFactory(DaoFactoryType daotype) {
		
		switch(daotype) {
		
		case MSSQL:
			
			daoFactory = new MssqlDaoFactory();
			break;
		
		case CONTAINER:
			
			daoFactory = new ContainerDaoFactory();
			break;
		
		default:
			
		}
	}
}
