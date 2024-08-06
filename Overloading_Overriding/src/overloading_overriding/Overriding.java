/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package overloading_overriding;

/**
 *
 * @author muska
 */
public class Overriding extends Overloading_Overriding{
    @Override
    public int sum(int a, int b){
        return a+b;
    }
    @Override
    public int sum(int a, int b,int c){
        return a+b+c;
    }
    @Override
    public int sum(){
        return 0;
    }
    
}
/*   ----METHOD OVERLOADING----                                                 -----METHOD OVERRIDING
Method overloading is used to increase the readability of the program.  ||  Method overriding is used to provide the specific implementation of the method that is already provided by its super class.
2)Method overloading is performed within class.                         ||  Method overriding occurs in two classes that have IS-A (inheritance) relationship.
3)In case of method overloading, parameter must be different.           || In case of method overriding, parameter must be same.
4)Method overloading is the example of compile time polymorphism.       || Method overriding is the example of run time polymorphism.
5)In java, method overloading can't be performed by changing            || Return type can be same or different in method overloading. But you must have to change the parameter.
return type of the method only.                                         ||   Return type must be same or covariant in method overriding.
*/