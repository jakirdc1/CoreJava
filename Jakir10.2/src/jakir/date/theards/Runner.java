
package jakir.date.theards;

public class Runner implements Runnable {
   
    public void run(){
    while (true){
        try {
            Thread.sleep(10);
        } catch (InterruptedException e) {
            break;
        }
    }
    }
        
    
    
}
