
package jakir.java1;

public class SynchronizedBlockEx {
       public static void main(String args[]) {
        Datas obj = new Datas();//only one object  
        Thread1 t1 = new Thread1(obj);
        Thread2 t2 = new Thread2(obj);
        t1.start();
        t2.start();
}
}


