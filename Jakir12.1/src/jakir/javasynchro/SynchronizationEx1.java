
package jakir.javasynchro;

public class SynchronizationEx1 {
    synchronized  void printTable(int n){
    for(int i = 0; i<=5; i++){
            System.out.println(n * i);
            try {
                Thread.sleep(500);
            } catch (Exception e) {
                System.out.println(e);
            }
    }
}
}