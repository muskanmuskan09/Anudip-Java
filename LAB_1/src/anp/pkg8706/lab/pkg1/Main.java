/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package anp.pkg8706.lab.pkg1;

/**
 *
 * @author muska
 */
public class Main {
    public static void main(String[] args) {
        SmartPhone object1=new SmartPhone("Motorola","g54 Ultra","halogen","40");
        object1.deviceInformation();
        object1.powerON();
        object1.displayInformation();
        object1.takePhoto();
        object1.powerOFF();
        
    }
}
//            Output:
//The model of the device is g54 Ultra
//The Brand of the device is Motorola
//The Operating system of the smartphone is halogen
//The Camera Resolution of the Smartphone is 40
//The camera is taking photo with 40px
//The Power of the Device is  now OFF