
package jakirExSum;

import java.util.Scanner;

public class MinNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number:");
          int [] arr = new int[6];
        arr[0] =sc.nextInt();
        arr[1] =sc.nextInt();
        arr[2] =sc.nextInt();
        arr[3] =sc.nextInt();
        arr[4] =sc.nextInt();
        arr[5] =sc.nextInt();
        int min =getminValue(arr);
        System.out.println("Min number:" +getminValue(arr));
    }
    private static int getminValue(int [] array) {
        int minValue = array[0];
     for(int i = 1; i<array.length; i++){
     if(array[i]<minValue){
     minValue=array[i];
     }
     }   
        return minValue;
    }
}
