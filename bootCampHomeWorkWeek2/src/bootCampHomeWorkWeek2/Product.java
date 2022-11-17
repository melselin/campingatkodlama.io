package bootCampHomeWorkWeek2;

public class Product {
	public Product(int id,String name, String description,double price,int stockAmount){
//	with parameters
		this._id=id;
		this._description=description;
		this._name=name;
		this._price=price;
		this._stockAmount=stockAmount;
		this._productCode=getProductCode();
	}
	public Product() { // without parameters
		System.out.println("The constructor has been started.");
	}

	private int _id;
	private String _name;
	private String _description;
	private double _price;
	private int _stockAmount;
	private String _productCode;

	// getter
	public int getId() {
		return _id;
	}

	// setter
	public void setId(int id) {
		this._id = id; // This refers to the class' id
	}

	public String getName() {
		return _name;
	}

	public void setName(String name) {
		_name = name;
	}

	public String getDescription() {
		return _description;
	}

	public void setDescription(String description) {
		_description = description;
	}

	public double getPrice() {
		return _price;
	}

	public void setPrice(double price) {
		_price = price;
	}

	public int getStockAmount() {
		return _stockAmount;
	}

	public void setStockAmount(int stockAmount) {
		_stockAmount = stockAmount;
	}

	public String getProductCode() {
		return this._name.substring(0, 1) + _id;
	}

}
