/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package jdbc8706;

/**
 *
 * @author muska
 */
public class Singleton {
    private static Singleton instance;
    
    private Singleton(){
        
    }
    public static Singleton getInstance(){
        if(instance ==null){
            instance =new Singleton();
        }
        return instance;
    }
    public static void main(String[] agrs){
        Singleton s1=new Singleton();
        Singleton s2=new Singleton();
        
        System.out.println(s1.hashCode());
        System.out.println(s2.hashCode());
        
    }
    
    
}
