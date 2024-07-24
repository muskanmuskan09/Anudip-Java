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
public class HashMap4 {
    public static void main(String[] args){
        char[] chars = {'a', 'b', 'a', 'c', 'b', 'a', 'b'};
        
        Map<Character,Integer> mp=new HashMap<>();
        for(Character c: chars){
        if(mp.containsKey(c)){
            mp.put(c,mp.get(c)+1);
        }else{
            mp.put(c,1);
        }
    }
        for(Map.Entry<Character,Integer> ee : mp.entrySet()){
        System.out.println(ee.getKey()+" -------->"+ee.getValue());
    }
        

    }
}
