package overridingDemo;

public class Main {

	public static void main(String[] args) {
		BaseCreditManager[] creditManager = new BaseCreditManager[] { new StudentCreditManager(),
				new AgricultureCreditManager(), new TeacherCreditManager() };
		for(BaseCreditManager credits:creditManager) {
			System.out.println(credits.calculate(1000));
			
		}

	}

}