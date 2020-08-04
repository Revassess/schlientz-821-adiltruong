package com.revature.config;

import java.sql.CallableStatement;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;

/**
 * 
 * @author Revature
 *
 *         This is a paceholder class to hold the configurations of your db
 *         connection. You should change the url, username, and password. DO NOT
 *         CHANGE THE MODIFIERS OR THE NAMES OF THE VARIABLES. These are used to
 *         test your db schema.
 */
public class ConnectionUtil {
	//for singleton instance
	private static ConnectionUtil cu = null;
	
	// add your jdbc url
	public static final String URL = "jdbc:oracle:thin:@database-1.cgsugevvsd7s.us-east-2.rds.amazonaws.com:1521:ORCL";
	// add your jdbc username
	public static final String USERNAME = "adil";
	// add your jdbc password
	public static final String PASSWORD = "Revature1";
	// name of the created stored procedure in tier 3
	public static final String TIER_3_PROCEDURE_NAME = "";
	// name of the created sequence in tier 3
	public static final String TIER_3_SEQUENCE_NAME = "";

	// implement this method to connect to the db and return the connection object
	public Connection connect(){
		try {
			if (cu == null) {
				Class.forName("oracle.jdbc.driver.OracleDriver");
				cu = (ConnectionUtil) DriverManager.getConnection(URL, USERNAME, PASSWORD);
				return (Connection) cu;
			}
			
			else {
				return (Connection) cu;
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
		return null;
	}


	//implement this method with a callable statement that calls the absolute value sql function
	public long callAbsoluteValueFunction(long value){
		String sql = "CALL ABS(?)";
		CallableStatement cs = cu.prepareCall(sql);
		cs.setString(1, Long.toString(value));
		ResultSet rs = cs.executeQuery();

		if (rs.next) {
			return rs.getInt("0");
		}
		return 0;
	}
	

	//make the class into a singleton
	private ConnectionUtil(){
		super();
	}

	public static ConnectionUtil getInstance(){
		if(cu == null){
			cu = new ConnectionUtil();
		}
		return cu;
	}
}
