
package Jakir.comE;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.util.Date;

public class BWriteObject {
   public static void main(String[] args) {
             Book b1=new Book(101,"Nodi",new Date(2011,12,25),250);
             Book b2=new Book(102,"Pani",new Date(2010,11,30),500);
        
        try{
          String add="BookFile.txt";
          File afile=new File(add);
          FileOutputStream fos=new FileOutputStream(afile);
          ObjectOutputStream oos=new ObjectOutputStream(fos);
          
              oos.writeObject(b1);
               oos.writeObject(b2);
            System.out.println("Object is seved");
            oos.flush();
            oos.close();
        }catch(IOException ioe){
            ioe.printStackTrace();
        }             
        }  
}
