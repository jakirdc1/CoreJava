
package jakir.java.com;

import java.util.Arrays;


public class ArraySorting {
    public static void main(String[] args) {
        int[][] data = {{10, 20, 30,15},
            {25, 26, 85},
            {20, 30, 28},
                {50, 100, 90}};
        System.out.println("Data table");
        for(int[] d:data){
    Arrays.sort(d);
    for(int a:d){
        System.out.println(a+ " ");
    
    }
            System.out.println();
    }
    }
}
