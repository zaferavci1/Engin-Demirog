package polymorphisimDemo;

import java.io.File;

public class Main {

	public static void main(String[] args) {
//		BaseLogger[] loggers = new BaseLogger[] { new FileLogger(), new DataBaseLogger(), new EmailLogger(), new ConsoleLogger };
//		for (BaseLogger logger : loggers) {
//			logger.Log("Log Mesaji");
//		}
		CustomerManager customerManager = new CustomerManager(new FileLogger());
		customerManager.add();
	}

}
