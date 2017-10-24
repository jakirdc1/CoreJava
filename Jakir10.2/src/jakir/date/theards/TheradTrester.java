
package jakir.date.theards;
public class TheradTrester {

    public static void main(String[] args) {
         HelloRunner r = new HelloRunner();
     
      // TheradTrester obj = new TheradTrester();//shamim
        Thread t = new Thread(r);
        t.start();
//        obj.run();
// Thread t1 = new Thread(r);
//        t1.start();
//        
//       Thread t2 = new Thread(r);//multipule threads
//        t2.start();

    }

    private void run() {
        int i = 0;
        while (true) {
            System.out.println("Hello " +  i++);
            if (i == 50) {
                break;

            }
        }
    }
}
