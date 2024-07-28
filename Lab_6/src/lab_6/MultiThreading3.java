/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package lab_6;

/**
 *
 * @author muska
 */
class Thread1 implements Runnable{ 
    @Override
    public void run(){
        String threadName = Thread.currentThread().getName();

         // Loop to print numbers from 1 to 20
        for(int i=1;i<=20;i++){
            System.out.println(threadName + " :"+i);
        }
        
        
    }
}
class Thread2 implements Runnable{
    @Override
    public void run(){
        String threadName = Thread.currentThread().getName();

        // Loop to print numbers from 21 to 60
        for(int i=21;i<=60;i++){
            System.out.println(threadName +" :"+ i);
        }
    }
}

//Main class to create and start the threads
public class MultiThreading3 {
    public static void main(String[] args){
        Thread.currentThread().setName("Main Thread");

        // Create an instance of Thread1
        Thread1 obj1=new Thread1();
        Thread t1=new Thread(obj1);  // Create a new thread t1 with obj1 and set its name
        t1.setName("Muskan");


        
        // Create an instance of Thread2
        Thread2 obj2=new Thread2();
        Thread t2=new Thread(obj2);  // Create a new thread t2 with obj2 and set its name
        t2.setName("Komal");
        
        
        t1.start(); // Start Thread1

        try{
            t1.join();
        }catch(InterruptedException e){
            e.printStackTrace();
        }
        
        
        t2.start(); // Start Thread2

        try{
            t2.join();
        }catch(InterruptedException e){
            e.printStackTrace();
        }
        String threadName = Thread.currentThread().getName();

        // Loop to print numbers from 61 to 80
        for(int i=61;i<=80;i++){
            System.out.println(threadName +" :"+ i);
        }
        
        // Get the name of the current thread (main thread)
   
        
    }
    
}
