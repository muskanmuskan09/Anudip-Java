/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
// Question : Write a Java program that takes a list of strings as input and
//stores them in a TreeSet. Then, print the elements in alphabetical order.

package treeset1; //package
import java.util.Scanner;
import java.util.TreeSet;
/**
 *
 * @author muska
 */
//Main class
public class TreeSet1 {

    /**
     * @param args the command line arguments
     */
    
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a list of strings: ");
        String input = scanner.nextLine(); //takes input as list for eg.: banana apple banana orange 

       
        TreeSet<String> treeSet = new TreeSet<>();
        String[] strings = input.split(" "); //Split the list using split method 
        
        for (String s : strings) { //loop for traversal
            treeSet.add(s);
        }

       
        System.out.println(treeSet); // output: apple banana orange
        
        
    }
    
}
