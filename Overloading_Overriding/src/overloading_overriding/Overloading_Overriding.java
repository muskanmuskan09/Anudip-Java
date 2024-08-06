/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package overloading_overriding;

/**
 *
 * @author muska
 */
/**
 * Example class demonstrating method overloading with static methods.
 * The methods in this class perform addition operations.
 * Static methods belong to the class and can be called without creating an instance of the class.
 * They are used here for utility purposes since they do not depend on any instance variables.
 */

class Overloading_Overriding {

    /**
     * @param args the command line arguments
     */

    int sum(int a, int b){
        return a+b;
    }
     int sum(int a,int b, int c){
        return a+b+c;
    }
     int sum(){
        System.out.println("You havn't given any number fro addition");
        return 0;
    }
    
    public static void main(String[] args) {
        // TODO code application logic here
        Overloading_Overriding obj=new Overloading_Overriding();
        Overriding obj2=new Overriding();
        
            System.out.println("The sum is : "+obj.sum(12,4));
            System.out.println("The sum is : "+obj.sum(12,4,7));
            System.out.println("The sum is : "+obj.sum());
            
            
            System.out.println("The sum is : "+obj2.sum(17,84));
            System.out.println("The sum is : "+obj2.sum(12,48,97));
            System.out.println("The sum is : "+obj2.sum());
            

        
    }
    
}
