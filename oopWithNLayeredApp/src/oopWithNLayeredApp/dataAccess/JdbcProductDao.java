package oopWithNLayeredApp.dataAccess;

import oopWithNLayeredApp.entities.Product;

public class JdbcProductDao { //=data access object

	public void add(Product product) {
		System.out.println("Added to the db via jdbc");
		
	}
}
