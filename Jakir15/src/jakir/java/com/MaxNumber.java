
package jakir.java.com;

import java.util.Scanner;

public class MaxNumber {
 
public static void main(String[] args) {
      int[] arr = new int[5];
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter number:");
        arr[0] = sc.nextInt();
         arr[1] = sc.nextInt();
          arr[2] = sc.nextInt();
           arr[3] = sc.nextInt();
            arr[4] = sc.nextInt();
            int max = getmaxValue(arr);
            System.out.println("Max Number: "+max);
    }
    
    
    public static int getmaxValue(int[] array) {
        int maxValue = array[0];
        for(int i = 1; i< array.length; i++){
            if(array[i] > maxValue){
            maxValue = array[i];
            
            }
        
        }
       return maxValue; 
    }
}


