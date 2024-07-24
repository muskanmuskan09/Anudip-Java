/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package HashMap1;
import java.util.*;
/**
 *
 * @author muska
 Question: there is array of string and you to have find frequency of each word  
[apple ,banana,  banana , orange , banana , apple, orange ]
output 
apple  - 2
banana - 3 
orange  - 2
 * 
 */
public class HashMap2 {
    
    public static void main(String[] args){
        String[] s = {"apple", "banana", "banana", "orange", "banana", "apple", "orange"};
        Map<String, Integer> hm=new HashMap<>();
        
        for(String Fruits :s){
            
          if(hm.containsKey(Fruits)){
              hm.put(Fruits, hm.get(Fruits)+1);
           }else{
              hm.put(Fruits, 1);
            }
            
//            hm.put(Fruits, hm.getOrDefault(Fruits,0)+1);  
//We can use this Line of Code,  Instead of if else statememt
        }
        
        for(Map.Entry<String,Integer> e:hm.entrySet()){
            System.out.println(e.getKey()+"--->"+e.getValue()+"  ");
        }
        
    }
    
}
