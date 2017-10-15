
package jakir.java.com;

import java.util.Scanner;

public class ExampleSum {
    public static void Sum(int sn, int en){
    int sum = 0;
    if(sn<en){
    for(int i = sn; i<=en; i++){
    sum += i;
    }
    }else{
    for(int i = en; i<=sn; i++){
    sum +=i;
    }
    }
        System.out.println("The sum is:"+sum);
    }
    
  public static void main(String[] args) {
      Scanner sc = new Scanner(System.in);
        System.out.println("Enter number");
        int sn = sc.nextInt();
        System.out.println("Enter number");
        int en=sc.nextInt();
        Sum(sn,en);  
}  
}
