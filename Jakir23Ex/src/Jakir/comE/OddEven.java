
package Jakir.comE;

import java.util.Scanner;

public class OddEven {
static int n;
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Num");
        n=sc.nextInt();
        
        if(n%2==0){
            System.out.println(n+"is even");
        
        }else{
        System.out.println(n+"is ood");
        }
    }
  
}
