
package jakir.java12;

public class InterConnectedTest {
    public static void main(String[] args) {
        final Customer c = new Customer();
        new Thread(){
     public  void  run(){
     c.withdraw(20000);
     }
        
        }.start();
        new Thread(){
       public  void  run(){
     c.deposit(10000);  
        
        }
    }.start();
}
}