/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package exception;

import java.sql.SQLException;

/**
 *
 * @author muska
 */
public class StudentException extends Exception{
  public StudentException() {
        super();
    }

    public StudentException(String msg) {
        super(msg);
    }   

    public StudentException(String string, SQLException e) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
}
