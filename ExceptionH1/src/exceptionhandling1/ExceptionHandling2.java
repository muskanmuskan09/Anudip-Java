/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package exceptionhandling1;

/**
 *
 * @author muska
 */
public class ExceptionHandling2 {
   public static void InvalidAge(int age){
        
        if(age<18){
//             System.out.println("Thankyou!");
            throw new ArithmeticException("You are not allowed to vote");
//            System.out.println("Thankyou!");
        }else{
            System.out.println(("You are allowed to vote"));
    }
    }
    public static void main(String args[]){
        try{
//            InvalidAge(12);
            InvalidAge(22);
        }catch(Exception e){
            System.out.println("Sorry Try again");
        }
       
       System.out.println("Thankyou for coming");
        
    }
    
}
