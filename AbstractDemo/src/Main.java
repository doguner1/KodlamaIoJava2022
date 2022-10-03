
public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		CustomerManager customerManager = new CustomerManager();
		customerManager.getCustomers(new SqlServerDatabaseManager());

		BaseDatabaseManager baseDatabaseManager = new OracleDatabaseManager();
		baseDatabaseManager.getData();
	}

}
