
public class Main {

	public static void main(String[] args) {
		
		CreditUI creditUI= new CreditUI();
		creditUI.CreditCalculating(new TeacherCreditManager());
		//this wway any kind of credit manager type that extends base credit manager can be used.
		//which is a very practical way to use inheritence.
		creditUI.CreditCalculating(new AgricultureCreditManager());

	}

}
