/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package jdbc8706;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
/**
 *
 * @author muska
 */
public class Jdbc8706 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        try {
			Class.forName("com.mysql.cj.jdbc.Driver");
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	
		//step 2  
		//Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/"apke database ka naam ", "Username", "Password") ;

		try {
			Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/anp8706", "root", "WJ28@krhps") ;
			
			// step 3 	
			Statement st  = 	con.createStatement();
			// step 4  
//			ResultSet  rs  = st.executeQuery("select * from Student") ;
			ResultSet  rs  = st.executeQuery("select * from employee where emp_name like 'p%' ") ;

			
			while(rs.next()) {
				System.out.println(   "student "+ rs.getInt(1) +" " +rs.getString(2 )+" " +rs.getInt(3) );
			}
			
			con.close();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
    }
    
}


