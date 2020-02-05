package Connection;

import java.sql.Connection;
import java.sql.DriverManager;


public class TestConnection {

	public static Connection getConnection()  throws Exception{
		Class.forName("oracle.jdbc.driver.OracleDriver");
		Connection connection = DriverManager.getConnection("jdbc:oracle:thin:@192.168.56.200:1521:XE","system","oracle");
		return connection;
	}

}
