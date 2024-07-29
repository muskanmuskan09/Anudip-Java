/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package multithreading1;

/**
 *
 * @author muska
 */
class Common {
    public void fun1(String name) {
        for (int i = 1; i <= 5; i++) {
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            System.out.println(name + ": " + i);
        }
    }
}
 class ThreadA extends Thread{ 
 
 Common c; 
 String name; 
  
 public ThreadA(Common c,String name) { 
  this.c=c; 
  this.name=name; 
 } 
  
 @Override 
 public void run() { 
  c.fun1(name); 
 }  
} 
 
 class ThreadB extends Thread{ 
 
 Common c; 
 String name; 
  
 public ThreadB(Common c,String name) { 
  this.c=c; 
  this.name=name; 
 } 
  
 @Override 
 public void run() { 
  c.fun1(name); 
 }  
} 
 
class Main{ 
 
 public static void main(String[] args){ 
 
  Common c=new Common(); 
   
  //sharing same Common object to two thread 
  ThreadA t1=new ThreadA(c,"Ram"); 
  ThreadB t2=new ThreadB(c,"Shyam"); 
  
  t1.start();
  t2.start();
 }
}

 //---------------------Output---------------------------------------------
 /*
                         Ram: 1
                        Shyam: 1
                         Ram: 2
                         Shyam: 2
                          Ram: 3
                         Shyam: 3
                         Shyam: 4
                         Ram: 4
                         Shyam: 5
                         Ram: 5  (it can be vary)
 */
 
 
/*
The provided code demonstrates a multi-threaded scenario where two threads (ThreadA and ThreadB) execute the fun1() method of a
shared Common object. The potential problem with this setup is a race condition due to the lack of synchronization in the 
fun1() method. Here’s a brief explanation of the issues:
Potential Problems

-----------Race Condition:-------------------------------

Definition: A race condition occurs when multiple threads access shared resources concurrently and the final outcome depends on the 
timing of their execution.

In Your Code: Both ThreadA and ThreadB access the fun1() method of the same Common instance (c). Since fun1() is not synchronized, 
both threads can execute the method simultaneously, leading to interleaved output.

Problem: Because fun1() is not synchronized, the System.out.println(name + ": " + i); statement can be executed by both threads at the
same time. This results in mixed and interleaved output, making it difficult to predict the order in which the numbers will be printed.


Lack of Thread Safety:
Issue: Without synchronization, the method is not thread-safe. Multiple threads accessing and modifying the shared resource
(Common object) concurrently can lead to unpredictable behavior and inconsistencies.
*/