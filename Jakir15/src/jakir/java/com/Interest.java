
package jakir.java.com;

import java.util.Scanner;



public class Interest {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in); 
        System.out.println("Welcome to calculate interrest");
         System.out.println("Write amoutn:");
         float amount =sc.nextFloat();
          System.out.println("Write rate");
          float rate =sc.nextFloat();
          System.out.println("Write annual time");
          float time =sc.nextFloat();
          float interest = calculateInterest(amount, rate, time);
          float ss = amount + interest;
          System.out.println("Simple interrest: "+interest+"int+amount"+ss);
         
    }
    public static float calculateInterest(float amount, float rate, float time) {
        float interest = (amount*rate*time)/100;
        return interest;
    }   
}
