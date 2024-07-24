/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package exceptionhandling1;

/**
 *
 * @author muska
 */
class UserDefinedException extends Exception{
   public UserDefinedException(String str){
        super(str);
    }
}
public class ExceptionHandling3 {
    
    public static void main(String[] agrs){
    
        try{
            throw new UserDefinedException("This is user exception");
        }catch(Exception e){
            System.out.println("Caught the exception");
            System.out.println(e.getMessage());
        }
}
    
}
