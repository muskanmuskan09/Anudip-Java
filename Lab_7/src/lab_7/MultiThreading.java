/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package lab_7;

/**
 *
 * @author muska
 */
class NumberPrint implements Runnable {
    @Override
     public void run(){
        for(int i=0;i<=4;i++){
            System.out.println(i);
        }
    }
   
}
class MultiThreading {
    public static void main(String[] args){
        NumberPrint obj= new NumberPrint();
        Thread thread=new Thread(obj);
//        thread.start();
        System.out.println("Thankyou");
    }
}
