
package collectionss.sets;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;



public class ListExample {
   public static void main(String[] args) {
        List list = new ArrayList();
        list.add("one");
        list.add("second");
        list.add("3rd");
        list.add("new Integer(4)");
        list.add("new Float(5.0F)");
         list.add("second");//duplicate, is added
          list.add("new Integer(4)");//duplicate, is added
    
         // System.out.println("list is:" +list);
          System.out.println(list);
    }
  
}