package abstractDemo;

public class CustomerManager {
	
	BaseDatabaseManager databaseManager;
	
	public void GetCustomers() {
		 databaseManager.GetData();
	}
}
