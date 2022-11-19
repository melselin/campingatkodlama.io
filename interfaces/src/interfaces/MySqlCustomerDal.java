package interfaces;

public class MySqlCustomerDal implements ICustomerDal,IRepository{

	@Override
	public void Add() {
		System.out.println("My sql has been added to the db.");
		
	}

}
