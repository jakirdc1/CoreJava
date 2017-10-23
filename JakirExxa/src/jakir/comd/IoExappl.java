
package jakir.comd;

import java.io.*;


public class IoExappl {
    public static void main(String[] args) throws IOException {
        File f = new File("D:/Jakir1/text.text");
        f.createNewFile();
        
        Writer w = new FileWriter(f);
        BufferedWriter bw = new BufferedWriter(w);
        bw.write("Hello Bangladesh.");
        bw.close();
        
        Reader r = new FileReader(f);
        BufferedReader br = new BufferedReader(r);
        String s = null;
        while((s =br.readLine()) !=null){
            System.out.println(s);
        }
        
    }
}
