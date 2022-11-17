package bootCampHomeWorkWeek2;

public class Main {

	public static void main(String[] args) {

		String mesaj = "Bugün hava çok güzel.";
		String mesaj2 = mesaj.substring(0, 2);
		System.out.println(mesaj2);

		Methods2 method = new Methods2();
		method.add(23, 30);
		method.addMultiple(2, 3, 4, 5, 6, 7, 8, 9, 0, 22, 4);
		method.pullCity();
		method.update();

		CustomerManager customermanager1 = new CustomerManager();
		CustomerManager customermanager2 = new CustomerManager();
		customermanager1 = customermanager2; // both refers to the same thing now the first object is w/o a pointer
												// reference.
		// Classes are reference types.
		// the actual object is kept in Heap
		// reference numbers are kept in Stack
		// if an object isn't pointed by a reference it is cleaned by the garbage
		// collector.
		customermanager1.add();
		customermanager1.remove();
		customermanager1.update();
		// Primitive types are value references.
		// Numbers are primitive type so it is stocked in the Stacks.
		// Therefore if two value references are show each other and the other one
		// changes the other one will still has the first value as the numbers aren't
		// referenced but directly kept in the Stack.
		int num1 = 10;
		int num2 = 20;
		num2 = num1;
		num1 = 30;
		System.out.println(num2);

		// Arrays are reference types:
		int[] numbers1 = new int[] { 1, 2, 3 };
		int[] numbers2 = new int[] { 4, 5, 6 };
		numbers2 = numbers1;
		numbers1[0] = 10;
		System.out.println(numbers2[0]);
		// That's why we get the print of 10 here.

		// ****************************************

		RecapDemo_Classes operations = new RecapDemo_Classes();
		int total = operations.add(2, 5);
		System.out.println(total);

		// *****************************************
		// Objects have attributes/fields

		Product product = new Product();
		product.setName("Laptop");
		product.setId(1);
		product.setDescription("Asus Laptop");
		product.setPrice(2000);
		product.setStockAmount(3);
		product.getProductCode();
		
		
		ProductManager productManager= new ProductManager();
		productManager.add(product);
//		Product product = new Product(1,"Laptop","Asus Laptop", 33.00,4);
//		System.out.println(product.getProductCode());
		
		
		//overloading
		method.add(2, 3);
		method.add(2, 3, 4);
		
	    //Inheritance
		Customer customer=new Customer();
		Employee employee=new Employee();
		customer.age=23;
		employee.age=32;
		
		
		EmployeeManager employeeManager=new EmployeeManager();
		CustomerManager customerManager=new CustomerManager();
		customerManager.add();
		employeeManager.BestEmployee();
	}

}
