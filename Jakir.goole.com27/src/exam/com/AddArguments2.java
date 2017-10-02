
package exam.com;

public class AddArguments2 {
    public static void main(String[] args) {
        int sum = 0;
        args = new String[3];
        args[0] = "1";
         args[1] = "Two";
         //args[1]= "Two"; // to see exception
          args[2] = "3";
        try {
            for (String arg : args) {
            sum += Integer.parseInt(arg);
        }
          System.out.println("sum is: "+ sum);
        } catch (NumberFormatException nfe) {
            System.err.println("NumberFormatException is occurd ");
        }
        
}
}