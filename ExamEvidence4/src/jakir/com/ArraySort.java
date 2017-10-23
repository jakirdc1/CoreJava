
package jakir.com;

import java.util.Arrays;

public class ArraySort {
    public static void main(String[] args) {
        int[][] data = {{5,6,7,2,9},{9,1,7,2,5},{8,7,6,4,9}};
        System.out.println("======Output=========");
        for(int[] d:data){
            Arrays.sort(d);
            for(int j:d){
                System.out.print(j+ "  ");
            }
            System.out.println("   ");
        }
    }
}
