
package Jakir5;

import java.util.Comparator;
import java.util.TreeSet;
import sun.reflect.generics.tree.Tree;

public class ComparatorTest {
    public static void main(String[] args) {
        Comparator c = new NameCom();
        TreeSet studentSet = new TreeSet(c);
        
        studentSet.add(new Student("Jakir", "Hossain", 100, 4.0));
         studentSet.add(new Student("Jone", "TIOto", 101, 2.80));
          studentSet.add(new Student("Plank", "Hai", 102, 3.60));
           studentSet.add(new Student("Juny", "Grant", 103, 2.30));
           Object [] studentArray = studentSet.toArray();
           Student s;
           for(Object obj : studentArray){
           s = (Student) obj;
               System.out.println("==========output=============");
               System.out.println("FirstName   LastName   ID    GPA  ");
               System.out.println("       " +s.firstName()
                                   +"    "+s.lastName()
                                    +"   "+s.studentID()
                                    +"   "+s.GPA());
               System.out.println("...............End..........................");
            
           }
            
        
    }
}
