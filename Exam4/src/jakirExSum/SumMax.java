
package jakirExSum;

import java.util.Scanner;

public class SumMax {
    public static void main(String[] args) {
        int[] arr = new int[5];
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number:");
        arr[0] = sc.nextInt();
        arr[1] = sc.nextInt();
        arr[2] = sc.nextInt();
        arr[3] = sc.nextInt();
        arr[4] = sc.nextInt();
         int min = getmaxValue(arr);
        System.out.println("Max number: "+getmaxValue(arr));
    }

    private static int getmaxValue(int[] array) {
       
        int MaxValue = array[0];
        for(int i = 1; i<array.length; i++){
            if(array[i]>MaxValue){
                MaxValue = array[i];
            
            }
        }
        return MaxValue;
    
    
    
    }     
}
