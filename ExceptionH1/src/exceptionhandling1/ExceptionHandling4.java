/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package exceptionhandling1;
import java.util.Scanner;
/**
 *
 * @author muska
 */

class InvalidEmailException extends Exception {
    public InvalidEmailException(String message) {
        super(message);
    }
}

public class ExceptionHandling4 {
    private String email;

    public ExceptionHandling4(String email) throws InvalidEmailException {
        if (!isValidEmail(email)) {
            throw new InvalidEmailException("Invalid email address: " + email);
        }
        this.email = email;
    }

    private boolean isValidEmail(String email) {
        return email != null && email.contains("@");
    }

    public String getEmail() {
        return email;
    }

    public static void main(String[] args) {
        try {
            ExceptionHandling4 user1 = new ExceptionHandling4("mskancse892@example.com"); // Valid email
            System.out.println("User created with email: " + user1.getEmail());
            System.out.println();
            
          
            ExceptionHandling4 user2 = new ExceptionHandling4("muskan.email.com"); // Invalid email
            System.out.println("User created with email: " + user2.getEmail());
        } catch (InvalidEmailException e) {
            System.out.println("Error : " + e.getMessage());
        }
    }
}
