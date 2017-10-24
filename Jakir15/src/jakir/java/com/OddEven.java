
package jakir.java.com;

import java.util.Scanner;

public class OddEven {
    public static void main(String[] args) {
        
    
    Scanner s = new Scanner(System.in);
        System.out.println("Enter number");
        int n = s.nextInt();
        CheckOddEven(n);
}
    public static void CheckOddEven(int n){
    if(n%2 == 0){
            System.out.println(n +"Is Even Number");
    
    }else{
            System.out.println(n +"is odd Number");

}
}
}