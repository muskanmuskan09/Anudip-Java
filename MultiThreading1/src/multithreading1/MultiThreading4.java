/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package multithreading1;
/**
 *
 * @author muska
 */
public class MultiThreading4 implements Runnable {
    @Override
    public void run(){ 
for(int i=0;i<25;i++){ 
String tname=Thread.currentThread().getName(); 
System.out.println(tname +": is running"); 
} 
} 
public static void main(String[] args){ 
MultiThreading4 job=new MultiThreading4(); 
Thread one=new Thread(job); 
Thread two=new Thread(job); 
one.setName("Dhoni thread.."); 
two.setName("Kohli thread.."); 
one.start(); 
two.start();
}
    
}
