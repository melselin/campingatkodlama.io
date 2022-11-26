package oopWithNLayeredApp.business;

import oopWithNLayeredApp.core.logging.Logger;
//import oopWithNLayeredApp.dataAccess.JdbcProductDao; no longer needed as the dependency got looser
import oopWithNLayeredApp.dataAccess.ProductDao;
import oopWithNLayeredApp.entities.Product;

public class ProductManager {
	private ProductDao productDao; // loosely coupled with this technic
	private Logger[] loggers;

	public ProductManager(ProductDao productDao, Logger[] loggers) {
		this.productDao = productDao;
		this.loggers = loggers;
	}

	public void add(Product product) throws Exception {
		// business rules comes here
		if (product.getUnitPrice() < 10) {
			throw new Exception("The product price can not be lesser than 10!");
		}
//		ProductDao productDao = new JdbcProductDao();
		productDao.add(product);

		for (Logger logger : loggers) {
			logger.log(product.getName());

		}

	}

}
//Vital note: when a layer uses a class from another layer it should only be able to access it via interface!
