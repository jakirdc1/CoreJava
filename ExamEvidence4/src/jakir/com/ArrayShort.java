package jakir.com;

import java.util.Arrays;

public class ArrayShort {
    public static void main(String[] args) {
        int [][] data = {{20,21,32,45,11},{40,24,42,70,45}};
        System.out.println("========Table====");
        for(int[] d:data){
            Arrays.sort(d);
            for(int a:d){
                System.out.print(a+ "   ");
            }
            System.out.println("   "); 
        }
    }
}
