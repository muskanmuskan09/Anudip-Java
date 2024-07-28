/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package lab_2;

/**
 *
 * @author muska
 */

class InvalidEmailException extends Exception {
    public InvalidEmailException(String message) {
        super(message);
    }
}

public class User {
    private String email;

    public User(String email) throws InvalidEmailException {
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
            User user1 = new User("mskancse892@example.com"); // Valid email
            System.out.println("User created with email: " + user1.getEmail());
            System.out.println();
            
          
            User user2 = new User("muskan.email.com"); // Invalid email
            System.out.println("User created with email: " + user2.getEmail());
        } catch (InvalidEmailException e) {
            System.out.println("Error : " + e.getMessage());
        }
    }
}
//               ouput:

//User created with email: mskancse892@example.com
//Error : Invalid email address: muskan.email.com