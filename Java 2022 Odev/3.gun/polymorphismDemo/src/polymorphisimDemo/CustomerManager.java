package polymorphisimDemo;

public class CustomerManager {
	private BaseLogger _baseLogger;
	
	public  CustomerManager(BaseLogger baseLogger) {
		_baseLogger = baseLogger;
	}
	
	public void add() {
		System.out.println("Musteri Eklendi");
		_baseLogger.log("Log Mesaji");
	}
}
