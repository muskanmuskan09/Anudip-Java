/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package lab;

/**
 *
 * @author muska
 */
class Sleep_Method implements Runnable{
    @Override
   public void run(){ //Override the run method
       try{
           for (int i = 1; i <= 10; i++) {
                System.out.println(i);
                
                Thread.sleep(500); // Sleep for 500ms
           }
           
       }catch(Exception e){
           System.out.println(e.getMessage()); //to get the msg of Exception
           
       }
   }
       }  

//Main class to create and start the thread
class MultiThreading {
    public static void main(String[] args){
        Sleep_Method obj= new Sleep_Method();  // Create an instance of Sleep_Method class
        Thread thread=new Thread(obj);  // Create a new thread thread with obj
        thread.start(); // start thread
        
    }
    
}
//output:
/*
1
2
3
4
5
6
7
8
9
10
*/

