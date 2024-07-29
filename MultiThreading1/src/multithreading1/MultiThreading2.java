/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

// Question : Write a Java program that creates a thread that is doing 
//sum of  numbers from 1 to 100, and then joins the thread to ensure that the main thread waits for the thread
//to finish execution before printing a message. and sum


package multithreading1; //package 

/**
 *
 * @author muska
 */
class MultiThreading implements Runnable{
    int sum=0; //Intialization of variable, sum equals to 0
    @Override
   public void run(){
       
        for(int i=0;i<=100;i++){  //Loop to calculate the sum of numbers from 0 to 100
            sum+=i;
        } 
    }
}
//Main class
public class MultiThreading2{
    public static void main(String[] args){
        
        MultiThreading obj=new MultiThreading();
        Thread t1 = new Thread(obj);
        t1.start(); // Method to strt the thread
        try{
            t1.join();
        }catch(InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println(obj.sum);//Print the sum
        System.out.println("Thanks for implementing the MultiThreading code"); //Print a message after the thread has finished execution
        
        
    }
    
}
