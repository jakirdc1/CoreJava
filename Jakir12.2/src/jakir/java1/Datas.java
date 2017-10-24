
package jakir.java1;

public class Datas {
      void  printTable(int n){
        synchronized(this){  //synchronizied block
        
        
        
        for( int i =0; i<=5; i++){
            System.out.println(n * i);
            try {
                Thread.sleep(500);
            } catch (Exception e) {
                System.out.println(e);
            }
        }
        }
    
    }
}

