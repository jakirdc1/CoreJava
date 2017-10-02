
package Test;

public class Array3D {
    public static void main(String[] args) {
      //   int [][] array2D = {{1,2,3,4}, {5,6,7,8},{10,12,25,58,90}};
      int [][][] array3D ={
          {{1,2,3,4}, {5,6,7,8},{10,12,25,58,90}},
          {{8,2,5,1}, {9,6,7,3},{13,40,33,58,78}}
      };
      for (int[][] array2D : array3D){
       for(int[] array1D : array2D){
       for(int item : array1D){
           System.out.print("  "+item);
       System.out.print("======================================  ");
       }
           System.out.println(" ");
      }
        System.out.println("    ");
      }
    }
 
}
