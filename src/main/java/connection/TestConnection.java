package connection;

import java.sql.Connection;
import java.sql.DriverManager;

import exception.DbException;
import exception.InfoMessages;
import logger.Logger;


public class TestConnection {

	public static Connection getConnection()  throws DbException{
		Logger logger = new Logger();
		try {
			Class.forName("oracle.jdbc.driver.OracleDriver");
		Connection connection = DriverManager.getConnection("jdbc:oracle:thin:@LocalHost:1521:XE","system","oracle");
		return connection;
		}
		catch(Exception e)
		{
			logger.info(InfoMessages.CONNECTION);
		}
		return null;
	}

}
