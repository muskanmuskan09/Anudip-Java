/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package inheritance;

/**
Hierarchical inheritance is a type of inheritance in which 
a single parent class is inherited by multiple child classes.
This allows the child classes to share the common properties and methods of the parent class.
 
 Create a class Shape with a method area() that returns 0. 
 Create two subclasses Circle and Rectangle that extend Shape 
 and implement their own area() methods. 
 */
public class Shape {
    int Area(int a, int b){
        return 0;
    }
    int Area (int a){
        return 0;
    }
    public static void main(String[] args){
        Shape s=new Rectangle();
        System.out.println("Area of Rectangle: " + s.Area(5, 2));
        Shape c=new Circle();
        System.out.println("Area of Rectangle: " +c.Area(7));
    }
    
}
