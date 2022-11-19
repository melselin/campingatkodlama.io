package interfaces;

public class CustomerManager {
	private ICustomerDal customerDal;
	
	public CustomerManager(ICustomerDal customerDal) {  //for method 2
		this.customerDal = customerDal;
	}
	
	
	public void add() {
		//business codes here
		customerDal.Add();
	}

}
