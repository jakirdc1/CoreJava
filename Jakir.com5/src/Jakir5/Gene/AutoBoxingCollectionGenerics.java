
package Jakir5.Gene;

import java.util.ArrayList;

public class AutoBoxingCollectionGenerics {
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<Integer>();
        list .add(0, 5);
        list .add(1, 4);
        list.add(2,9);
         list.add(3,9);
        int ip = list.get(3);
        System.out.println("This result : "+ ip);
        System.out.println("........Two in one...............");
      System.out.println("IP:  "+list);// list hole sob print korbe
    }
  
}
