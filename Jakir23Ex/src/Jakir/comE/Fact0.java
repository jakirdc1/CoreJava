
package Jakir.comE;

import java.util.Scanner;

public class Fact0 {
    static int n;
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter num");
        n=sc.nextInt();
        
        int  fact=1;
        for(int i=1;i<=n;i++){
            fact=fact*i;
        }
        System.out.println(n+" Factorial is "+fact);
}
}