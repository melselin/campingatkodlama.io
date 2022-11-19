package abstractDemo;

public class Main {

	public static void main(String[] args) {
		CustomerManager customerManager=new CustomerManager();
		customerManager.databaseManager= new SqlServerDatabaseManager(); // new can be referenced to the other type of databases here without any dependency.
		customerManager.getCustomer();                                   
	}

}
