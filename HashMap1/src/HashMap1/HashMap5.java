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
public class HashMap5 {
    public static void main(String[] args){
        List<String> words = Arrays.asList("dog", "cat", "dog", "fish", "cat", "dog");
        
        Map<String,Integer> mp=new HashMap<>();
        
        for(String s: words){
            if(mp.containsKey(s)){
                mp.put(s, mp.get(s)+1);
            }else{
                mp.put(s,1);
            }
        }
        for(Map.Entry<String,Integer> ee: mp.entrySet()){
            System.out.println(ee.getKey()+" ---->"+ee.getValue());
        }

    }
    
}
