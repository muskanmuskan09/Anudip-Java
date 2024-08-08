/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Main;

/**
 *
 * @author muska
 */
import DaoSample.StudentDaoSample;
import exception.StudentException;
import model.Student;

public class StudentMain {

    static StudentDaoSample dao = new StudentDaoSample();

    public static void main(String[] args) {

		try {
//			String s  =dao.addStudent(new Student(4545  , "Rajaji" , 6000)) ;
//                       String s  =dao.updteStudent(new Student(12  , "Muskan" , 789)) ;
                         String s=dao.deleteStudent(1);
                         System.out.println(s);
                        

//			System.out.println(dao); 
		} catch (StudentException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
//        try {
//            String result = dao.deleteStudent(348); // Pass the student ID
//            System.out.println(result);
//
//            // Uncomment these lines if you want to test other methods
//            // String s = dao.addStudent(new Student(4545, "Rajaji", 6000));
//            // String s = dao.updateStudent(new Student(12, "Muskan", 779));
//            // System.out.println(s);
//        } catch (StudentException e) {
//            e.printStackTrace();
//        }

    }

}
