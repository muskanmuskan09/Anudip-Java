/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package HashMap1;
import java.util.*;
/**
 *
 * @author muska
 */
public class HashMap6 {
    public static void main(String[] args){
        double[] numbers = {1.1, 2.2, 2.2, 3.3, 1.1, 4.4, 1.1};
        
        Map<Double,Integer> mp=new HashMap<>();
        for(Double d: numbers){
            if(mp.containsKey(d)){
                mp.put(d,mp.get(d)+1 );
            }else{
                mp.put(d,1);
            }
        }
        for(Map.Entry<Double,Integer> ee: mp.entrySet()){
            System.out.println(ee.getKey()+" ----->"+ee.getValue());
        }
        

    }
    
}
