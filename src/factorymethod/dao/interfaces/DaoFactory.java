package factorymethod.dao.interfaces;

public interface DaoFactory {
	ProductDao createProductDao();
	CustomerDao createCustomerDao();
}