/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package multithreading1;

/**
 *
 * @author muska
 */
class Main implements Runnable {
     
    int sum; 
    @Override 
    public void run() { 
for (int i = 0; i < 10; i++) { 
System.out.println("inside A thread"); 
sum = sum + i; 
} 
} 
} 
class MutliThreading7 { 
public static void main(String[] args) throws InterruptedException { 
    Main a1 = new Main(); 
    Thread t = new Thread(a1);
    t.start(); 
    //t.join();//Here main thread will wait until the t thread completes 
//if we comment t.join then we will get incorrect value. 
    int result = a1.sum; 
    for (int i = 0; i < 10; i++) { 
    System.out.println("inside main thread...."); 
    System.out.println(result); 
} 
} 

}
