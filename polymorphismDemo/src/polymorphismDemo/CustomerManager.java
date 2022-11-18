package polymorphismDemo;

public class CustomerManager {
	private BaseLogger logger;

	public CustomerManager(BaseLogger logger) {
		this.logger=logger;
	}

	public void add() {
		System.out.println("The customer has been added.");
		this.logger.log("Log message");
		
	}
}
