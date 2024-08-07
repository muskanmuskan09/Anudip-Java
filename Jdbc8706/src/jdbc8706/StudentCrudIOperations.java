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
import java.sql.PreparedStatement;
import java.sql.SQLException;

//import jdbc8706.utility.ConnectionFactory;

public class StudentCrudIOperations {
        Connection con  = null  ;
	PreparedStatement  ppst   = null  ;
        
        public Connection  doSimple() {
		Connection connection = null;
		try {
			connection = ConnectionFactory.getConnectionFactory().getConnection();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
     return connection ;

	}
	
	
	
	// crud  - create , read   , update  , delete 
	public void addStudent(Student s ) {
		
		try {
			Connection c  = ConnectionFactory.getConnectionFactory().getConnection() ;
			PreparedStatement ppst  = c.prepareStatement("insert into student1 values(?, ? ,?)") ;
			ppst.setInt(1, s.getStudent_id());
			ppst.setString(2, s.getStudent_name()) ;
			ppst.setInt(3,  s.getStudent_marks()) ;
			
			int ans  = ppst.executeUpdate() ; // one row mai data  insert huva hai 
			
			if (ans != 0) {
				System.out.println("data got inserted succesfully ");
			}else {
				System.out.println("some thing went wrong");
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		}
        public void updateData(Student s) {
		
		
		try {
			con= doSimple() ;
			ppst  =  con.prepareStatement("update Student1 set smarks  = ? where  sid =  ? " );
			ppst.setInt(1, s.getStudent_marks());
			ppst.setInt(2, s.getStudent_id());
                        int ans = ppst.executeUpdate() ;
	        if (ans != 0) {
				System.out.println("data got updated succesfully ");
			}else {
				System.out.println("some thing went wrong");
			}
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}finally {
			
			try {
				if (ppst !=  null) {
					ppst.close();

				}
				if (con != null) {
					con.close();
				}
				
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			
		}

		
	}
	   
       public void deleteStudent(Student s) {
        try {
            con = doSimple();
            ppst = con.prepareStatement("DELETE FROM student1 WHERE sid = ?");
            ppst.setInt(1, s.getStudent_id());

            int ans = ppst.executeUpdate();
            if (ans != 0) {
                System.out.println("Data deleted successfully.");
            } else {
                System.out.println("No data found to delete.");
            }
        } catch (SQLException e) {
            e.printStackTrace();
        } finally {
            try {
                if (ppst != null) {
                    ppst.close();
                }
                if (con != null) {
                    con.close();
                }
            } catch (SQLException e) {
                e.printStackTrace();
            }
        }
    }


	
	public static void main(String[] args) {
		
		StudentCrudIOperations s  = new StudentCrudIOperations ()  ;
		
		s.addStudent(new Student(346 , "Komal", 740) );
                s.addStudent(new Student(347 , "Priyanshi", 750) );
                s.addStudent(new Student(348 , "Honey", 755) );
                
	}
}