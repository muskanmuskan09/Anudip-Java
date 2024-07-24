/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */

package HashMap1;
import java.util.*;

/**
 *
 * @author muska
 */
public class HashMap1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        HashMap<String, Integer> mp=new HashMap<>();
        TreeMap<String, Integer> m= new TreeMap<>();
        mp.put("Muskan", 892);
        mp.put("Komal",872);
        mp.put("Mehak", 885);
        
        for(Map.Entry<String, Integer> ee:mp.entrySet()){
        System.out.println(ee.getKey()+"--->"+ee.getValue()+"  ");
            }
        
        
        m.put("Muskan Saini ", 892);
        m.put("Komalpreet",872);
        m.put("Mehakpreet", 885);
        System.out.println("--------------");
        for(Map.Entry<String,Integer> e:m.entrySet()){
            System.out.println(e.getKey()+"--->"+e.getValue()+"  ");
        }
        
        
        
    }
        
    }
    

