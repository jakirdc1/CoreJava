
package jakir.com.date10;

import java.io.*;


public class FileIo  {
    public static void main(String[] args)throws IOException {
        File f = new File("E:/text.txt");
        File f2 = new File("E:/text2.txt");
        f.createNewFile();
        f.delete();
        f.renameTo(f2);
        try(BufferedWriter bw = new BufferedWriter(new FileWriter("E:/text2.txt"))) {
            bw.write("I love my village.");
            bw.newLine();
            bw.write("I love my baby.");
        } catch (Exception e) {
          
        }
    }
}
