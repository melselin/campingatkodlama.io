package overridingDemo;

public class StudentCreditManager extends BaseCreditManager {
	public double calculate(double amount) {  //overridable
		return amount * 10;
	}
}
