
package Interface.com;

public class Account1 implements Balance1 {
    private double balance=500000.0;
    @Override
    public void deposit(double amount) {
       balance += amount;
    }

    @Override
    public void withdraw(double amount) {
      balance -= amount;  
    }

    @Override
    public double checkBalance() {
        return balance;
    }

}
