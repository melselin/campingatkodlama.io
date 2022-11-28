package kodlamaioIndex.core.logging;

public class MailLogger implements Logger{

	@Override
	public void log(String data) {
		System.out.println(data+" has logged to the mail.");
		
	}
	

}
