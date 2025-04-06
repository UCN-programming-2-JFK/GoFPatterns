package factorymethod.dao.mssql;

import factorymethod.dao.interfaces.*;

public class MssqlDaoFactory implements DaoFactory {

	@Override
	public ProductDao createProductDao() {
		
		return new MsSqlProductDao();
	}

	@Override
	public CustomerDao createCustomerDao() {
		
		return new MsSqlCustomerDao();
	}

}
