
package jakir.javaField;

public class Simple1 {
    public static void main(String[] args) {
        boolean a= true;
        char b = 'a';
        byte c = 10;
        short d = (byte)15;
        int e = (int)50L; //casting
        long f = 50L;
        float g = 20.0056f;
        double h=60.546f;
        String name = "Jakir";//String is a class
        //wrapper class
        //Integer i = 25;
        int var = 60;
        Integer var1 = new Integer(var);  //wrapper class; boxting.
        int var2 = var1;//unboxing
      Integer var3 = var2;//autoboxting
      int var4 = var3;//autounboxing
    }
}
