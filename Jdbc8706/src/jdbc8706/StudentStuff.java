/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package jdbc8706;

/**
 *
 * @author muska
 */
public class StudentStuff {
	
	public static void main(String[] args) {
		
		
	StudentCrudIOperations s  = new StudentCrudIOperations ()  ;
		
		s.updateData(new Student (1 , "Rahul Sharma" ,55));
	}

}
    

