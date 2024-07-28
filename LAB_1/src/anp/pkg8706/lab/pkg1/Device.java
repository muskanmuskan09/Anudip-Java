/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package anp.pkg8706.lab.pkg1;

/**
 *
 * @author muska
 */
public class Device {
   String brand;
   String model;
   Boolean power;
   Device(String brand,String model){
       this.brand=brand;
       this.model=model;
       this.power=false;
   }
    
   public void deviceInformation(){
       System.out.println("The model of the device is "+model);
       System.out.println("The Brand of the device is "+brand);
   }
   public void powerON(){
       if(!power){
           power=true;
       System.out.println("The Power of the Device is now ON");
       }
       else{
           System.out.println("The power of device is already ON");
       }
   }
   public void powerOFF(){
       if(power){
           power=false;
       System.out.println("The Power of the Device is  now OFF");
       }
       else{
           System.out.println("The Power of the Device is already OFF");
       }
   }
    
}
