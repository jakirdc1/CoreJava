
package jakirEx4;

import java.util.Scanner;

public class PrimeNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number:");
        int n=sc.nextInt();
        Checkprime(n);
        
    }

    private static void Checkprime(int n) {
        int i, m=0, flag=0;
        m=n/2;
        if(n==0 || n==1){
            System.out.println("Not Prime");
            flag=1;
         
        }else{
        for(i=2;i<=m; i++){
        if(n%i== 0){
            System.out.println("Not Prime");
        flag=1;
        break;
        }
        }
        
        }
         if(flag ==0){
               
             System.out.println("Is Prime");       
               } 
         }
}
