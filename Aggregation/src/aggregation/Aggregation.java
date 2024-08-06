/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package aggregation;

/**
 *
 * @author muska
 */
class Address{
    String city,state,country;
    public Address(String city,String state, String country){
        this.city=city;
        this.state=state;
        this.country=country;
    }
}

public class Aggregation {

//    private final int id;

    /**
     * @param args the command line arguments
     */
    int id;
    String name;
    Address address;
     public Aggregation(int id,String name, Address address){
            this.id=id;
            this.name=name;
            this.address=address;
        }
     void display(){
         System.out.println("ID : "+id+" Name : "+name);
         System.out.println(address.city+" "+address.state+" "+address.country);
     }

    public static void main(String[] args) {
        // TODO code application logic here
        Address obj1=new Address("Amritsar", "Punjab","India");
        Address obj2=new Address("Mumbai","Maharashtra","India");
        
        Aggregation obj3=new Aggregation(892,"Muskan",obj1);
        Aggregation obj4=new Aggregation(893,"Manorma",obj2);
        
        obj3.display();
        obj4.display();
          
        
      }
    
}
/*
-----OUTPUT---------
ID : 892 Name : Muskan
Amritsar Punjab India
ID : 893 Name : Manorma
Mumbai Maharashtra India
BUILD SUCCESSFUL (total time: 2 seconds)

*/