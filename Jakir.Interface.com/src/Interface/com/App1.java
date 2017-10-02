
package Interface.com;

public class App1 {
    public static void main(String[] args) {
      Account1 ac = new Account1();
      ac.deposit(300000);
      ac.withdraw(600000);
     double presentbalance = ac.checkBalance();
        System.out.println("Balance : " + presentbalance);
    }
}
