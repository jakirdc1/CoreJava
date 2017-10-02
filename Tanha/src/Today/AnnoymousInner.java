
package Today;

public class AnnoymousInner {
    public static void main(String[] args) {
  
       B b = new B(){
          @Override
          public void displayMsg(){
    
        System.out.println("Hi, I am a Student Java");
    }  
       };
      b.displayMsg();
    }
    
}
