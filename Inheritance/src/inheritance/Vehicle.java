/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
/*
Mutilevel Inheritance:    A class is derived from another derived class.

Question: Create a class Vehicle with a method drive() that prints "The vehicle is driving".
Create a subclass Car that extends Vehicle and adds a method honk(). 
Create another subclass SportsCar that extends Car and overrides the drive() method 
to print "The sports car is racing".
*/


package inheritance;
public class Vehicle {
    void Drive(){
        System.out.println("The Vehicle is driving");
    }
    public static void main(String[] agrs){
//        Vehicle v=new Vehicle();
//        Car c= new Car();
        Vehicle sc=new SportsCar();
        sc.Drive();
        
    }
}
