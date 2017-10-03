
package Exam;

public class ExceptionEx {
    public static void main(String[] args) {
        System.out.println("Frist output");
        args = new String[5];
        args[0] = "1";
         args[1] = "two";
          args[2] = "3";
          args[3] = "Four";
          args[4] = "5";
          try {
            int sum = 0;
            for(String arg: args){
            
            sum += Integer.parseInt(arg);
            }
              System.out.println("This is :" + sum);
        } catch (Exception e) {
            System.out.println("============out====================");
              System.err.println("ExceptionEx is ocured");
        }
      System.out.println("This is exceptional ----------" );    
    }

   
 
}
