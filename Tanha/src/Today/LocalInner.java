
package Today;

public class LocalInner {
    private int data = 30;
    int x = 20;
    double price =50000.0;
    void display(){
    class Local{
    
    void msg(){
        System.out.println("This is Data: "+data);
        System.out.println("That is..=======================");
        System.out.println("This is number: "+20);
         System.out.println("That is ..=======================");
          System.out.println("This is market price: "+price);
    }
    }
 Local l = new Local();
 l.msg();
   
    }
    public static void main(String[] args) {
      LocalInner obj = new LocalInner();
      obj.display();
    }
}
