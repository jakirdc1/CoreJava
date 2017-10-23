
package jakir.comc;

import java.io.*;

public class IOEx {
   public static void main(String[] args) throws IOException{
        
        File f = new File("D:/Jakir/test1.txt");
        //File f2 = new File("D:/Jakir/test2.txt");
        f.createNewFile();
        //f.delete();
        //f.renameTo(f2);
        
//        Writer w = new FileWriter(f);
//        BufferedWriter bw = new BufferedWriter(w);
//        bw.write("Bangladesh is our country.");
//        bw.close();
        
        Reader r = new FileReader(f);
        BufferedReader br = new BufferedReader(r);
        String s = null;
        while((s = br.readLine()) != null){
            System.out.println(s);
        }
    }
} 

