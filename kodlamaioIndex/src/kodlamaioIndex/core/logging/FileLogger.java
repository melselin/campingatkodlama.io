package kodlamaioIndex.core.logging;

public class FileLogger implements Logger {

	@Override
	public void log(String data) {
		System.out.println(data+" has logged to the file.");
		
	}

}
