
package jakirEx4;

import java.util.Scanner;

public class OddEvenNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number: ");
        int n = sc.nextInt();
        CheckOddEven(n);
    }
    private static void CheckOddEven(int n) {
        if(n%2==0){
            System.out.println("Is Even");
        
        }else{
            System.out.println("IS Odd");  
        }
    }
}
