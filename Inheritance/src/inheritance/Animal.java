/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */

/*  Inheritance is a mechanism in object-oriented programming where a 
new class (subclass) derives properties and behaviors (methods) from an existing 
class (superclass), promoting code reuse and logical hierarchy.

Single inheritance:  A subclass inherits from one superclass.

Question : Create a class Animal with a method sound() that prints "The animal makes
a sound". Create a subclass Dog that extends Animal and overrides
the sound() method to print "The dog barks".
*/

package inheritance;


public class Animal {
    void Sound(){
        System.out.println("The animal makes a sound");
    }
    public static void main(String[] args) {
       Animal a=new Animal();
       a.Sound();
       Animal d=new Dog();
       d.Sound();
       
        
    }
    
}
