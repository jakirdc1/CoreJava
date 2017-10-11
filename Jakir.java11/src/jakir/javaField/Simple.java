
package jakir.javaField;

public class Simple {
    int x; //field or intance variable.
  
    static int b =50; // static variable or class variavle

    public Simple() {
    }

    public Simple(int x) {
        this.x = x;
    }
   void method(int x){ //paramiter variable
       int y = 10; // Local variable
       System.out.println(y);
       System.out.println(" The value of abc: "+x);
   }
    public static void main(String[] args) {
        int x = 15;
        Simple object = new Simple();
        System.out.println(object.x);
        object.method(20);
        System.out.println("The value of abc: "+ b);
    }
}


