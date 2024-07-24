/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package exceptionhandling1;

/**
 *
 * @author muska
 */
public class ExceptionHandling1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        try{
            int a=110/0;
        }catch(Exception e){
            System.out.println(e);
            
        }
    }
    
}
