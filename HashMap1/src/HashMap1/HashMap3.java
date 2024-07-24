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
public class HashMap3 {
    public static void main(String[] args){
        int[] numbers = {1, 2, 2, 3, 3,4,5,6,5,5,6,6,6,6,3,4, 3, 4, 4, 4, 4};
       HashMap<Integer, Integer> mp=new HashMap<>();
        
        for(Integer s : numbers){
            if(mp.containsKey(s)){
                mp.put(s, mp.get(s)+1); 
            }else{
                mp.put(s,1);
            }
        }
        
        for(Map.Entry<Integer, Integer> ee: mp.entrySet()){
        System.out.println(ee.getKey()+" -----> "+ee.getValue());
    }
        
        

    }
    
}
