/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package multithreading1;

/**
 *
 * @author muska
 */


class Test extends Thread {
    int num = 0;

    @Override
    public void run() {
        synchronized (this) {
            System.out.println("child thread performing calculation");
            for (int i = 0; i <= 100; i++) {
                num = num + i;
            }
            System.out.println("child thread giving the notification");
            this.notify();
        }
    }
}

public class MultiThreading1 {
    public static void main(String[] args) throws Exception {
        Test mt = new Test();
        mt.start();
        synchronized (mt) {
            System.out.println("main thread calls the wait method");
            mt.wait(); 
            System.out.println("main thread got the notification");
            System.out.println(mt.num);
        }
    }
}
