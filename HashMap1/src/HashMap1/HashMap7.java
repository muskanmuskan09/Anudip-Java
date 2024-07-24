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
public class HashMap7 {
    public static void main(String[] args){
        String[] sentences = {"hello world", "hello", "world", "hello world", "world", "world"};
        Map<String,Integer> mp=new HashMap<>();
        for(String s: sentences){
            if(mp.containsKey(s)){
                 mp.put(s, mp.get(s)+1);
            }else{
                mp.put(s,1);
            }
        }
        for(Map.Entry<String,Integer> ee: mp.entrySet()){
            System.out.println(ee.getKey()+" ----->"+ee.getValue());


    }
    
}
}
