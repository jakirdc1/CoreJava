
package jakir.com;

import java.util.Arrays;

public class ArrayShor {
    public static void main(String[] args) {
        int [][] data = {{5,9,32,50,},{8,9,25,16},{87,20, 30,60}};
        System.out.println("======Data Table======");
        for(int[] d:data){
        Arrays.sort(d);
        for(int a:d){
            System.out.print(a+"  ");
        }
            System.out.println("   ");
        }
    }
}
