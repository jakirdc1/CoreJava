
package jakir.java.com;

import java.util.Scanner;

public class TestAssertion {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter ur age");
        
        int value = sc.nextInt();
        
        assert value>= 18: "Not value";
        
        System.out.println("value is :" +value);
    }
  
}
