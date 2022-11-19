package interfaces;

public class Main {

	public static void main(String[] args) {
		ICustomerDal customerDal = new OracleCustomerDal();
		customerDal.Add();
		
		
		
		//interface with polymorphism  method 1 
//		CustomerManager customerManager= new CustomerManager();
//		customerManager.customerDal=new MySqlCustomerDal();
//		customerManager.add();  }
	
        //method 2
	CustomerManager customerManager= new CustomerManager(new MySqlCustomerDal());
	customerManager.add();
}
}
