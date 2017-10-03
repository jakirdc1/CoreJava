
package Exam;

public class App {
    public static void main(String[] args) {
        InterfaceB 
        ac = new InterfaceB(500000.0, 300000.0, 600000.0,200000.0);
                
        System.out.println("Your balance is :" + ac.blnce);
         System.out.println("===========================" );
        
         System.out.println("Your deposit now :" + ac.deposit());
          System.out.println("===========================" );
         
         System.out.println("Your withdraw is :" + ac.withdraw());
          System.out.println("===========================" );
         
          System.out.println("Now balance is :" + ac.checkeBalance());
           System.out.println("===========================" );
    }
}
