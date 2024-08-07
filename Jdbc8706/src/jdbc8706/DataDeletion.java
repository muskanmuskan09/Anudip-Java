/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package jdbc8706;

/**
 *
 * @author muska
 */
public class DataDeletion {
    
    public static void main(String[] args) {
		
		
	StudentCrudIOperations s  = new StudentCrudIOperations ()  ;
		
		s.deleteStudent(new Student (348 , "Honey", 755));
	}
}
