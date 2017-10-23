
package jakir.comb;

import java.util.Scanner;

public class PrimeNumber5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Numbet");
        int n =sc.nextInt();
        Prime(n);
    }
    private static void Prime(int n) {
      int i, m=0, flag=1;
      m=n/2;
      if(n==0 || n==1){
          System.out.println("Not prime");
          flag=1;
      }else{
      }
    }
}
