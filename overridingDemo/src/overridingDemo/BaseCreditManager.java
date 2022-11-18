package overridingDemo;

public class BaseCreditManager {
	public double calculate(double amount) {
		return amount*18;
	}
	
	
//	public final double calculate(double amount) {     with the final keyword it cannot be overridden anymore
//		return amount*18; }
	

}
