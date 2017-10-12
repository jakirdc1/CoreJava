
package jakir.java1;

public class Thread2 extends Thread{
   Datas t;

    Thread2(Datas t) {
        this.t = t;
    }

    public void run() {
        t.printTable(100);
    }
}  

