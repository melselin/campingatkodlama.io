package youtubeDemo;

public class Main {

	public static void main(String[] args) {
		// reference and value type differences:

		int num1 = 5;
		int num2 = 10;
		num1 = num2;
		num2 = 20;
		System.out.println(num1);
//We get 10 bc it passes by value.

		int numbers1[] = new int[] { 2, 10, 5 };
		int numbers2[] = new int[] { 100, 200, 500 };
		numbers1 = numbers2;
		numbers2[0] = 1000;
		System.out.println(numbers1[0]);
//We get 1000 bc it passes by reference, therefore numbers1 points to the same datas with numbers2 

		CreditManager creditManager = new CreditManager();// instance creation
		creditManager.calculate();
		creditManager.save();

		Customer customer = new Customer();
		customer.id = 1;
		customer.City = "Besançon";

//		CustomerManager customerManager = new CustomerManager(customer);
//		customerManager.Save();
//		customerManager.Delete();

		Company company = new Company();
		company.taxNumber = 1000;
		company.companyName = "Bosch";
		company.id = 10;

//		CustomerManager customerManager2 = new CustomerManager(new Company());

		Person person = new Person();
		person.firstName = "Sylvia";
		person.nationalIdentity = "Plath";

		Customer c1 = new Customer(); // inheritance
		Customer c2 = new Person();
		Customer c3 = new Company();

		// IoC Container
		CustomerManager customerManager = new CustomerManager(new Customer(), new MilitaryCreditManager());
		customerManager.giveCredit();
	}
}

class CreditManager {

	public void calculate() {
		System.out.println("Calculated.");

	}

	public void save() {
		System.out.println("Saved.");
	}

}
// SOLID

class Customer {
	public int id;
	public String City;
}

class CustomerManager {
	private Customer _customer;
	private ICreditManager _creditManager;

	public CustomerManager(Customer customer, ICreditManager creditManager) {
		_customer = customer;
		_creditManager = creditManager;

	}

	public void Save() { // Customer customer->encapsulation
		System.out.println("The customer has been saved:" + _customer);
	}

	public void Delete() {
		System.out.println("The customer has been deleted:" + _customer);
	}

	public void giveCredit() {
		_creditManager.calculate();
		System.out.println("The credit has been given.");
	}
}

class Company extends Customer {
	public int taxNumber;
	public String companyName;

}

class Person extends Customer {
	public String firstName;
	public String lastName;
	public String nationalIdentity;
}

interface ICreditManager {

	// <various credit calculations come here>
	void calculate();

	void save();

}


abstract class BaseCreditManager implements ICreditManager {
	public abstract void calculate();
//DRY
	public void save() {
		System.out.println("Saved.");
	}

}

class TeacherCreditManager extends BaseCreditManager implements ICreditManager {

	@Override
	public void calculate() {
		System.out.println("Teacher credit has been calculated.");

	}
//DRY
//	@Override
//	public void save() {
//		System.out.println("Teacher credit has been saved.");
//
//	}

}

class MilitaryCreditManager extends BaseCreditManager implements ICreditManager {

	@Override
	public void calculate() {
		System.out.println("Military credit has been calculated.");

	}
//DRY
//	@Override
//	public void save() {
//		System.out.println("Military credit has been saved.");
//
//	}

}
