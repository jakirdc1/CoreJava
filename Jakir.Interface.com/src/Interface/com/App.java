
package Interface.com;

public class App {
    public static void main(String[] args) {
       Account ac = new Account(500000.0, 300000.0, 600000.0);
        System.out.println("Your balance is :" + ac.blnce);
         System.out.println("Your deposit now :" + ac.deposit());
         System.out.println("Your withdraw is :" + ac.withdraw());
          System.out.println("Now balance is :" + ac.checkeBalance());
        
    }
    
}
