
package Jakir.comE;

import java.util.Scanner;

public class Factorial {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Numbe");
        int n =sc.nextInt();
        CheckFactorial(n);
        System.out.println("Factorial"+n+"is:"+CheckFactorial(n));
    }

    private static int CheckFactorial(int n) {
        int result;
        if(n==0 || n==1){
        return 1;
      
    }
   result =   CheckFactorial(n-1)*n;
   return result;
    }
    
}
