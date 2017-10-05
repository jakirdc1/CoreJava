
package Jakir5.Gene;

import java.util.ArrayList;

public class TestGenerics {
    public static void main(String[] args) {
        ArrayList<String> list =  new ArrayList<String>();
        list.add("Jakir");
        list.add("Jony");
        list.add("Tony");
        list.add("Gui");
        //list.add(32);//compiler time error
        String s = list.get(3);//type casting is not required
        System.out.println("element is : "+s);
        for(String al : list){
           System.out.println(al);   
        
        }
    }
            
}
