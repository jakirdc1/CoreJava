
package Jakir.comE;

import java.util.Scanner;

public class Pri {
    static int n;
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter num");
        n=sc.nextInt();
        int a =0;
        for(int i=1; i<=n; i++){
        if(n%i==0){
        a++;
        }
        
        }
        if(a==2){
            System.out.println("IS Prime");
        
        }else{
         System.out.println("IS  not Prime");
        }
                
    }
}
