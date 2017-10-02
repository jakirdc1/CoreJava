
package exam.com;

public class Exception {
    public static void main(String[] args) {
       System.out.println("Hi lazy.............");
        try {
            
       
            int x = 10;
        int y = 0;
        
        System.out.println(x/y); 
      } catch (ArithmeticException e) {
          System.out.println("ArithmeticException is occured here");
        }
        
       
    }
}
