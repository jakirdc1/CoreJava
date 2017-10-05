package Jakir5.Gene;

import static java.lang.reflect.Array.set;
import java.util.HashSet;
import java.util.Set;

public class GenSetExample {

    public static void main(String[] args) {
        Set<String> st = new HashSet<String>();
        st.add("one");
        st.add("Second");
         st.add("3rd");//This line generator compile error
       // st.add(new Integer(4));
        //duplicate, not added
        st.add("second");
       st.add("one");//not double duplicate.
        System.out.println(st);
    }
}
