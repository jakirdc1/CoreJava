
package Today;

public class OuterClass {
   //nested or inner class 
    public int x = 5;
    
    class InnerClass{
        
    public int x = 10;
    public void display(int x){
        System.out.println("This is: "+x);
        System.out.println("This.x  "+this.x);
        System.out.println("OuterClass.This.x: "+OuterClass.this.x);
    
    
    }
    }
    public static void main(String[] args) {
        OuterClass outer = new OuterClass();
        OuterClass.InnerClass inner = outer.new InnerClass();
        inner.display(15);
    }
}
