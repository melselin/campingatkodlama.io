package oopWithNLayeredApp.entities;

public class Product {

	private int id;
	private String name;
	private double unitPrice;

	public Product() {
		super();
	}

	public Product(int id, String name, double unitPrice) {
		super();
		this.id = id;
		this.name = name;
		this.unitPrice = unitPrice;
	}

	int getId() {
		return id;
	}

	void setId(int id) {
		this.id = id;
	}

	String getName() {
		return name;
	}

	void setName(String name) {
		this.name = name;
	}

	double getUnitPrice() {
		return unitPrice;
	}

	void setUnitPrice(double unitPrice) {
		this.unitPrice = unitPrice;
	}
	
	
	

}
