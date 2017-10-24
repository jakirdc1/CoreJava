
package Will.card235;

import java.util.List;

public class TestWildCard {
    public static void inserElement(List<? super A> list){
        
        list.add(new A());
        list.add(new B());
        list.add(new C());
      //  list.add(new D()); worng
    }
}
