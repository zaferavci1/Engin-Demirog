package polymorphisimDemo;

public class ConsoleLogger extends BaseLogger{
	public void log(String message) {
		System.out.println("Console to File: "+message);
	}
}
