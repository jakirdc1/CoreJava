
package Generics.Java238;

import java.util.ArrayList;
import static java.util.Collections.list;
import java.util.Iterator;
import java.util.List;

public class GenericsWarning {
    public static void main(String[] args) {
        List<Student> list = new ArrayList<Student>();
        list.add(new Student("Frank", 35));
        list.add(new Student("Tity", 3));
        Iterator<Student> elements = list.iterator();
        while (elements.hasNext()){
            
           System.out.println("Name is :  "+ elements.next().getName());
          
        
        }
    }
}
