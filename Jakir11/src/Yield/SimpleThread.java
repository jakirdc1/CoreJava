
package Yield;

public class SimpleThread {
    public static void main(String[] args) throws InterruptedException {
        Thread t = new Thread();
        t.start();
        t.sleep(2000);
        t.setName("I love my country");
        System.out.println("Thread Name:  "+t.getName());
        
    }
}
