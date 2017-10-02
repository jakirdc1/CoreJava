
package Inheritance;

import java.util.Date;

public class ToString {
    public static void main(String[] args) {
        Date now = new Date();
        System.out.println(now);
        System.out.println("After using toString;"+now.toString ());
        
        ////////////////
        
        String x = "10";
        int y = Integer.parseInt(x);
        String z = Integer.toString(y);
        System.out.println("X as String: "+x);
         System.out.println("Y as String: "+y);
          System.out.println("Z as String: "+z);
    }
    
}
