
package jakir21;

import java.util.Arrays;
import java.util.Scanner;

public class ArraySortingExample {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int [][] n=new int[2][2];
        System.out.println("Enter num:");
        n[0][0] =sc.nextInt();
        System.out.println("Enter num:");
        n[0][1] =sc.nextInt();
        
        System.out.println("Enter num:");
        n[1][0] =sc.nextInt();
        System.out.println("Enter num:");
        n[1][1] =sc.nextInt();
        sorting(n);
    }
     public static void sorting(int [][] n){
         System.out.println("==============Array======================");
     for (int[] d:n){
         Arrays.sort(d);
     for(int a:d){
         System.out.print(a+ "    ");
     
     }
         
         System.out.println("     ");
     }
     
     }
}
