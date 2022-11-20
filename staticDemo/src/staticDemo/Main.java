package staticDemo;

public class Main {

	public static void main(String[] args) {
		ProductManager manager = new ProductManager();
		Product product = new Product();
		product.price = 10;
		product.name = "";

		manager.add(product);

		DatabaseHelper.Crud.Read();
		// however it is adviced to use static carefully as it can easily go against
		// the single responsibility principle, so it isnt really among the best practices.

	}

}
