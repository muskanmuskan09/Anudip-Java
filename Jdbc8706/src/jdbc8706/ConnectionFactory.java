/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package jdbc8706;

/**
 *
 * @author muska
 */
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class ConnectionFactory  {
 
	// singleton class 
	
	
	 String url  = "jdbc:mysql://localhost:3306/anp8706";
	 String dbname  = "root" ;
	 String dbpass  = "WJ28@krhps" ;
		
	private ConnectionFactory() {
		try {
		Class.forName("com.mysql.cj.jdbc.Driver");
		} catch (ClassNotFoundException e) {
		e.printStackTrace();
		}
		}
	
	
	
	
	private static ConnectionFactory  connectionFactory = null  ;
	
	
	
	

	public static ConnectionFactory getConnectionFactory() {
		if ( connectionFactory  ==  null) {
			
			 connectionFactory   = new  ConnectionFactory() ;
			 
		}
		return connectionFactory ;
	}
	
	
	// method to get connection from this singleton class 
	
	
	
	public Connection getConnection() throws SQLException {
		
		Connection con = DriverManager.getConnection(url, dbname, dbpass) ;
		
                    
		return con  ;
		
	}
	
	
	

}
