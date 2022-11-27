package oopWithNLayeredApp.core.logging;

public class FileLogger implements Logger {

	@Override
	public void log(String data) {
		System.out.println("The data" + data + "has been logged to the file.");

	}

}
