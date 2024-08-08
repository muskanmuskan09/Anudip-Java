/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package Dao;

/**
 *
 * @author muska
 */
import java.util.List;

import exception.StudentException;
import model.Student;

public interface StudentDao {

    public String addStudent(Student s) throws StudentException;

    public String updteStudent(Student s) throws StudentException;

    public String deleteStudent(int studentId) throws StudentException;

    public List<Student> getAllstudent() throws StudentException;

    public Student getSingleStudentbyID() throws StudentException;

}
