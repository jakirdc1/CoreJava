
package Test;

public class Array2d {
    public static void main(String[] args) {
        //Here 2 indicates Row and 3 3indicates column.
        int [][] array2d = new int[2][3];
        //Row 1 data
        array2d[0][0] =1;
         array2d[0][1] =3;
          array2d[0][2] =5;
          
          //Row 2 data
          
          array2d[1][0] =2;
         array2d[1][1] =6;
          array2d[1][2] =9;
          
          for(int[] array1d : array2d){
          for(int item : array1d){
             // System.out.println("This is item:"+ item
                  //    System.out.println("===========================");
              System.out.println(item);
          
          }
          
          }
    }
    
}
