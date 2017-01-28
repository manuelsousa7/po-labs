public class DatabaseConnection {
	private static DatabaseConnection _instance = new DatabaseConnection();
  // ...
  // creates a connection to a relational dataabse system
  private DatabaseConnection() {
    // code for initializing state of this object
    // and establishing a connection with the database server
    System.out.println("Connected");
  }
  //public ResultSet executeQuery(String sqlQuery) {
    // executes the query and returns the answer
  //}
  public static DatabaseConnection getInstance(){
  	return _instance;
  }
}