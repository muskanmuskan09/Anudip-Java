/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package DaoSample;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.List;
import exception.StudentException;
import model.Student;
import Dao.StudentDao;
import java.util.ArrayList;
import java.sql.ResultSet;

import utility.Dao;

/**
 *
 * @author muska
 */
public class StudentDaoSample implements StudentDao {

    Connection con = null;
    PreparedStatement ppst = null;

    public Connection doSimple() {
        Connection connection = null;
        try {
            connection = Dao.getConnectionFactory().getConnection();
        } catch (SQLException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
        return connection;

    }

    @Override
    public String addStudent(Student s) throws StudentException {

        // TODO Auto-generated method stub
        String msg = null;

        con = doSimple();
        try {
            ppst = con.prepareStatement("insert into student values (?,?,? )");
            ppst.setInt(1, s.getStudent_id());
            ppst.setString(2, s.getStudent_name());
            ppst.setInt(3, s.getStudent_marks());

            int ans = ppst.executeUpdate();

            if (ans != 0) {
                msg = "student inserted successfully";

            } else {

            }

        } catch (SQLException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }

        return msg;
    }

    @Override
    public String updteStudent(Student s) throws StudentException {
        // TODO Auto-generated method stub
        String msg = null;
        con = doSimple();
        try {
			con= doSimple() ;
			ppst  =  con.prepareStatement("update Student set smarks  = ? where  sid =  ? " );
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
        return msg;

//        return null;
    }

    @Override
    public String deleteStudent(int studentId) throws StudentException {
    String msg = "No data found to delete.";

    con = doSimple();
    try {
        ppst = con.prepareStatement("DELETE FROM student WHERE sid = ?");
        ppst.setInt(1, studentId);

        int ans = ppst.executeUpdate();
        if (ans != 0) {
            msg = "Student deleted successfully";
        }
    } catch (SQLException e) {
        throw new StudentException("Error deleting student with ID: " + studentId, e);
    } finally {
        try {
            if (ppst != null) {
                ppst.close();
            }
            if (con != null) {
                con.close();
            }
        } catch (SQLException e) {
            e.printStackTrace(); // Ideally use logging instead of printStackTrace
        }
    }
    return msg;
}

        
        
//        try {
//            System.out.println("hello");
//            ppst = con.prepareStatement("DELETE FROM student WHERE sid = ?");
//            
//            
//            ppst.setInt(1, studentId);
//         
//            int ans = ppst.executeUpdate();
//            System.out.println("hello");
//
//            if (ans != 0) {
//                msg = "student deleted successfully";
//
//            } else {
//
//            }
//            System.out.println("hello");
//
//        } catch (SQLException e) {
//            // TODO Auto-generated catch block
//            e.printStackTrace();
//        }
//
//        return msg;
////        return null;
//    }

    @Override
    public List<Student> getAllstudent() throws StudentException {
        // TODO Auto-generated method stub
        
        return null;
    }

    @Override
    public Student getSingleStudentbyID() throws StudentException {
        // TODO Auto-generated method stub
        return null;
    }

}
