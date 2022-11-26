package oopWithNLayeredApp.entities;

public class Product {

	private int _id;
	private String _name;
	private double _unitPrice;

	public Product() {
		super();
	}

	public Product(int id, String name, double unitPrice) {
		super();
		this._id = id;
		this._name = name;
		this._unitPrice = unitPrice;
	}

	int getId() {
		return _id;
	}

	void setId(int id) {
		this._id = id;
	}

	String getName() {
		return _name;
	}

	void setName(String name) {
		this._name = name;
	}

	public double getUnitPrice() {
		return _unitPrice;
	}

	void setUnitPrice(double unitPrice) {
		this._unitPrice = unitPrice;
	}

}
