package staticDemo;

//The head class cannot be made static
public class ProductValidator {

	static {
		System.out.println("Static constructor has been worked.");
	}

	public ProductValidator() {
		System.out.println("The constructor has been worked.");

	}

	public static boolean isValid(Product product) {
		if (product.price > 0 && !product.name.isEmpty()) {
			return true;
		} else {
			return false;
		}

	}
	
	public void test() {
		
	}//But inner classes can be made static
	
	public static class InnerClass{
		public static void Delete() {
			
		}
	}
}

