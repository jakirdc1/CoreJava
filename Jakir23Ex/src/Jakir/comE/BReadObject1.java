
package Jakir.comE;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.ObjectInputStream;

public class BReadObject1 {
     public static void main(String[] args) {
        try{
            File tfile=new File("BookFile.txt");
            FileInputStream fis =new FileInputStream(tfile);
            ObjectInputStream ois =new ObjectInputStream(fis);
            Book bo=(Book)ois.readObject();
            Book boo=(Book)ois.readObject();
            System.out.println("Book is  :"+bo+"\n");
             System.out.println("Book id is  :"+boo.getId());
              System.out.println("Book name is  :"+boo.getName());
               System.out.println("Book published date is  :"+boo.getPublication());
                System.out.println("Book price is  :"+boo.getPrice());
        }catch(IOException ioe){
            System.out.println("IO Error");
        }catch(ClassNotFoundException cnfe){
            System.out.println("Class not found");
        }
    }
}
