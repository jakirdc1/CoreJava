
package jakir21;

import java.util.Arrays;

public class Array {
    public static void main(String[] args) {
        int[][] data = {{5,7,8,9,10,2},{10,5,9,3,7,20},{12,25,30,75,40}};
        System.out.println("Data Table");
        for(int[] d:data){
            Arrays.sort(d);
            for(int a:d){
                System.out.print(a+"  ");
            
            }
            System.out.println("    ");
        
        }
    }
 
}
