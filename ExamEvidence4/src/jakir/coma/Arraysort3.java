package jakir.coma;

import java.util.Arrays;
import java.util.Scanner;

public class Arraysort3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int [][] n = new int [2][3];
        System.out.println("Row 1");
        
        System.out.println("Enter a number");
        n[0][0] =sc.nextInt();
        System.out.println("Enter a number");
        n[0][1] =sc.nextInt();
        System.out.println("Enter a number");
        n[0][2] =sc.nextInt();
        
        System.out.println("Row 2");
        
        System.out.println("Enter a number");
        n[1][0] =sc.nextInt();
        System.out.println("Enter a number");
        n[1][1] =sc.nextInt();
        System.out.println("Enter a number");
        n[1][2] =sc.nextInt();
        sorting(n);
    }

    private static void sorting(int[][] n) {
        System.out.println("==========Data=====");
        for(int [] d:n){
        Arrays.sort(d);
        for(int a:d){
            System.out.print(a+"  ");
        
        }
            System.out.println("   ");
        }
    }
  
}
