
package jakir.java1;

public class Thread1 extends Thread {
    Datas t;

    Thread1(Datas t) {
        this.t = t;
    }

    @Override
    public void run() {
        t.printTable(5);
    }
}

