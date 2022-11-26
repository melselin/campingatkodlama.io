package oopWithNLayeredApp;

import oopWithNLayeredApp.business.ProductManager;
import oopWithNLayeredApp.dataAccess.JdbcProductDao;
import oopWithNLayeredApp.entities.Product;

public class Main {

	public static void main(String[] args) throws Exception {
		Product product1 = new Product(1, "Iphone Xr", 10000);

		ProductManager productManager = new ProductManager(new JdbcProductDao());
		productManager.add(product1);
	}

}

//Data Access
//Business
//API
//UI

//JDBC
//Hibernate-ORM
//JPA

//For sustainability and better management we divide our program into smaller parts 
