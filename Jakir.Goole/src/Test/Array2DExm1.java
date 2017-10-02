
package Test;

public class Array2DExm1 {
    public static void main(String[] args) {
        //Here 2 indicates Row and 3 3indicates column.
        int [][] array2D = {{1,2,3,4}, {5,6,7,8},{10,12,25,58,90}};
       
          
          for(int[] array1D : array2D){
          for(int item : array1D){
             // System.out.println("This is item:"+ item
                  //    System.out.println("===========================");
              System.out.print("   " +item);
          
          }
           System.out.println("    " );
           
          }
         
    }
    }

