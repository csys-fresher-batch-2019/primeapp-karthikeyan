package connection;

import java.sql.Connection;
import java.sql.DriverManager;


public class TestConnection {

	public static Connection getConnection()  throws Exception{
		Class.forName("oracle.jdbc.driver.OracleDriver");
		Connection connection = DriverManager.getConnection("jdbc:oracle:thin:@LocalHost:1521:XE","system","oracle");
		return connection;
	}

}
