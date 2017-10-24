
package jakir.java.com;

import java.util.Scanner;

public class MinimamNumber {
    public static void main(String[] args) {
      int[] arr = new int[5];
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter number:");
        arr[0] = sc.nextInt();
         arr[1] = sc.nextInt();
          arr[2] = sc.nextInt();
           arr[3] = sc.nextInt();
            arr[4] = sc.nextInt();
            //int min =getminvalue(arr);
            System.out.println("Min Number: "+getminvalue(arr));
            // System.out.println("Min Number: "+min);
    }
    
    
    public static int getminvalue(int[] array) {
        int minValue = array[0];
        for(int i = 1; i< array.length; i++){
            if(array[i] < minValue){
            minValue = array[i];
            
            }
        
        }
       return minValue; 
    }
}
