package oopWithNLayeredApp.business;

import oopWithNLayeredApp.dataAccess.JdbcProductDao;
import oopWithNLayeredApp.dataAccess.ProductDao;
import oopWithNLayeredApp.entities.Product;

public class ProductManager {
	public void add(Product product) throws Exception {
		// business rules comes here
		if (product.getUnitPrice() < 10) {
			throw new Exception("The product price can not be lesser than 10!");
		}
		ProductDao productDao = new JdbcProductDao();
		productDao.add(product);
	}

}
