
package jakir.java12;

public class Customer {
 double amount = 10000;
 synchronized  void  withdraw(double amount){
  System.out.println("============Output=======================");
     System.out.println("Going to withdraw .............");
     if(this.amount<amount){
         System.out.println("============Output=============");
         System.out.println("Less balance waiting for deposit........");
         try {
             wait();
         } catch (Exception e) {
         }
     
     }
     this.amount -=amount;
      System.out.println("************Output***************");
     System.out.println("Withdra completed..........");
 }
 synchronized  void  deposit(double amiunt){
      System.out.println("*****************Output*****************");
     System.out.println("Going  to deposit=====");
     this.amount += amiunt;
      System.out.println("============Output=============");
     System.out.println("Deposit completed========");
 notify();
 }
}
