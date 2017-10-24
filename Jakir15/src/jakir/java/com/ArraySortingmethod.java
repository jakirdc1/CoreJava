
package jakir.java.com;

import java.util.Arrays;
import java.util.Scanner;

public class ArraySortingmethod {
    public static void main(String[] args) {
        
    
    Scanner sc = new Scanner(System.in);
    int[][] n = new int[3][3];
        System.out.println("Row 1");
         System.out.println("Enter Number");
         n[0][0] = sc.nextInt();
         System.out.println("Enter number");
         n[0][1] =sc.nextInt();
         System.out.println("Enter number");
          n[0][2] =sc.nextInt();
//          
//          System.out.println("Row 1");
//         System.out.println("Enter Number");
//         n[1][0] = sc.nextInt();
//         System.out.println("Enter number");
//         n[1][1] =sc.nextInt();
//         System.out.println("Enter number");
//          n[1][2] =sc.nextInt();
//         
//          System.out.println("Row 1");
//         System.out.println("Enter Number");
//         n[2][0] = sc.nextInt();
//         System.out.println("Enter number");
//         n[2][1] =sc.nextInt();
//         System.out.println("Enter number");
//          n[2][3] =sc.nextInt();
    }
    
    public static void sortingArray(int[][] n) {
        for(int[] d : n){
      Arrays.sort(d);
      for(int a : d){
          System.out.println(a +" ");
      }
        System.out.println();
        }
    }
}
