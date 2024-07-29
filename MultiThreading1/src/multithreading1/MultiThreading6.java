/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/*
Suspending a Thread
Once the run() method is handed over to the thread scheduler, sometimes it is necessary to control the execution of the thread. 
The Thread class provides methods to gain partial control over the execution of the run() method that has already 
been scheduled by the thread scheduler. A thread under execution can be suspended or its execution controlled based on three criteria:

---------------------Time-Based Suspension:-----------
Use sleep(long millis) to pause the thread for a specified time.
Example:
Thread.sleep(1000); // Suspends the thread for 1 second

--------------------Conditional Suspension:--------------
Use synchronization and wait(), notify(), and notifyAll() methods to control thread execution based on specific conditions.
Example:
java
Copy code
synchronized(obj) {
    while (condition) {
        obj.wait();
    }
}

--------------Unconditional Suspension:--------------------------
Use the deprecated methods suspend() and resume(), though they are not recommended due to potential deadlocks and other issues.
Example:
java
Copy code
thread.suspend(); // Suspends the thread indefinitely
thread.resume();  // Resumes the thread
Controlling thread execution allows for better management of resources and coordination between threads. However, using deprecated methods like suspend() and resume() should be avoided in favor of more modern and safer techniques like wait() and notify().
*/
package multithreading1;

/**
 *
 * @author muska
 */
class MultiThreading6 implements Runnable { 
@Override 
public void run() { 
    for (int i = 0; i < 5; i++) { 
        System.out.println("inside run " + i); 
        try { 
            Thread.sleep(1000); 
        } catch (InterruptedException e) {
            e.printStackTrace(); 
        } 
    } 
System.out.println("end of run()..."); 
} 
public static void main(String[] args) { 
MultiThreading6 job = new MultiThreading6(); 
Thread t1 = new Thread(job); 
t1.start(); 
System.out.println("end of main()..."); 
    }
}
